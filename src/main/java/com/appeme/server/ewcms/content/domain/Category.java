package com.appeme.server.ewcms.content.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Objects;

@Document(collection = "art_category")
@ApiModel("文章分类")
public class Category {
    @Id
    @ApiModelProperty(value = "编号", required = true)
    private String id;
    @ApiModelProperty(value = "分类图标")
    private String icon;
    @ApiModelProperty(value = "分类名称", required = true)
    private String name;
    @ApiModelProperty(value = "创建时间", required = true)
    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category)) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id) &&
                Objects.equals(icon, category.icon) &&
                Objects.equals(name, category.name) &&
                Objects.equals(createTime, category.createTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, icon, name, createTime);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("icon", icon)
                .append("name", name)
                .append("createTime", createTime)
                .toString();
    }
}
