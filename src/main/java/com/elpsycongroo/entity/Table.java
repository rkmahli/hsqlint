package com.elpsycongroo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@javax.persistence.Table(name="table")
public class Table {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;

    String data;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId () {
        return this.id;
    }

    public void setData (String data) {
        this.data = data;
    }

    public String getData () {
        return this.data;
    }
}
