package com.studentmanagers;

public class Student {
    private String sid;
    private String name;
    private String age;
    private String address;

    //alt + inster 快捷键快速生成构造方法
    public Student() {
    }


    public Student(String sid, String name, String age, String address) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
/*public Student() {
    }

    public Student(String sid, String name, String age) {
        this.sid = sid;
        this.name = name;
        this.age = age;
    }

    public void setSid(String sid) {
        this.sid = sid;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSid() {
        return sid;
    }

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }*/

    //
}

