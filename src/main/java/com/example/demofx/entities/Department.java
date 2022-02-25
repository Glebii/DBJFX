package com.example.demofx.entities;

import javafx.beans.property.*;

import java.util.Date;

public class Department {
    private String Dname ;
    private Integer Dnumber;
    private Long MgrSsn;
    private Date MgrStartDate;
    private String Year ;
    private String Month;
    private String Day;

    public Department(String dname,Integer dnumber, Long mgrSSn , Date mgrStartDate){
       this.Dname=dname;
       this.Dnumber=dnumber;
       this.MgrSsn=mgrSSn;
       this.MgrStartDate=mgrStartDate;
        this.Year = MgrStartDate.toString().substring(0,4);
        this.Month = MgrStartDate.toString().substring(5,7);
        this.Day = MgrStartDate.toString().substring(8);
    }

    public String getDname() {
        return Dname;
    }

    public void setDname(String dname) {
        Dname = dname;
    }

    public Integer getDnumber() {
        return Dnumber;
    }

    public void setDnumber(Integer dnumber) {
        Dnumber = dnumber;
    }

    public Long getMgrSsn() {
        return MgrSsn;
    }

    public void setMgrSsn(Long mgrSsn) {
        MgrSsn = mgrSsn;
    }

    public Date getMgrStartDate() {
        return MgrStartDate;
    }

    public void setMgrStartDate(Date mgrStartDate) {
        MgrStartDate = mgrStartDate;
    }
    public String getYear(){return Year;}

    public String getMonth(){return Month;}

    public String getDay(){return Day;}
}
