package com.strightflow.rest.domain;

import com.strightflow.core.domain.Comment;
import com.strightflow.core.domain.Field;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yermak on 22/5/14.
 */
public class FieldConfigurationInfo {

    private String id;

    private String name;

    private String description;

    private List<Comment> comments;

    private List<Field> fields;

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

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
