package com.studentmanagers;

import com.jicheng_teach_and_student.Student;

import java.util.Scanner;
import java.util.ArrayList;

public class StartMain {
    public static void main(String[] args) {
        //创建学生信息集合
        ArrayList<Student> array = new ArrayList<>();
        //给予默认的学生信息
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        Student st4 = new Student();
        st1.setName("张三");
        st1.setAge("18");
        st2.setName("李四");
        st2.setAge("17");
        st3.setName("王二");
        st3.setAge("16");
        st4.setName("麻子");
        st4.setAge("19");
        array.add(st1);
        array.add(st2);
        array.add(st3);
        array.add(st4);

        do {
            System.out.println("-------欢迎来到学生管理系统-------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");
            //创建 Scanner 系统输入对象
            Scanner sc1 = new Scanner(System.in);
            //避免乱输入，统一用String
            String xuanze = sc1.nextLine();
            if (xuanze.length() == 1) {
                char biaoshi = xuanze.charAt(0);
                //排除乱选项，只能是数字
                if (biaoshi >= '0' && biaoshi <= '9') {

                    if (biaoshi == '1') {
                        //添加学生
                        //创建学生对象并添加学生信息
                        Student st = new Student();
                        System.out.println("请输入学生的姓名:");
                        st.setName(sc1.nextLine());
                        System.out.println("请输入学生的年龄：");
                        st.setAge(sc1.nextLine());
                        //添加到学生集合当中
                        array.add(st);
                    } else if (biaoshi == '2') {
                        //删除学生
                        Student st = new Student();
                        System.out.println("请输入要删除的学生姓名:");
                        st.setName(sc1.nextLine());
                        System.out.println("请输入要删除的学生年龄：");
                        st.setAge(sc1.nextLine());
                        array.remove(st);
                    } else if (biaoshi == '3') {
                        //修改学生
                        Student st = new Student();
                        System.out.println("请输入要修改的学生姓名:");
                        st.setName(sc1.nextLine());
                        System.out.println("请输入要修改的学生年龄：");
                        st.setAge(sc1.nextLine());
                        //获取该学生在集合中的对应位置
                        int tmp = array.indexOf(st);
                        System.out.println("请输入要修改后的学生姓名:");
                        st.setName(sc1.nextLine());
                        System.out.println("请输入要修改后的学生年龄：");
                        st.setAge(sc1.nextLine());
                        array.set(tmp, st);
                        System.out.println("修改成功！");
                    } else if (biaoshi == '4') {
                        //查看所有学生
                        for (int x = 0; x < array.size(); x++) {
                            System.out.println("第" + (x + 1) + "位，学生姓名：" + array.get(x).getName() + ", 年龄：" + array.get(x).getAge());
                        }
                    } else if (biaoshi == '5') {
                        //退出
                        break;
                    } else {
                        System.out.println("请输入正确的选择，谢谢！");
                    }
                } else {
                    System.out.println("输入有误，请重新输入数字，谢谢！");
                }
            } else {
                System.out.println("输入有误，只能输入单个数字，谢谢！");
            }
        } while (true);

    }
}
