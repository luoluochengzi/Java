package com.jicheng_teach_and_student;

public class Teacher extends People{
    @Override
    public void show(){
        System.out.println(super.getName() + "好好教书，他才" + super.getAge() + "岁");
    }
}
