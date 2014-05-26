package com.strightflow.core.dform;

/**
 * Created by yermak on 23/5/14.
 */
public class Submit extends FormElement {
    private String value;

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
}
