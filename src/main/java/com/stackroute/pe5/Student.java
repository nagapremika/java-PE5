package com.stackroute.pe5;


public class Student {          //Student class with variables,setters,getters and constructor
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    private String id;      //Instance Variables
    private String name;
    private String age;
    public Student(String id, String name, String age)
    {
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public String toString()        //Overrides toString() method
    {
        return id+" "+name+" "+age;
    }
}


