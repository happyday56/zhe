/*
 * 版权所有:杭州火图科技有限公司
 * 地址:浙江省杭州市滨江区西兴街道阡陌路智慧E谷B幢4楼
 *
 * (c) Copyright Hangzhou Hot Technology Co., Ltd.
 * Floor 4,Block B,Wisdom E Valley,Qianmo Road,Binjiang District
 * 2013-2017. All rights reserved.
 *
 */

package com.zhe.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import me.jiangcai.lib.resource.service.ResourceService;
import org.codehaus.plexus.util.StringUtils;

import javax.persistence.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by xyr on 2017/5/18.
 */
@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AbstractGoods extends BaseModel {

    /**
     * 商品id
     */
    @Column(unique = true, length = 100, name = "gid")
    private String goodsId;

    /**
     * 商品多图链接
     */
    @ElementCollection
    private List<String> goodsPrimaryImages;

    /**
     * 系统保存的商品多图链接
     */
    @ElementCollection
    @Column(length = 50)
    private List<String> goodsPrimaryImagesPath;

    /**
     * 营销图片路径
     */
    @Column(length = 50)
    private String marketingImage;

    /**
     * 商品来源
     */
    @Column(length = 20)
    private String fromWhere;

    /**
     * 商品来源网站详情链接
     */
    @Column
    private String originalInfoLink;

//    /**
//     * 优惠券使用条件，如满100元减去50元
//     */
//    @Column(precision = 12, scale = 2)
//    private BigDecimal reach;

    /**
     * 商品名称
     */
    @Column
    private String goodsName;
    /**
     * 商品价格(单位：元)
     */
    @Column(precision = 12, scale = 2)
    private BigDecimal price;
    /**
     * 商品主图
     * 这应该是一个完整的HTTP图片链接
     * 不应该直接调用该值获取图片而且，而应该用 {@link #toGoodsImageUrl(ResourceService)}代替
     */
    @Column
    private String goodsPrimaryImg;
    /**
     * 如果系统自行保留了该图片的地址，则此处保留资源path
     * TODO 删除商品时，请务必删除该资料
     *
     * @see me.jiangcai.lib.resource.service.ResourceService#getResource(String)
     */
    @Column(length = 50)
    private String goodsPrimaryImagePath;
    /**
     * 商品详情页链接地址
     */
    @Column
    private String goodInfoLink;
//    /**
//     * 商品一级类目
//     */
//    @Column(length = 50)
//    private String categoryName;
//    /**
//     * 商品标签
//     */
//    @Column
//    private String tags;

    /**
     * 商品月销量
     */
    @Column
    private long monthlySales;

    /**
     * 佣金比例
     */
    @Column(precision = 12, scale = 2)
    private BigDecimal commission;
    /**
     * 固定佣金实际金额，是一个可选属性；
     * 如果不存在该值，则以价格*比例获取
     * 单位:人民币。元
     * 不可直接访问
     */
    @Column(precision = 12, scale = 2)
    private BigDecimal stableCommission;

    /**
     * 平台类型
     */
    @Column
    private String platformName;

    /**
     * 所有优惠券，数据量庞大，请谨慎获取
     */
    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST})
    private Set<Coupon> coupons;

    /**
     * 推荐商品
     */
    @Column
    private boolean commodity;

    /**
     * 商品所属用户
     */
    @Column(length = 100)
    private String taobaoUsername;

    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
//    @JoinColumn
    private Set<GoodsTag> goodsTags;

