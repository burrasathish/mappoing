package com.mountblue.RestApi.Entity;

import javax.persistence.*;

@Entity(name = "Laptop")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name="l_id")
    private int id;
    private String lname;

    public int getLid() {
        return id;
    }

    public void setLid(int id) {
        this.id = id;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
