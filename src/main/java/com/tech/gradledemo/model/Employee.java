package com.tech.gradledemo.model;

import javax.persistence.*;

@Entity
@Table(name = "TBL_EMP")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Long id;

    @Column(name = "NAME")
    String name;

    @Column(name = "DEPT")
    String deptName;

    public Employee() {

    }

    public Employee(String name, String deptName) {
        this.name = name;
        this.deptName = deptName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
