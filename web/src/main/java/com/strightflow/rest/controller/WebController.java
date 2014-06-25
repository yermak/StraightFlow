package com.strightflow.rest.controller;

import com.strightflow.core.dform.Form;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by yermak on 29/5/14.
 */
public class WebController {

    protected Form createDForm(final String title) {
        Form form = new Form();
        form.addParameter("action", "");
        form.addParameter("method", "post");
        form.addParameter("dialog", new HashMap<String, String>() {
            {
                put("modal", "true");
                put("title", title);
            }
        });
        return form;
    }
}
