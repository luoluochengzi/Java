package com.jicheng_teach_and_student;

public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        Teacher te = new Teacher();
        st.setName("hj");
        st.setAge("18");
        te.setName("yzw");
        te.setAge("20");
        st.show();
        te.show();

    }
}
