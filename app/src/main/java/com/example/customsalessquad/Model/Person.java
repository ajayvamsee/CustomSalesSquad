package com.example.customsalessquad.Model;

import java.lang.reflect.Array;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Person {

    // model class which a details for each person

    private String name;
    private String number;
    private ArrayList<String> callLog;
    private Date date;
    private Time time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ArrayList<String> getCallLog() {
        return callLog;
    }

    public void setCallLog(ArrayList<String> callLog) {
        this.callLog = callLog;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
