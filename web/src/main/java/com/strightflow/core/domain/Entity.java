package com.strightflow.core.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by yermak on 29/4/14.
 */
@Document
public class Entity {
    @Id
    private String id;

    @DBRef
    private EntityType type;

    private List<FieldValue> fieldsValues;

    private Integer version;

    private List<Comment> comments;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EntityType getType() {
        return type;
    }

    public void setType(EntityType type) {
        this.type = type;
    }

    public List<FieldValue> getFieldsValues() {
        return fieldsValues;
    }

    public void setFieldsValues(List<FieldValue> fieldsValues) {
        this.fieldsValues = fieldsValues;
    }
}
