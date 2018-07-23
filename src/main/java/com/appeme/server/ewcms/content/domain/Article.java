package com.appeme.server.ewcms.content.domain;

import com.appeme.server.ewcms.content.domain.embed.ArticleEmbed;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

@Document(collection = "art_article")
@ApiModel("文章")
public class Article {
    @Id
    @ApiModelProperty(value = "编号", required = true)
    private String id;
    @Indexed(name = "idx_channel_id")
    @ApiModelProperty(value = "关联频道编号", required = true)
    private String channelId;
    @ApiModelProperty(value = "标题", required = true)
    private String title;
    @ApiModelProperty(value = "标题样式")
    private String titleCss;
    @ApiModelProperty(value = "短标题")
    private String shortTitle;
    @ApiModelProperty(value = "短标题样式")
    private String shortTitleCss;
    @ApiModelProperty(value = "子标题")
    private String subTitle;
    @ApiModelProperty(value = "子标题样式")
    private String subTitleCss;
    @ApiModelProperty(value = "作者")
    private String author;
    @ApiModelProperty(value = "来源")
    private String origin;
    @ApiModelProperty(value = "文章所属分类")
    private String[] categories;
    @ApiModelProperty(value = "关键字")
    private String[] keywords;
    @ApiModelProperty(value = "标签")
    private String[] tags;
    @ApiModelProperty(value = "文章摘要")
    private String summary;
    @ApiModelProperty(value = "文章内容")
    private String content;
    @ApiModelProperty(value = "文章图标")
    private String icon;
    @ApiModelProperty(value = "是否可以评论", notes = "true:可以评论")
    private Boolean comment;
    @ApiModelProperty(value = "文章类型", notes = "GENERAL:普通新闻,TITLE:标题新闻,IMAGES:图片新闻")
    private String genre;
    @ApiModelProperty(value = "创建者")
    private String created;
    @ApiModelProperty(value = "文章状态", notes = "DRAFT:初稿,REEDIT:重新编辑,REVIEW:审核中,REFUSE:审核拒绝,RELEASE:发布")
    private String state;
    @ApiModelProperty(value = "是否引用文章", notes = "true:引用")
    private Boolean reference;
    @ApiModelProperty(value = "排序")
    private Integer showOrder;
    @ApiModelProperty(value = "是否顶置", notes = "true:顶置")
    private Boolean top;
    @ApiModelProperty(value = "是否共享", notes = "true:共享")
    private Boolean share;
    @ApiModelProperty(value = "关联文章")
    private ArticleEmbed[] relations;
    @ApiModelProperty(value = "是否删除", notes = "true:删除")
    private Boolean delete;
    @Version
    private Integer version;
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleCss() {
        return titleCss;
    }

    public void setTitleCss(String titleCss) {
        this.titleCss = titleCss;
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    public String getShortTitleCss() {
        return shortTitleCss;
    }

    public void setShortTitleCss(String shortTitleCss) {
        this.shortTitleCss = shortTitleCss;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getSubTitleCss() {
        return subTitleCss;
    }

    public void setSubTitleCss(String subTitleCss) {
        this.subTitleCss = subTitleCss;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    public String[] getKeywords() {
        return keywords;
    }

    public void setKeywords(String[] keywords) {
        this.keywords = keywords;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Boolean getComment() {
        return comment;
    }

    public void setComment(Boolean comment) {
        this.comment = comment;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Boolean getReference() {
        return reference;
    }

    public void setReference(Boolean reference) {
        this.reference = reference;
    }

    public Integer getShowOrder() {
        return showOrder;
    }

    public void setShowOrder(Integer showOrder) {
        this.showOrder = showOrder;
    }

    public Boolean getTop() {
        return top;
    }

    public void setTop(Boolean top) {
        this.top = top;
    }

    public Boolean getShare() {
        return share;
    }

    public void setShare(Boolean share) {
        this.share = share;
    }

    public ArticleEmbed[] getRelations() {
        return relations;
    }

    public void setRelations(ArticleEmbed[] relations) {
        this.relations = relations;
    }

    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
        if (!(o instanceof Article)) return false;
        Article article = (Article) o;
        return Objects.equals(id, article.id) &&
                Objects.equals(channelId, article.channelId) &&
                Objects.equals(title, article.title) &&
                Objects.equals(titleCss, article.titleCss) &&
                Objects.equals(shortTitle, article.shortTitle) &&
                Objects.equals(shortTitleCss, article.shortTitleCss) &&
                Objects.equals(subTitle, article.subTitle) &&
                Objects.equals(subTitleCss, article.subTitleCss) &&
                Objects.equals(author, article.author) &&
                Objects.equals(origin, article.origin) &&
                Arrays.equals(categories, article.categories) &&
                Arrays.equals(keywords, article.keywords) &&
                Arrays.equals(tags, article.tags) &&
                Objects.equals(summary, article.summary) &&
                Objects.equals(content, article.content) &&
                Objects.equals(icon, article.icon) &&
                Objects.equals(comment, article.comment) &&
                Objects.equals(genre, article.genre) &&
                Objects.equals(created, article.created) &&
                Objects.equals(state, article.state) &&
                Objects.equals(reference, article.reference) &&
                Objects.equals(showOrder, article.showOrder) &&
                Objects.equals(top, article.top) &&
                Objects.equals(share, article.share) &&
                Arrays.equals(relations, article.relations) &&
                Objects.equals(delete, article.delete) &&
                Objects.equals(version, article.version) &&
                Objects.equals(updateTime, article.updateTime) &&
                Objects.equals(createTime, article.createTime);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(id, channelId, title, titleCss, shortTitle, shortTitleCss, subTitle, subTitleCss, author, origin, summary, content, icon, comment, genre, created, state, reference, showOrder, top, share, delete, version, updateTime, createTime);
        result = 31 * result + Arrays.hashCode(categories);
        result = 31 * result + Arrays.hashCode(keywords);
        result = 31 * result + Arrays.hashCode(tags);
        result = 31 * result + Arrays.hashCode(relations);
        return result;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("channelId", channelId)
                .append("title", title)
                .append("titleCss", titleCss)
                .append("shortTitle", shortTitle)
                .append("shortTitleCss", shortTitleCss)
                .append("subTitle", subTitle)
                .append("subTitleCss", subTitleCss)
                .append("author", author)
                .append("origin", origin)
                .append("categories", categories)
                .append("keywords", keywords)
                .append("tags", tags)
                .append("summary", summary)
                .append("content", content)
                .append("icon", icon)
                .append("comment", comment)
                .append("genre", genre)
                .append("created", created)
                .append("state", state)
                .append("reference", reference)
                .append("showOrder", showOrder)
                .append("top", top)
                .append("share", share)
                .append("relations", relations)
                .append("delete", delete)
                .append("version", version)
                .append("updateTime", updateTime)
                .append("createTime", createTime)
                .toString();
    }
}
