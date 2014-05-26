package com.strightflow.core.dform;

/**
 * Created by yermak on 23/5/14.
 */
public class Hidden extends FormElement {
    private String value;
    private String name;

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
}
