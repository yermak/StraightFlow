package com.strightflow.core.dform;

/**
 * Created by yermak on 23/5/14.
 */
public abstract class FormElement {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public abstract String getType();
}
