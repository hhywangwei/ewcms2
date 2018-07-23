package com.appeme.server.ewcms.content.api.form;

import com.appeme.server.ewcms.api.validate.Update;
import com.appeme.server.ewcms.content.domain.Category;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CategoryForm {
    @NotNull(groups = Update.class)
    @Size(min = 1, groups = Update.class)
    private String id;
    @NotNull
    @Size(min = 1)
    private String name;
    private String icon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Category toDomain(){
        Category t = new Category();

        t.setId(id);
        t.setIcon(icon);
        t.setName(name);

        return t;
    }
}
