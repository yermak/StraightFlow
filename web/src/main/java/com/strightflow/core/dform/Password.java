package com.strightflow.core.dform;

/**
 * Created by yermak on 23/5/14.
 */
public class Password extends FormElement {
    private String id;

    @Override
    public String getType() {
        return "password";
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
