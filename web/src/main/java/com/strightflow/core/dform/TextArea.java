package com.strightflow.core.dform;

/**
 * Created by yermak on 23/5/14.
 */
public class TextArea extends FormElement{
    private String name;
    private String html;
    private String caption;
    private String id;


    public TextArea(String id, String name, String caption, String value) {
        this.id = id;
        this.name = name;
        this.caption = caption;
        this.html = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getHtml() {
        return html;
    }

    public String getType(){
        return "textarea";
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getCaption() {
        return caption;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
