package com.strightflow.rest.domain;

import org.springframework.hateoas.ResourceSupport;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by yermak on 29/4/14.
 */

@XmlRootElement
public class Entity extends ResourceSupport implements Serializable {

    @XmlElement
    private String id;

}
