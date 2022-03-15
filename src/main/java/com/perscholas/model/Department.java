package com.perscholas.model;

import javax.persistence.*;

@Entity
@Table
public class Department {
    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private int did;
    private String dname;

    public Department() {
    }

    public Department(int did, String dname) {
        this.did = did;
        this.dname = dname;
    }


    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
