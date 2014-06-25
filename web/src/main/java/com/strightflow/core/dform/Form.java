package com.strightflow.core.dform;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yermak on 23/5/14.
 */
public class Form {

    private List<FormElement> formElements = new ArrayList<>();
    private Map<String, Object> parameters = new LinkedHashMap<>();

    public Form() {
        parameters.put("html", formElements);
    }

    public void add(FormElement formElement) {
        formElements.add(formElement);
    }

    public List<FormElement> getFormElements() {
        return formElements;
    }

    public void setFormElements(List<FormElement> formElements) {
        this.formElements = formElements;
    }

    public Map getParameters() {
        return parameters;
    }

    public void addParameter(String name, Object value) {
        parameters.put(name, value);
    }
}
