/*
 * 版权所有:杭州火图科技有限公司
 * 地址:浙江省杭州市滨江区西兴街道阡陌路智慧E谷B幢4楼
 *
 * (c) Copyright Hangzhou Hot Technology Co., Ltd.
 * Floor 4,Block B,Wisdom E Valley,Qianmo Road,Binjiang District
 * 2013-2017. All rights reserved.
 */

package com.zhe.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * 商品标签
 * Created by lhx on 2017/2/27.
 */
@Getter
@Setter
@Entity
@NoArgsConstructor
public class GoodsTag {
    /**
     * 标签名称
     */
    @Id
    @Column(unique = true, length = 100)
    private String name;


    @ManyToOne(cascade = {CascadeType.MERGE})
    @JsonBackReference
    private DisplayTag displayTag;


    public GoodsTag(String name) {
        this.name = name;
    }
    
}
