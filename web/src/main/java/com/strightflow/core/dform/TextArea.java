package com.strightflow.core.dform;

/**
 * Created by yermak on 23/5/14.
 */
public class TextArea extends FormElement{
    private String name;
    private String html;
    private String caption;

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
}
