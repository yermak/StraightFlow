package com.strightflow.core.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by yermak on 1/5/14.
 */
@Document
public class FieldConfiguration {
    @Id
    private String id;

    private String name;

    private List<Comment> comments;

    @DBRef
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


}