package com.strightflow.core.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

/**
 * Created by yermak on 5/5/14.
 */
public class Scope {

    @Id
    private String id;

    private List<Scope> nestedScopes;

    private String name;

    private String type;

    private List<FieldValue> fieldsValues;

    @DBRef
    private List<Namespace> namespaces;

}
