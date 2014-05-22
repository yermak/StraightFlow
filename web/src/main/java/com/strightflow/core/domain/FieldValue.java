package com.strightflow.core.domain;

/**
 * Created by yermak on 1/5/14.
 */
public class FieldValue {

    private Field field;

    private Object value;

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
