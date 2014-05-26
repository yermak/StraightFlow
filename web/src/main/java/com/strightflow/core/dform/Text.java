package com.strightflow.core.dform;

/**
 * Created by yermak on 23/5/14.
 */
public class Text extends FormElement {
    private String name;
    private String caption;
    private String value;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getCaption() {
        return caption;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String getType() {
        return "text";
    }
}