//    /**
//     * 优惠券面额
//     */
//    @Column(length = 100)
//    private String coupon;

    /**
     * 商品简介
     */
    @Lob
    private String goodsIntro;

    /**
     * 佣金率定向计划文本
     */
    @Column(length = 100)
    private String goodsPlanText;

    /**
     * 佣金率定向计划审核文本（即自动通过/或人工审核）
     */
    @Column(length = 100)
    private String goodsPlanPassText;

    /**
     * 申请定向计划URL
     */
    @Column
    private String applyPlanUrl;

    public static BigDecimal discountAmountValue(String text) {
        BigDecimal discountAmount;
        if (text.indexOf("满") == 0) {
            String[] textArray = text.split("减");
            discountAmount = new BigDecimal(Double.valueOf(textArray[1].replace("元", "").trim()));
        } else {
            discountAmount = new BigDecimal(Double.valueOf(text.replace("元无条件券", "").trim()));
        }
        return discountAmount;
    }

    public static BigDecimal cutReach(String text) {
        BigDecimal reach;
        if (text.indexOf("满") == 0) {
            String[] textArray = text.split("减");
            reach = new BigDecimal(Double.valueOf(textArray[0].substring(textArray[0].indexOf("满") + 1, textArray[0].indexOf("元"))));
        } else {
            reach = new BigDecimal(Double.valueOf("0"));
        }
        return reach;
    }

    /**
     * @return 当前显示的优惠券；never null 除非根本没有优惠券
     */
    public Coupon getCurrentCoupon() {
        return getCurrentCoupon(false);
    }

    /**
     * @param couponId 优惠券id
     * @return 返回一个和couponId 相同的优惠券，如果没有，通过getCurrentCoupon()返回一个
     */
    public Coupon getCurrentCouponByCouponId(String couponId) {
        List<Coupon> couponList = this.getCoupons().stream().filter(x -> x.getCouponId().equals(couponId))
                .collect(Collectors.toList());
        if (couponList != null && couponList.size() == 1) {
            return couponList.get(0);
        } else {
            return getCurrentCoupon();
        }
    }

    /**
     * @param optional true 优先彻底排除没有使用价值的优惠券
     * @return 当前显示的优惠券; 如果optional为true 可能返回空
     */
    public Coupon getCurrentCoupon(boolean optional) {
        if (coupons.size() == 0)
            return null;

        final Stream<Coupon> sorted = coupons.stream()
                .sorted((o1, o2) -> o2.getDiscountAmount().compareTo(o1.getDiscountAmount()));

        Coupon defaultCoupon;
        if (optional)
            defaultCoupon = null;
        else
            defaultCoupon = coupons.stream().findAny().orElse(null);

        LocalDate now = LocalDate.now();

        return sorted
                .filter(coupon -> !coupon.isDisable())// 过滤已被声明放弃的优惠券
                .filter(coupon -> coupon.getCouponEndTime() == null || (coupon.getCouponEndTime()).isAfter(now))
                .filter(coupon -> coupon.getReach() == null || (this.price).compareTo(coupon.getReach()) >= 0)
                .findFirst()
                .orElse(defaultCoupon);
    }

    /**
     * @param resourceService 必须传入的资源服务
     * @return 图片链接
     * @throws IOException
     */
    public String toGoodsImageUrl(ResourceService resourceService) throws IOException {
        if (goodsPrimaryImagePath != null)
            return resourceService.getResource(goodsPrimaryImagePath).httpUrl().toString();
        return goodsPrimaryImg;
    }

    /**
     * @param resourceService 资源服务
     * @return 多图片数组
     * @throws IOException
     */
    public List<String> toGoodsImagesUrl(ResourceService resourceService) throws IOException {
        List<String> list = new ArrayList<>();
        if (goodsPrimaryImagesPath != null && getGoodsPrimaryImagesPath().size() > 0) {
            for (String path : goodsPrimaryImagesPath) {
                list.add(resourceService.getResource(path).httpUrl().toString());
            }
            return list;
        }
        return goodsPrimaryImages;
    }

    /**
     * @param resourceService 资源服务
     * @return 图片链接或多图链接
     * @throws IOException
     */
    public String toMarketingImageUrl(ResourceService resourceService) throws IOException {
        if (marketingImage != null) {
            return resourceService.getResource(marketingImage).httpUrl().toString();
        }
        return goodsPrimaryImg;
    }

    /**
     * 获取佣金的百分比
     *
     * @return 佣金的百分比包含%的
     */
    public String getCommissionPercent() {
        if (this.getCommission() == null)
            return new BigDecimal(0) + "%";
        else {
            //30.00
            String str = this.getCommission().multiply(new BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_UP).toString();
            String[] arr = str.split("\\.");
            if (arr.length > 1) {
                String _temp = arr[1];
                Integer i = Integer.valueOf(_temp);
                if (i > 0)
                    return str + "%";
                else {
                    return arr[0] + "%";
                }
            }
            return str + "%";
        }
    }

    /**
     * 获取佣金的百分比
     *
     * @return
     */
    public BigDecimal getCommissionDecimal() {
        if (this.getCommission() == null)
            return new BigDecimal(0);
        else {
            //30.00
            BigDecimal commissionDecimal = this.getCommission().multiply(new BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_UP);
            String str = commissionDecimal.toString();
            String[] arr = str.split("\\.");
            if (arr.length > 1) {
                String _temp = arr[1];
                Integer i = Integer.valueOf(_temp);
                if (i > 0)
                    return commissionDecimal;
                else {
                    return this.getCommission().multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP);
                }
            }
            return commissionDecimal;
        }
    }

    /**
     * @return 折后价
     */
    private Number getCouponPrice() {
        return price.subtract(getCurrentCoupon().getDiscountAmount());
    }

   /* public String getCouponAmountPercent() {
        return ((float) this.couponAmount * 100) / this.couponCount + "%";
    }*/

    @JsonProperty("tags")
    public String getTags() {
        return goodsTags.stream().map(GoodsTag::getName)
                .collect(Collectors.joining("/"));
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), this.getGoodsId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractGoods)) return false;
        AbstractGoods that = (AbstractGoods) o;
        return Objects.equals(this.getId(), that.getId()) &&
                Objects.equals(this.getGoodsId(), that.getGoodsId());
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId='" + goodsId + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodInfoLink='" + goodInfoLink + '\'' +
                "} " + super.toString();
    }

    //校验商品数据是否合法
    public boolean isEnabled() {

        boolean flag = true;
        //佣金比率不能为空
        if (commission == null) {
            flag = false;
        }
        //商品id不能为空
        if (StringUtils.isBlank(goodsId)) {
            flag = false;
        }
        //如果商品名称为""或者null
        if (!StringUtils.isNotBlank(goodsName)) {
            flag = false;
        }

        //校验商品价格是否为null
        if (price == null) {
            flag = false;
        }

        //商品主图不能为空
        if (!StringUtils.isNotBlank(goodsPrimaryImg)) {
            flag = false;
        }

        if (this instanceof Goods) {
            Coupon coupon = getCurrentCoupon();
            if (coupon == null) {
                flag = false;
            } else {
                //优惠券id不能为空
                if (org.springframework.util.StringUtils.isEmpty(coupon.getCouponId())) {
                    flag = false;
                }

                //优惠券地址不能为空
                if (org.springframework.util.StringUtils.isEmpty(coupon.getCouponLink())) {
                    flag = false;
                }

                //优惠券剩余数量少于5的不要
            /*if (couponAmount <= 5) {
                flag = false;
            }*/

                //优惠券价格不能大于商品的价格
//            if (coupon.getDiscountAmount().compareTo(price) > 0) {
//                flag = false;
//            }

                //优惠券结束时间要比当前时间大
                if (coupon.getCouponEndTime().compareTo(LocalDate.now()) <= 0) {
                    flag = false;
                }
                //券后价格不能小于等于0
//            if (getCouponPrice().doubleValue() <= 0) {
//                flag = false;
//            }

                //如果商品价格小于优惠券使用条件，则过滤
//            if (price.compareTo(coupon.getReach()) < 0) {
//                flag = false;
//            }
            }

        }


        //佣金比率大于等于1的商品过滤
        if (commission.doubleValue() >= 1) {
            flag = false;
        }

        //applyPlanUrl不可包含 item.taobao.com 不可包含 details.tmall.com
        if (applyPlanUrl != null && (applyPlanUrl.contains("item.taobao.com") || applyPlanUrl.contains("details.tmall.com"))) {
            flag = false;
        }
        // TODO 其他校验条件待确定

        return flag;
    }

    /**
     * 固定佣金实际金额，是一个可选属性；
     * 如果不存在该值，则以价格*比例获取
     * 单位:人民币。元
     * 不可直接访问
     */
    public BigDecimal getCommissionAmount() {
        return stableCommission != null ? stableCommission : price.multiply(commission);
    }

    /**
     * @return 用字符串描述佣金金额，该值保留2位小数点
     */
    public String getCommissionAmountAsString() {
        return getCommissionAmount().setScale(2, BigDecimal.ROUND_HALF_UP).toString();
    }

}
