package com.flipkart.mc.entity;

import com.flipkart.mc.util.IdGenerator;

public class Topic {
    private String id;
    private String name;

    public Topic(String name) {
        this.id = IdGenerator.generateId();
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
