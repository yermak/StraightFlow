package com.strightflow.core.domain;

import org.springframework.data.annotation.Id;

/**
 * Created by yermak on 1/5/14.
 */
public class FieldValue {

    @Id
    private String id;

    private Field field;

    private Object value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
