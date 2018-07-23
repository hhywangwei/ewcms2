package com.appeme.server.ewcms.content.domain.embed;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class ArticleEmbed {
    private String id;
    private String icon;
    private String title;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("icon", icon)
                .append("title", title)
                .toString();
    }
}
