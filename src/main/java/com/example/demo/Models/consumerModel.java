// Dada Ki Jay Ho


package com.example.demo.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class consumerModel {

    public consumerModel() {
    }


    public consumerModel(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    private Integer id;
    public Integer getId() {
        return id;
    }
    private String name;
    private String email;

}
