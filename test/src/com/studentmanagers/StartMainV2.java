package com.studentmanagers;


import java.util.ArrayList;
import java.util.Scanner;

public class StartMainV2 {
    public static void main(String[] args) {
        //学生基础信息
        ArrayList<Student> arrray = studentList();
        ArrayList<String> arrraysid = studentSid();
        /*for(int x = 0 ; x< arrray.size();x++){
            System.out.println(arrray.get(x));
        }*/
        do {
            System.out.println("-------欢迎来到学生管理系统-------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");
            //创建 Scanner 系统输入对象
            Scanner sc = new Scanner(System.in);
            //避免乱输入，统一用String
            String xuanze = sc.nextLine();
            if (xuanze.length() == 1) {
                char biaoshi = xuanze.charAt(0);
                //排除乱选项，只能是数字
                if (biaoshi >= '0' && biaoshi <= '9') {
                    if (biaoshi == '1') {
                        System.out.println("请输入学生的学号：");
                        String sid = sc.nextLine();
                        System.out.println("请输入学生的姓名：");
                        String name = sc.nextLine();
                        System.out.println("请输入学生的年龄：");
                        String age = sc.nextLine();
                        System.out.println("请输入学生的居住地：");
                        String address = sc.nextLine();
                        if (addStuednt(sid, name, age, address, arrray, arrraysid)) {
                            System.out.println("添加成功！正在为你返回首页");
                        } else {
                            System.out.println("添加失败，存在重复的学号信息！正在为你返回首页");
                        }
                    } else if (biaoshi == '2') {
                        System.out.println("请输入学生的学号：");
                        String sid = sc.nextLine();
                        if (deleteStuednt(sid, arrray, arrraysid)) {
                            System.out.println("删除成功！正在为你返回首页");
                        } else {
                            System.out.println("删除失败，不存在该学号,正在为你返回首页");
                        }
                    } else if (biaoshi == '3') {
                        System.out.println("请输入学生的学号：");
                        String sid = sc.nextLine();
                        System.out.println("请输入学生的姓名：");
                        String name = sc.nextLine();
                        System.out.println("请输入学生的年龄：");
                        String age = sc.nextLine();
                        System.out.println("请输入学生的居住地：");
                        String address = sc.nextLine();
                        if (updateStuednt(sid, name, age, address, arrray, arrraysid)) {
                            System.out.println("修改成功！正在为你返回首页");
                        } else {
                            System.out.println("修改失败，不存在该学号,正在为你返回首页");
                        }
                    } else if (biaoshi == '4') {
                        selectStudent(arrray, arrraysid);
                    } else if (biaoshi == '5') {
                        //退出
                        System.out.println("欢迎使用，再见~");
                        //break;
                        System.exit(0);//JVM虚拟机退出，break只能退出当前循环语句，System.exit(0)直接退出JVM虚拟机
                    } else {
                        System.out.println("请输入正确的选择，谢谢！正在为你返回首页");
                    }
                } else {
                    System.out.println("输入有误，请重新输入数字，谢谢！正在为你返回首页");
                }
            } else {
                System.out.println("输入有误，只能输入单个数字，谢谢！正在为你返回首页");
            }
        } while (true);

    }

    public static class Student {
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
    }

    //学生基础信息
    public static ArrayList<Student> studentList() {
        //创建学生信息基础集合
        ArrayList<Student> array = new ArrayList<>();
        //给予默认的学生信息
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        Student st4 = new Student();
        Student st5 = new Student();
        Student st6 = new Student();
        st1.setName("张三");
        st1.setAge("18");
        st1.setAddress("上海");
        st2.setName("李四");
        st2.setAge("17");
        st2.setAddress("北京");
        st3.setName("王二");
        st3.setAge("16");
        st3.setAddress("广州");
        st4.setName("麻子");
        st4.setAge("19");
        st4.setAddress("深圳");
        array.add(st1);
        array.add(st2);
        array.add(st3);
        array.add(st4);
        st5.setName("黄胖胖");
        st5.setAge("18");
        st5.setAddress("江西抚州");
        array.add(st5);
        st6.setName("余瘦瘦");
        st6.setAge("18");
        st6.setAddress("江西抚州");
        array.add(st6);
        return array;
    }

