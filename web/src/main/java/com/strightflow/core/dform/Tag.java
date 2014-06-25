package com.strightflow.core.dform;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yermak on 23/5/14.
 */
public class Tag extends FormElement {

    private Map<String, String> attributes = new HashMap<>();

    public Tag(String type) {
        this(type, null);
    }

    public Tag(String type, String html) {
        attributes.put("type", type);
        if (html != null) attributes.put("html", html);
    }

    @Override
    public String getType() {
        return attributes.get("type");
    }

}
