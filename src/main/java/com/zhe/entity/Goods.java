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

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 商品表
 * Created by lhx on 2017/2/20.
 */
@Setter
@Getter
@Entity
@Table(name = "goods")
public class Goods extends AbstractGoods {


    /**
     * 推荐优惠券
     * 数据入口：查询没有推荐优惠券的，分配之
     * 数据出口：查询有推荐优惠券已经不符合要求的
     */
    @ManyToOne
    private Coupon recommendCoupon;

}
