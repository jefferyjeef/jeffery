package com.example.demo;

public class User implements Person{
    private String personName;
    private int personAge;

    @Override
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Override
    public String getPersonName() {
        return this.personName;
    }

    @Override
    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    @Override
    public Integer getPersonAge() {
        return this.personAge;
    }
}