    //学生学号信息
    public static ArrayList<String> studentSid() {
        //创建对应的学生学号集合
        ArrayList<String> arraysid = new ArrayList<>();
        arraysid.add("001");
        arraysid.add("002");
        arraysid.add("003");
        arraysid.add("004");
        arraysid.add("005");
        arraysid.add("006");
        return arraysid;
    }

    //添加学生 输入学号，姓名，年龄，居住地，返回结果
    public static boolean addStuednt(String sid, String name, String age, String address, ArrayList<Student> array, ArrayList<String> arraysid) {
        //创建学生对象
        Student st = new Student();
        st.setSid(sid);
        st.setName(name);
        st.setAge(age);
        st.setAddress(address);
        //判断是否重复
        if (arraysid.contains(st.getSid())) {
            return false;
        } else {
            arraysid.add(st.getSid());
            array.add(st);
            return true;
        }
    }

    //删除学生 输入要删除学号，返回结果
    public static boolean deleteStuednt(String sid, ArrayList<Student> array, ArrayList<String> arraysid) {
        //先判断是否存在
        if (arraysid.contains(sid)) {
            //获取对应的下标索引位,通过下标位置去删除学生信息
            array.remove(arraysid.indexOf(sid));
            arraysid.remove(sid);
            return true;
        } else {
            return false;
        }
    }
    //修改学生 输入要修改的学号，姓名，年龄，居住地 返回结果

    public static boolean updateStuednt(String sid, String name, String age, String address, ArrayList<Student> array, ArrayList<String> arraysid) {
        //先判断是否存在
        if (arraysid.contains(sid)) {
            Student st = new Student();
            st.setSid(sid);
            st.setName(name);
            st.setAge(age);
            st.setAddress(address);
            //获取对应的下标索引位,通过下标位置去删除学生信息
            array.set(arraysid.indexOf(sid), st);
            return true;
        } else {
            return false;
        }
    }

    //查看学生 直接返回遍历结果
    public static void selectStudent(ArrayList<Student> array, ArrayList<String> arraysid) {
        /*StringBuilder zhiduan1 = new StringBuilder("          ");
        StringBuilder zhiduan2 = new StringBuilder("          ");
        StringBuilder zhiduan3 = new StringBuilder("          ");
        StringBuilder zhiduan4 = new StringBuilder("          ");
        String str1 = "学号";
        String str2 = "姓名";
        String str3 = "年龄";
        String str4 = "居住地";
        zhiduan1.replace(0, str1.length(), str1);
        zhiduan2.replace(0, str2.length(), str2);
        zhiduan3.replace(0, str3.length(), str3);
        zhiduan4.replace(0, str4.length(), str4);
        System.out.println("" + zhiduan1 + zhiduan2 + zhiduan3 + zhiduan4);*/
        System.out.println("学号\t姓名\t年龄\t居住地");
        for (int x = 0; x < arraysid.size(); x++) {
            /*StringBuilder zhiduan5 = new StringBuilder("          ");
            StringBuilder zhiduan6 = new StringBuilder("          ");
            StringBuilder zhiduan7 = new StringBuilder("          ");
            StringBuilder zhiduan8 = new StringBuilder("          ");
            zhiduan5.replace(0, arraysid.get(x).length()-1, arraysid.get(x));
            zhiduan6.replace(0, array.get(x).getName().length()-1, array.get(x).getName());
            zhiduan7.replace(0, array.get(x).getAge().length()-1, array.get(x).getAge());
            zhiduan8.replace(0, array.get(x).getAddress().length()-1, array.get(x).getAddress());
            System.out.println("" + zhiduan5 + zhiduan6 + zhiduan7 + zhiduan8);*/
            System.out.println(arraysid.get(x) + "\t" + array.get(x).getName() + "\t" + array.get(x).getAge() + "\t" + array.get(x).getAddress());

        }
    }
}
