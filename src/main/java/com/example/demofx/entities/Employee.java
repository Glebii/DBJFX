package com.example.demofx.entities;

import java.util.Date;


public class Employee {
    private String Fname;
    private String Lname;
    private Integer Ssn;
    private Date Bdate;
    private String Address;
    private String Sex;
    private Integer Salary;
    private Long Superssn;
    private Integer Dnumber;
    private String Year ;
    private String Month;
    private String Day;

    public Employee(String fname,
                    String lname,
                    Integer ssn,
                    Date bdate,
                    String address,
                    String sex,
                    Integer salary,
                    Long superSsn,
                    Integer dnumber) {
        this.Fname = fname;
        this.Lname = lname;
        this.Ssn = ssn;
        this.Bdate = bdate;
        this.Address = address;
        this.Sex = sex;
        this.Salary = salary;
        this.Superssn = superSsn;
        this.Dnumber = dnumber;
        this.Year = Bdate.toString().substring(0,4);
        this.Month = Bdate.toString().substring(5,7);
        this.Day = Bdate.toString().substring(8);
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public Integer getSsn() {
        return Ssn;
    }

    public void setSsn(Integer ssn) {
        Ssn = ssn;
    }

    public Date getBdate() {
        return Bdate;
    }

    public String getYear(){return Year;}

    public String getMonth(){return Month;}

    public String getDay(){return Day;}


    public void setBdate(Date bdate) {
        Bdate = bdate;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public Integer getSalary() {
        return Salary;
    }

    public void setSalary(Integer salary) {
        Salary = salary;
    }

    public Long getSuperssn() {
        return Superssn;
    }

    public void setSuperssn(Long super_ssn) {
        Superssn = super_ssn;
    }

    public Integer getDnumber() {
        return Dnumber;
    }

    public void setDnumber(Integer dnumber) {
        Dnumber = dnumber;
    }
}
