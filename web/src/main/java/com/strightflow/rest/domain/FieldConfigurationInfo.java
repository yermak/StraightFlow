package com.strightflow.rest.domain;

import com.strightflow.core.domain.Comment;
import com.strightflow.core.domain.Field;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yermak on 22/5/14.
 */
public class FieldConfigurationInfo {

    private String id;

    private String name;

    private List<Comment> comments;

    private List<Field> fields = new ArrayList<Field>();

}
