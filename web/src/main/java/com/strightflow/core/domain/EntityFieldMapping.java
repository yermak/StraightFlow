package com.strightflow.core.domain;

import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

/**
 * Created by yermak on 1/5/14.
 */
public class EntityFieldMapping {

    @DBRef
    private List<EntityType> entityTypes;

    @DBRef
    private List<FieldType> fieldTypes;

    private List<Comment> comments;


    public List<EntityType> getEntityTypes() {
        return entityTypes;
    }

    public void setEntityTypes(List<EntityType> entityTypes) {
        this.entityTypes = entityTypes;
    }

    public List<FieldType> getFieldTypes() {
        return fieldTypes;
    }

    public void setFieldTypes(List<FieldType> fieldTypes) {
        this.fieldTypes = fieldTypes;
    }
}
