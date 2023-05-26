package com.jicheng_teach_and_student;

public class Student extends People {
    @Override
    public void show() {
        System.out.println(super.getName() + "好好学习，他才" + super.getAge() + "岁");
    }
}
