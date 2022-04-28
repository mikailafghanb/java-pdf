package com.mandiri.entity;

import javax.persistence.*;

@Entity
@Table(name = "parameter")
public class Parameter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String param;

    private Integer x;
    private Integer y;
    private Integer size;

    public Parameter() {
    }

    public Integer getId() {
        return id;
    }

    public String getParam() {
        return param;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Integer getSize() {
        return size;
    }
}
