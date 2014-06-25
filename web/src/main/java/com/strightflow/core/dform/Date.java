package com.strightflow.core.dform;

/**
 * Created by yermak on 23/5/14.
 */
public class Date extends FormElement {

    private String id;

    @Override
    public String getType() {
        return "datepicker";
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
