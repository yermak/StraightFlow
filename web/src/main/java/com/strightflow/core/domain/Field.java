package com.strightflow.core.domain;

import java.util.List;

/**
 * Created by yermak on 30/4/14.
 */

public class Field {

    private String name;

    private FieldType type;

    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private List<Comment> comments;

    public FieldType getType() {
        return type;
    }

    public void setType(FieldType type) {
        this.type = type;
    }

    public void setDescription(String description) {

        this.description = description;
    }
}
