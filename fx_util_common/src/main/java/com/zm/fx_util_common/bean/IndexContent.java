package com.zm.fx_util_common.bean;

import java.io.Serializable;
import java.util.Date;

public class IndexContent  implements Serializable {
    private Long id;

    private Long parentid;

    private String name;

    private String title;

    private String img;

    private String url;

    private String describle;

    private Date updated;

    private Date created;

    private ContentCategory contentCategory;

    public ContentCategory getContentCategory() {
        return contentCategory;
    }

    public void setContentCategory(ContentCategory contentCategory) {
        this.contentCategory = contentCategory;
    }

    public IndexContent(Long id, Long parentid, String name, String title, String img, String url, String describle, Date updated, Date created, ContentCategory contentCategory) {
        this.id = id;
        this.parentid = parentid;
        this.name = name;
        this.title = title;
        this.img = img;
        this.url = url;
        this.describle = describle;
        this.updated = updated;
        this.created = created;
        this.contentCategory = contentCategory;
    }

    @Override
    public String toString() {
        return "IndexContent{" +
                "id=" + id +
                ", parentid=" + parentid +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", img='" + img + '\'' +
                ", url='" + url + '\'' +
                ", describle='" + describle + '\'' +
                ", updated=" + updated +
                ", created=" + created +
                ", contentCategory=" + contentCategory +
                '}';
    }

    public IndexContent() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getDescrible() {
        return describle;
    }

    public void setDescrible(String describle) {
        this.describle = describle;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}