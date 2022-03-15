package com.perscholas.model;

import javax.persistence.*;

@Entity
@Table
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TeacherID_PK")
    private int tit;
    private String salary;//Why Salary data type is String?
    private String Teachername;


    @ManyToOne
    @JoinColumn(name = "department_id_FK")
    private Department Dep;

    public Teacher() {
    }


    public Department getDep() {
        return Dep;
    }

    public void setDep(Department dep) {
        Dep = dep;
    }

    public Teacher(int tit, String salary, String teachername, Department Dep) {
        this.tit = tit;
        this.salary = salary;
        this.Dep = Dep;
        Teachername = teachername;

    }

    public int getTit() {
        return tit;
    }

    public void setTit(int tit) {
        this.tit = tit;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getTeachername() {
        return Teachername;
    }

    public void setTeachername(String teachername) {
        Teachername = teachername;
    }
}