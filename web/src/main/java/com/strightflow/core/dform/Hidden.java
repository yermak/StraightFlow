package com.strightflow.core.dform;

/**
 * Created by yermak on 23/5/14.
 */
public class Hidden extends FormElement {
    private String value;
    private String name;
    private String id;

    public Hidden(String id, String name, String value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "hidden";
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
