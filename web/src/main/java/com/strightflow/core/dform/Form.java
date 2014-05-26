package com.strightflow.core.dform;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yermak on 23/5/14.
 */
public class Form {
    private List<FormElement> formElements = new ArrayList<>();

    public void add(FormElement formElement) {
        formElements.add(formElement);
    }

    public List<FormElement> getFormElements() {
        return formElements;
    }

    public void setFormElements(List<FormElement> formElements) {
        this.formElements = formElements;
    }
}
