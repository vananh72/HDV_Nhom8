package com.example.task.model;


public class User  {

    private int id;
    private String name;
    private String address;
    private String gmail;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public User(int id, String name, String address, String gmail) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gmail = gmail;
    }
}