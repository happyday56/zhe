package com.zhe.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * 页面上展示的标签
 * Created by luyuanyuan on 2017/4/10.
 */
@Getter
@Setter
@Entity
@NoArgsConstructor
public class DisplayTag {
    /**
     * 标签名称
     */
    @Id
    @Column(unique = true, length = 100)
    private String name;

    @OneToMany(mappedBy = "displayTag")
    private Set<GoodsTag> goodsTags;

    public DisplayTag(String name) {
        this.name = name;
    }

    /**
     * 默认展示标签
     * @return 展示标签集合
     */
    public static Collection<DisplayTag> DefaultDisplayTag() {
        DisplayTag displayTag1 = new DisplayTag("女装");
        DisplayTag displayTag2 = new DisplayTag("男装");
        DisplayTag displayTag3 = new DisplayTag("内衣");
        DisplayTag displayTag4 = new DisplayTag("母婴");
        DisplayTag displayTag5 = new DisplayTag("美妆");
        DisplayTag displayTag6 = new DisplayTag("家居");
        DisplayTag displayTag7 = new DisplayTag("鞋包");
        DisplayTag displayTag8 = new DisplayTag("食品");
        DisplayTag displayTag9 = new DisplayTag("车品");
        DisplayTag displayTag10 = new DisplayTag("数码");
        DisplayTag displayTag11 = new DisplayTag("配饰");
        DisplayTag displayTag12 = new DisplayTag("家电");
        DisplayTag displayTag13 = new DisplayTag("其他");
        List<DisplayTag> list = new ArrayList<>();
        list.add(displayTag1);
        list.add(displayTag2);
        list.add(displayTag3);
        list.add(displayTag4);
        list.add(displayTag5);
        list.add(displayTag6);
        list.add(displayTag7);
        list.add(displayTag8);
        list.add(displayTag9);
        list.add(displayTag10);
        list.add(displayTag11);
        list.add(displayTag12);
        list.add(displayTag13);
        return list;
    }
}
