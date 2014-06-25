package com.strightflow.core.dform;

/**
 * Created by yermak on 23/5/14.
 */
public class Submit extends FormElement {
    private String name;
    private String value;
    private String id;

    public Submit(String id, String name, String value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    @Override
    public String getType() {
        return "submit";
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
