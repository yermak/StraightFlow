package com.strightflow.rest.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by yermak on 29/4/14.
 */

@XmlRootElement
public class Namespace {

    @XmlElement
    private String id;

    @XmlElement
    private String name;

    @XmlElement
    private String code;

    @XmlElement
    private String description;


}
