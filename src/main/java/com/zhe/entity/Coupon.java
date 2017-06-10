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

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Created by luyuanyuan on 2017/4/26.
 */
@Setter
@Getter
@Entity
public class Coupon implements Cloneable {

    /**
     * 优惠券id
     */
    @Id
    @Column(length = 100)
    private String couponId;

    /**
     * 创建时间
     */
    @Column(columnDefinition = "datetime")
    private LocalDateTime createTime;
    /**
     * 更新时间
     */
    @Column(columnDefinition = "datetime")
    private LocalDateTime updateTime;

    /**
     * 优惠券使用条件，如满100元减去50元
     */
    @Column(precision = 12, scale = 2)
    private BigDecimal reach;

    /**
     * 优惠卷金额
     * *满90元减60元
     * *10元无条件券
     */
    @Column(precision = 12, scale = 2)
    private BigDecimal discountAmount;

    /**
     * 优惠券面额
     */
    @Column(length = 100)
    private String coupon;

    /**
     * 优惠券开始时间
     */
    @Column(columnDefinition = "date")
    private LocalDate couponStartTime;
    /**
     * 优惠券结束时间
     */
    @Column(columnDefinition = "date")
    private LocalDate couponEndTime;

    /**
     * 优惠券链接
     */
    @Lob
    private String couponLink;
    /**
     * 优惠券总量
     */
    @Column
    private long couponCount;
    /**
     * 优惠券剩余量
     */
    @Column
    private long couponAmount;

    /**
     * 放弃状态，该状态为true的优惠券会排除在系统之外
     */
    private boolean disable;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coupon coupon = (Coupon) o;
        return Objects.equals(couponId, coupon.couponId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(couponId);
    }

    @Override
    public Coupon clone() throws CloneNotSupportedException {
        return (Coupon) super.clone();
    }
}
