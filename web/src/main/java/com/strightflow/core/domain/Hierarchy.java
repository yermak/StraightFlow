package com.strightflow.core.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

/**
 * Created by yermak on 18/5/14.
 */
public class Hierarchy {

    @Id
    private String id;

    private String name;

    private Node root;

    private static class Node {
        private List<Entity> children;
        private List<Comment> comments;
    }

    @DBRef
    private List<Namespace> namespaces;

}
