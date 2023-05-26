package com.test1;

import java.util.Scanner;

public class FengZhuangTest {
    private int a;
    private int b;
    private String c;

    //默认需要无参构造方法
    public FengZhuangTest() {
    }

    ;

    //带参构造方法
    public FengZhuangTest(int a, int b) {
        this.a = a;
        this.b = b;
    }

    //对于封装的成员变量提供get/set方法
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public String getC() {
        return "你输入的两数之和为：" + (a + b);
    }

}
