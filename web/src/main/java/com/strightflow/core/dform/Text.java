package com.strightflow.core.dform;

/**
 * Created by yermak on 23/5/14.
 */
public class Text extends FormElement {
    private String name;
    private String caption;
    private String value;
    private String id;

    public Text(String id, String name, String caption, String value) {
        this.id = id;
        this.name = name;
        this.caption = caption;
        this.value = value;
    }

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

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
