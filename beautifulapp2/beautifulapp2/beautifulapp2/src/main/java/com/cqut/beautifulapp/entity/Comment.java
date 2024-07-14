package com.cqut.beautifulapp.entity;

import java.io.Serializable;

/**
 * (Comment)实体类
 *
 * @author makejava
 * @since 2022-07-09 22:01:03
 */
public class Comment implements Serializable {
    private static final long serialVersionUID = 914759248957578707L;
    /**
     * 第几条评论
     */
    private Integer id;
    /**
     * 评论内容
     */
    private String content;
    /**
     * 里面存储技师id用于表示对哪个技师进行评价
     */
    private String towhom;
    /**
     * 评论作者名称
     */
    private String author;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTowhom() {
        return towhom;
    }

    public void setTowhom(String towhom) {
        this.towhom = towhom;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}

