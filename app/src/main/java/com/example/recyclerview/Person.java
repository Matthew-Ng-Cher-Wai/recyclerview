package com.example.recyclerview;

public class Person {

    String id;
    String First;
    String Last;
    int age;

    public Person( String First, String Last, int age) {
        this.First = First;
        this.Last = Last;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst() {
        return First;
    }

    public void setFirst(String first) {
        First = first;
    }

    public String getLast() {
        return Last;
    }

    public void setLast(String last) {
        Last = last;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
