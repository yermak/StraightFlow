package com.strightflow.core.domain;

import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by yermak on 1/5/14.
 */
public class Comment {

    @Id
    private String id;

    private Date date;

    private String text;

    private String author;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
