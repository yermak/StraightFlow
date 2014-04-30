package com.strightflow.core.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by yermak on 29/4/14.
 */
@Document
public class Namespace {

    @Id
    private String id;

    private String name;

    private String code;

    private String description;

    @DBRef
    private List<FieldConfiguration> fieldConfigurations;

    @DBRef
    private List<EntityConfiguration> entityConfigurations;

    @DBRef
    private List<EntityFieldMapping> entityFieldMappings;


    public List<EntityFieldMapping> getEntityFieldMappings() {
        return entityFieldMappings;
    }

    public void setEntityFieldMappings(List<EntityFieldMapping> entityFieldMappings) {
        this.entityFieldMappings = entityFieldMappings;
    }

    public List<FieldConfiguration> getFieldConfigurations() {
        return fieldConfigurations;
    }

    public void setFieldConfigurations(List<FieldConfiguration> fieldConfigurations) {
        this.fieldConfigurations = fieldConfigurations;
    }

    public List<EntityConfiguration> getEntityConfigurations() {
        return entityConfigurations;
    }

    public void setEntityConfigurations(List<EntityConfiguration> entityConfigurations) {
        this.entityConfigurations = entityConfigurations;
    }

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Namespace{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
