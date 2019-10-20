package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Car {

    @Id
    private String id;

    private String make;
    private String model;
    private String year;


    public Car() {
    }

    public Car(String id, String make, String model, String year) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
