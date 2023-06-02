package com.test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/*
整数 byte short int long
浮点数 float double
字符 char
直接+ 转成int相加减
字符串
强转 ： (byte) 10
*/

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("--自增自减");
        //自增自减
        //a--;//a++;++a;
        //int b = ++a;//b21 a21
        //int c = a++;//c21 a22
        //System.out.println(a);
        //System.out.println(b);
        //System.out.println(c);

        System.out.println("--&|^!逻辑判断");
        //and 在java中为&& &与 |或 ^异或（相同的结果为false否则为true） !非

        System.out.println("--&和&&的区别");
        //&&和&区别 &需要运行全部的条件。&&只需要从左到右遇到一个false就终止了，后面不执行了
        //System.out.println((a++ > 100) & (b++ > 100));
        //System.out.println((a++ > 100) && (b++ > 100));

        System.out.println("--三元运算符");
        //三元运算符 a>b?a:b; true 则a 否则b
        //System.out.println((b == c) ? "b和c相等":"b和c不相等");

        System.out.println("--Scanner输入对象");
        //输入 Scanner 创建对象
		/* Scanner sc = new Scanner(System.in);
		接收数据，引用对象数据
		int x = sc.nextInt();
		输出数据
		System.out.println(x); */

        System.out.println("--Scanner输入数字判断奇偶数");
        //if 判断奇数偶数
		/* Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x % 2 == 0){
			System.out.println("输入的数字："+ x +"是偶数");
		}else if(x % 2 == 1){
			System.out.println("输入的数字："+ x +"是奇数");
		}else{
			System.out.println("ERROR");
		}*/

        System.out.println("--switch判断语句");
        //switch 用法 用表达式的值去比较case的值，然后执行对应的语句
		/* switch(1 < 2 ? 1:2){
			case 1:
					System.out.println("1 < 2");
					break;
			default:
					System.out.println("1 > 2");
					break;
		} */

        System.out.println("--switch中的case穿透");
        //case穿透，如果switch 中case没有用到break，后面就不会判断case的值并一直执行到最后
		/* Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		switch(x){
			case 1:
			case 2:
			case 3:
				System.out.println("第一季度");
				break;
			case 4:
			case 5:
			case 6:
				System.out.println("第二季度");
				break;
			case 7:
			case 8:
			case 9:
				System.out.println("第三季度");
				break;
			case 10:
			case 11:
			case 12:
				System.out.println("第四季度");
				break;
			default:
				System.out.println("输入有误");
		} */

        System.out.println("--for循环语句");
        //先初始化语句，后直接先条件判断是否循环（执行循环体语句），最后条件控制,然后再判断如此往复
		/* int i = 0;
		for (int x = 1;x <= 5;x++){
			System.out.println(i += x);
		} */

        System.out.println("--任意数字取指定位");
        //数字1234567 取4
        /* System.out.println(1234567 / 1000 % 10); */

        System.out.println("--for循环案例：水仙花");
        //水仙花是三位数，每一位数字的立方和等于本身三位数；取出所有水仙花数
		/* for(int x = 100;x < 1000;x++){
			if(x == ((x % 10)*(x % 10)*(x % 10)) +
			        ((x / 10 % 10)*(x / 10 % 10)*(x / 10 % 10)) +
			        ((x / 100 % 10)*(x / 100 % 10)*(x / 100 % 10))){
				System.out.println("水仙花数："+ x);
			}
		} */
		/* for(;;) {
			System.out.println("for");
		} */

        System.out.println("--while循环语句");
		/* int x = 1;
		while (x <= 5){
			System.out.println(x += 1);
		} */

        System.out.println("--while循环案例：珠穆朗玛峰");
        //纸厚度0.1毫米，需要对折多少次达到珠穆朗玛峰的高度8844430毫米
		/* double x = 0.1;
		int count = 0;
		while(x <= 8844430){
			x += x;
			count++;
		}
		System.out.println("对折次数：" + count + "次"); */

        System.out.println("--do...while循环语句");
		/* int x = 0;
		do{
			//循环体语句;
			System.out.println(x);
			//条件控制语句;
			x++;
		}while(x <= 5); */

        System.out.println("--三种循环语句的区别");
        //for循环和while先判断后执行，do循环先执行后判断
        //for如果初始化，那么循环结束后不能使用该初始化变量，while可以使用

        System.out.println("--跳转控制语句");
        //跳过本次循环 continue 结束循环 break

        System.out.println("--Random的作用和使用步骤");
		/* //创建对象
		Random r = new Random();
		//获取随机数
		int x = r.nextInt(10);//[0,10) 左闭右开，随机一个数据
		System.out.println(x); */

        System.out.println("--Random案例：猜数字");
		/* Random r = new Random();
		int x = r.nextInt(100) + 1;
		Scanner s = new Scanner(System.in);
		do{
			int y = s.nextInt();
			if(x == y){
				System.out.println("恭喜你猜对了，数字是：" + x);
				break;
			}else if (x > y){
				System.out.println("遗憾，你数字猜小了，再来一次");
			}else{
				System.out.println("遗憾，你数字猜大了，再来一次");
			}
		}while(true); */
        System.out.println("--数组的格式");
        /*格式一 数据类型[] 变量名
        例如 int[] arr
        格式二 数据类型 变量名[]
        例如 int arr []*/

        System.out.println("--数组的动态初始化");
        //动态初始化--只指定数组长度，由系统分配初始值，默认0
        //数据类型[] 变量名 = new 数据类型[数组长度];
        //左边int为数据类型[]为数组，右边new是为了数组申请内存空间
        //数组的访问方式 数组名; 数组内元素的访问方式 数组名[索引];
        //索引是连续的;索引是从0开始的;索引是逐一增加的，每次加1;
        /*int[] arr = new int[3];
        System.out.println("这里输出的是arr的内存地址:" + arr);
        System.out.println("这里输出的是arr的第一个元素:" + arr[0]);
        System.out.println("这里输出的是arr的第二个元素:" + arr[1]);
        System.out.println("这里输出的是arr的第三个元素:" + arr[2]);*/

        System.out.println("--数组的内存分配");
        //int[] arr = new int[3];
        //“int[] arr”与“new int[3]”属于不同的两个内存空间，new是开辟一个新的内存空间
        //所以直接输出arr是内存空间地址，相当于把new申请的内存空间赋值给了arr
        //int[] arr 属于栈内存;
        //new int[3]属于堆内存;
        //栈内存:存储局部变量;使用完毕,立马消失
        //堆内存:存储new出来的内容(实体，对象);初始化时会给存储空间默认值
        //每一个new出来的东西都有一个地址值，使用完毕会在垃圾回收器空闲时被回收
        //new新的内存空间会根据数据类型给不同的默认值，
        //int0;double0.0;布尔false;字符空字符;引用数据类型默认null
        //同一个内存地址可以付给多个数组名，且可以被多个数组索引修改

        System.out.println("--数组的静态初始化");
        //静态初始化,初始化时指定每个数组元素的初始值，由系统决定数组长度
        //数据类型[] 变量名 = new 数据类型[]{数据1,数据2,数据3,....};
        //int[] arr = new int[]{1,2,3};
        //简写: int[] arr = {1,2,3};
        /*int[] arr = {1,2,3};
        System.out.println(arr);*/

        System.out.println("--数组操作的两个常见问题");
        //索引越界，访问了数组中不存在的索引对应的元素，造成索引越界问题
        //空指针异常，访问了的数组已经不在指向堆内存的数据，造成空指针异常
        //null，空值，引用数据类型的默认值，表示不指向任何有效对象

        System.out.println("--数组遍历");
        /*int[] arr = {1, 2, 3, 4, 5};
        //数组元素个数，arr.length
        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);
        }*/

        System.out.println("--数组求最值");
        /*int[] arr = {1, 2, 3, 4, 7, 6, 8, 9, 12, 10};
        int max = arr[0];
        for (int x = 1; x < arr.length; x++) {
            max = (max > arr[x] ? max : arr[x]);
        }
        System.out.println("数组arr最大值：" + max);*/

        System.out.println("--数组排序案例");
        /*int[] a = new int[10];
        Random ra = new Random();
        for (int x = 0; x < a.length; x++) {
            a[x] = ra.nextInt(101);
        }
        theFifth(a);*/

        System.out.println("--方法概述");
        //方法method 是将具有独立功能的代码块组织成一个整体，使其具有特殊功能的代码集
        //方法必须先创建才能使用，这个过程称为方法定义
        //方法创建后不是直接运行，需要手动使用后才执行，这个过程叫做方法调用

        System.out.println("--方法的调用与案例");
        //方法需要写在mian方法外面且后面，调用写在mian方法里面
        //theFrist();

        System.out.println("--参数方法的定义和调用");
        /*Scanner sc = new Scanner(System.in);
        System.out.println("输入两个数字比大小");
        System.out.println("请输入第一个数字：");
        int x = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int y = sc.nextInt();
        theSecond(x,y);*/

        System.out.println("--带返回值方法的定义和调用");
        /*Scanner sc = new Scanner(System.in);
        System.out.println("输入两个数字比大小");
        System.out.println("请输入第一个数字：");
        int x = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int y = sc.nextInt();
        int max = theThird(x , y);
        System.out.println("输入的最大值：" + max);*/

        System.out.println("--方法的注意事项");
        //方法不能嵌套创建
        //void 表示无返回值，可以省略return也可以单独写return（后面不加数据）
        //return相当断点，后续不会执行
        //如果没有数据返回就写void否则明确返回的数据类型

        System.out.println("--方法的重载");
        //同一个类中同方法名如果方法体不一致，参数个数不一致或者参数类型不一致就构成了方法重载

        System.out.println("--方法的数组遍历案例");
        //创建数组，然后用方法去遍历，最终展示成一行
        //1，创建数据
        //int[] a = new int[10];
        //2，创建随机数去填充数组
        /*Random ra = new Random();
        for (int x = 0; x < a.length; x++) {
            a[x] = ra.nextInt(101);
        }*/
        //3,创建方法，将填充好的数组去传参到方法中
        //theFourth(a);

        System.out.println("--debug");
        //如何加断点，在行号后面单机鼠标左键则添加断点
        //如何运行加了断点的程序，代码区域debug执行
        //看哪里 debugger窗口
        //点哪里 step into 或者f7
        //如何删除断点，在断点处重新点击，或者在debugger窗口一次行删除

        System.out.println("--案例，无限生娃的兔子");
        //一对兔子从出生起第三个月开始每个月都会生一对兔子，问第二十个月时有多少对兔子
        /*int[]arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;
        for(int x = 2;x<arr.length;x++){
            arr[x] = arr[x-2] + arr[x-1];
        }
        System.out.println("一共最后有：" + arr[19] + "只兔子");
        theFifth(arr);*/

        System.out.println("--案例，百钱买百鸡类似鸡兔同笼");
        //公鸡1块，母鸡3块，小鸡3只一块，现用一百块
        //int x = 0;//公鸡
        //int y = 0;//母鸡
        /*for (int x = 0; x <= 100; x++) {
            for (int y = 0; y <= 100 - x; y++) {
                int z = 100 - x - y;//小鸡
                if (x + y + z == 100 && 3 * x + 9 * y + z == 300) {
                    System.out.println("公鸡:" + x + " ,母鸡:" + y + ",小鸡：" + z);
                }
            }

        }*/

        System.out.println("--案例，数组查找");
        /*//输入一个数字，返回该数字在数组中的索引值，如果找不到返回-1
        // 1.定义一个动态数组arr;
        int[] arr = new int[10];
        // 2.用随机数填充进去0-100;
        Random ra = new Random();
        for (int x = 0; x < arr.length; x++) {
            arr[x] = ra.nextInt(100);
        }
        // 3.从小到大排好序，并打印出来;
        int max;
        for (int x = 0; x < arr.length; x++) {
            for (int y = x; y < arr.length; y++) {
                if (arr[x] >= arr[y]) {
                    max = arr[x];
                    arr[x] = arr[y];
                    arr[y] = max;
                }
            }
            if (x == 0) {
                System.out.print("现有数组：arr[ " + arr[x]);
            } else if (x > 0 && x < (arr.length - 1)) {
                System.out.print(", " + arr[x]);
            } else {
                System.out.println(", " + arr[x] + "]");
            }
        }
        // 4.输入需要查找的数字，返回结果--定义方法
        int result = theSixth(arr);
        if (result != -1) {
            System.out.println("返回的索引值为：" + result);
        } else {
            System.out.println("在数组中查无此数");
        }*/

        System.out.println("--类和对象");
        //只要是客观存在的，都可以称为对象
        //只要关注一个对象，那么就是面向对象，面向对象编程就是面对一个事物进行描述实现等编程
        //类就是对象的信息，各种信息组成的各种类组成了对象;
        //类是具有相同属性和行为的一组对象的集合
        //属性：对象具有的各种特征，每个对象的每个属性都拥有特定的值
        //对象的行为，可以解释为对象的功能；
        //类的定义，由属性和行为组成。
        // 属性：在类中通过成员变量来体现（类中方法外的变量）;
        // 行为：在类中通过成员方法来体现（方法不含static 关键字）;
        //成员变量：方法外的变量，在堆内存，所以有默认的初始值，生命周期随着对象存在而存在
        //局部变量：方法中的变量，在栈内存，所以没有默认的初始值，必须先定义赋值才能使用，生命周期随随着方法的调用而存在

        System.out.println("--封装");
        //封装是面对对象的三大特征之一（封装，继承，多态）;
        //封装是面对对象编程语言对客观世界的模拟，客观世界里成员变量都是隐藏在对象内部的，外界是无法直接操作的
        //封装原则：将类的某些信息隐藏在类内部，不允许外部程序直接访问，
        // 而是通过该类提供的方法来实现对隐藏信息的操作和访问成员变量 private
        //private 关键字.作用：可以修饰成员变量和成员方法，保护成员不被别的类使用，
        //被private修饰的成员只在本类中才能访问
        /*针对private修饰的成员变量，如果需要被其他类使用，提供相应操作
                提供get变量名()方法，用于获取成员变量的值，方法用public修饰
                提供set变量名(参数)方法，用于设置成员变量的值，方法用public修饰*/
        /*FengZhuangTest fz = new FengZhuangTest();
        String sum = fz.theTest(10,20);
        System.out.println(sum);
        fz.setA(10);
        fz.setB(25);
        System.out.println(fz.getC());*/

        System.out.println("--this关键字");
        //this. 声明该变量为成员变量。

        System.out.println("--构造方法");
        //构造方法是一种特殊的方法，作用：创建对象
        //当一个类没有写构造方法时，系统会默认给一个无参构造方法
        /*格式
                public class 类名{
                    修饰符 类名(参数){

                    }
                }*/

        System.out.println("--API 应用程序编程接口");
        //相当于帮助文档
        /*Scanner sc = new Scanner(System.in);
        System.out.println("输入你想说的话：");
        //ctrl + alt + V
        String line = sc.nextLine();
        System.out.println("你输入的是：" + line);*/

        System.out.println("--String概述");
        /* String类在java.lang 包下，代表字符串；
         java程序中所有的双引号字符串，都是String类的对象
         字符串不可变，创建后就不能被更改，但是可以被共享
         字符串效果上相当于字符数组char[] 但是底层原理是字节数组byte[] 类似码值*/

        System.out.println("--字符串的比较equals");
        /*
        用==来比较，基本类型的，比较的是数据值是否相同；引用类型，比较的是地址值是否相同
        字符串为对象，比较内容是否相同，用equals方法来实现
        public boolean equals(Object anObject);
        调用方法：字符串1.equals(字符串2)
         */

        System.out.println("--案例，String用户登录");
        /*String user = "yuzewen1997";
        String pass = "yuzewen179269";
        Scanner sc = new Scanner(System.in);
        for(int x = 0;x <3;x ++){
            System.out.println("请输入用户名：");
            String user1 = sc.nextLine();
            System.out.println("请输入密码：");
            String pass1 = sc.nextLine();
            if(user.equals(user1)&&pass.equals(pass1)){
                System.out.println("登录成功，欢迎用户:"+user1);
                break;
            }else if (!user.equals(user1)){
                System.out.println("用户名不存在，请重新输入，你还有"+(2-x) +"次机会");
            }{
                System.out.println("密码错误，请重新输入，你还有"+(2-x) +"次机会");
            }
        }*/

        System.out.println("--案例，字符串String遍历");
        /*输入一个字符，返回字符在字符串中所在位置*/
        /*String test = "好好学习，天天向上";
        System.out.println("字符串查找范围：" + test);
        System.out.println("请输入你要查找的字符：");
        Scanner sc = new Scanner(System.in);
        String putin = sc.nextLine();
        if (putin.length() != 1) {
            System.out.println("只能输入单个字符，请重新输入，谢谢！");
        } else {
            for (int x = 0; x < test.length(); x++) {
                if (putin.charAt(0) == test.charAt(x)) {
                    System.out.println("对应的索引位置为：" + x);
                    break;
                } else {
                    if (x == (test.length() - 1)) {
                        System.out.println("在字符串中查不到你查询的字符！");
                    }
                }
            }
        }*/

        System.out.println("--StringBuilder");
        /*StringBuilder和String的区别，前者可以变，后者不可变*/

        System.out.println("--案例，StringBuilder拼接");
        /*将数组{1,2,3}拼接输出成[1,2,3]*/
        /*int[] a = {1, 2, 3};
        StringBuilder sb = new StringBuilder("[");
        for (int x = 0; x < a.length; x++) {
            if (x == a.length - 1) {
                sb.append(a[x] + "]");
            } else {
                sb.append(a[x] + ", ");
            }
        }
        String sb2 = sb.toString();
        System.out.println("sb:" + sb2);*/

        System.out.println("--集合ArrayList");
        /*ArrayList<E>: 可调整数组的大小，<E>:是一种特殊的数据类型，泛型*/
        /*ArrayList<String> array = new ArrayList<String>();
        array.add("s");
        array.add("b");
        array.add(1, "c");
        System.out.println("array:" + array);*/

        System.out.println("--集合ArrayList常用方法");
        /*public boolean remove(E) 删除指定元素，返回是否成功
         * public E remove(int) 删除指定位置的元素，返回删除元素
         * public E set(int,E) 修改指定位置的元素，返回被修改元素
         * public E get(int) 获取指定位置的元素
         * public E size() 获取元素个数*/

        System.out.println("--案例，学生管理系统");
        //案例路径 package com.studentmanagers;

        System.out.println("--继承");
        /*继承是面对对象的三大特征，可以使得子类具有父类的属性和方法，还可以在子类里面重新定义，追加属性和方法
         * public class 子类名 extends 父类名()
         * 父类，又称为基类，超类
         * 子类，又称为派生类，可以有父类的内容，也可以用特有的内容
         * 继承的好处和弊端
         * 1.继承可以提高代码的复用性，维护性
         * 2.增加了耦合性，降低了子类的独立性，父类发生变化子类不得不跟着变化
         * 在子类中想要访问父类的成员变量可以用 super.变量名 用法和this相似
         * 子类所有的构造方法默认都会访问父类中无参构造方法
         * 子类构造方法的第一语句默认是super()
         * 方法重写：子类出现和父类中一模一样的方法声明，可以出现子类自有的方法特征
         * 方法重写的注解 在方法的前面(上一行)添加 @Override */

        System.out.println("--方法重写的注意事项");
        /*私有方法不能不被重写，父类私有成员子类(例如 private void 方法名)是不能被继承的
         * 子类方法访问权限不能更低(public > 默认 > 私有)*/

        System.out.println("--继承的注意事项");
        /*1.类不能一次继承多个类
         * 2.类支持多层继承*/

        System.out.println("--案例，继承，老师和学生");
        /*com.jicheng_teach_and_student;*/

        System.out.println("--修饰符");
        /*package 包名; 多级包用.分开
         * 例如 package com.licheng_teach_and_student
         * java com.licheng_teach_and_student.Main
         * javac -encoding utf-8 com.licheng_teach_and_student.Main.java
         * 如果在java文件内已经导入了包，但是实际又没有创建包时，可以用以下语句默认创建包
         * javac -d . Main.java
         * 导包：import
         * ----------------
         * 权限修饰符：private，默认，protected，public
         * private：同一个类中才能访问，其它不可访问。
         * 默认：同一个包中子类可以访问，其它不可访问。
         * protected：不同包的子类可以访问，其它不可访问。
         * public：谁都可以访问。
         * ----------------
         * 状态修饰符：final(最终态) static(静态)
         * final可以修饰类，方法，成员变量；
         * final修饰的方法不能被重写，
         * final修饰的变量变为常量不能被再次赋值
         * final修饰的类是最终类，不能被继承
         * final修饰的引用类型，地址值不能变
         * ----------------
         * static可以修饰成员方法，变量
         * static修饰的变量可以被类所有对象共享
         * static修饰的变量可以被类名调用
         * static修饰的方法只能访问静态的方法*/

        System.out.println("--多态");
        /*同一对象，在不同时刻表现出来的不同形态
         * 多态的前提和体现
         * 1.有继承或实现关系
         * 2.有方法重写
         * 3.有父类引用指向子类对象
         * 例如 People pe = new Student();
         * --------------
         * 多态中成员访问特点
         * 成员变量：编译看左边，执行看左边
         * 成员方法：编译看左边，执行看右边(因为有重写)
         * --------------
         * 多态的好处：
         * 定义方法的时候可以用父类作为参数，使用时用子类引用调用，提高程序的扩展性
         * 多态不能访问子类特有的功能
         * --------------
         * 多态中的转型
         * 向上转型，从子到父，父类引用指向子类对象
         * 例如 People pe = new Student();
         * 向下转型，从父到子，父类引用转为子类对象
         * 例如 Student st = (Student)pe;*/

        System.out.println("--抽象类");
        /*没有方法体的方法被定义为抽象方法，而类中如果有抽象方法，必须定义为抽象类
         * 例如public abstract class 类名;
         * 例如public abstract void eat();
         * 抽象类必须用多态的形式创建
         * 例如  People pe = new Student();
         * 抽象类中不一定有抽象方法，有抽象方法的类一定是抽象类
         * 抽象类的子类要么重写抽象类中的所有抽象方法，要么是抽象类*/

        System.out.println("--接口");
        /*接口就是一种公共的规范标准，只要符合规范标准，大家都可以通用
         * java中的接口更多的体现在对行为的抽象
         * 接口的特点
         * 接口用关键字interface修饰
         * public interface 接口名 {}
         * 类实现接口用implements表示
         * public class 类名implements 接口名{}
         * 接口不能实例化，需要参考多态的方式创建
         * 多态的形式：具体类多态，抽象类多态，接口多态
         * 多态的前提：有继承或实现关系;有方法重写;
         * 有父类或接口引用指向子类或实现类对象
         * 接口的实现类：要么重写接口中的所有抽象方法，要么是抽象类
         * 实例
         * JieKouTest a = new Jiekou_zi();
         * a.test();
         * --------------
         * 接口的成员变量只能是常量，默认用public static final修饰
         * 接口没有构造方法，因为接口主要是对行为进行抽象的，是没有具体存在，只能是抽象构造方法
         * 如果一个类没有父类，默认继承Object类
         * 接口的方法默认修饰符 public abstract */

        System.out.println("--类与接口的关系");
        /*类和类的关系：继承关系，只能单继承，但是可以多层继承
         * 类和接口的关系：实现关系，可以单实现，也可以多实现，还可以在继承一个类的同时实现多个接口
         * 接口之间的关系:可以单继承，也可以多继承*/

        System.out.println("--抽象类和接口的区别");
        /*成员区别：
         * 抽象类：变量，常量，有构造方法，有抽象方法，也有非抽象方法
         * 接口：常量，抽象方法
         * 关系区别：
         * 类与类： 继承，单继承
         * 类与接口：实现，可以单实现，也可以多实现
         * 接口与接口：继承，单继承，多继承
         * 设计理念区别
         * 抽象类：对类抽象，包括属性，行为
         * 接口：对行为抽象，主要是行为*/

        System.out.println("--形参和返回值");
        /*类名作为形参和返回值：
         * 方法的形参是类名，其实需要的是该类的对象
         * 方法的返回值是类名，其实返回的是该类的对象
         * 抽象类名作为形参和返回值：
         * 方法的形参是抽象类名，其实需要的是该抽象类的子类对象
         * 方法的返回值是抽象类名，其实返回的是该抽象类的子类对象
         * 接口名作为形参和返回值
         * 方法的形参是接口名，其实需要的是该接口的实现类对象
         * 方法的返回值是接口名，其实返回的是该接口的实现类对象*/

        System.out.println("--内部类");
        /*内部类格式：public class 类名 {修饰符 class 类名{}}
         * 内部类的访问特点：内部类可以直接访问外部类的成员，包括私有
         * 外部类要访问内部类的成员，必须创建对象
         * 调用方法：外部类.内部类 变量名= new 外部类().内部类()
         * 匿名内部类：new 类名{public void show{};}
         * 匿名内部类本质是一个继承了该类或实现了该接口的子类匿名对象
         * 匿名内部类在开发中的使用：可以直接在mian方法中使用*/

        System.out.println("--Math");
        /*Math包含执行基本数字运算的方法，如基本指数，对数，平方根和三角函数。
        * 没有构造方法，成员全是静态static的，可以通过类名直接调用无需创建对象
        * System.out.println(Math.abs(-88));
        * long start = System.currentTimeMillis();
        for(int x = 0;x < 10000;x ++){
            System.out.println(x);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时："+(end - start)+"毫秒");*/

        System.out.println("--Object");
        /*Object 是类层次结构的根，每个类都可以将Object作为超类，所有类直接或间接的继承该类
         * 看方法的源码，选中方法，按下Ctrl+B*/

        System.out.println("--Arrays");
        /*冒泡排序：一种排序的方式，对要进行排序的数据中相邻的数据进行两两比较
         * 将较大的数据放在后面，依次对所有的数据进行操作，直至所有的数据按要求完成排序
         * 如果有n个数据要进行排序，总共需要比较n-1次，每比较完毕，下一次就会少一个数据参与比较*/

        System.out.println("--冒泡排序");
        /*Random ra = new Random();
        int[] arr = new int[10];
        for (int x = 0; x < arr.length; x++) {
            arr[x] = ra.nextInt(100);
        }
        int cnt = 0;
        System.out.println("arr数组排序前：" + arrayToString(arr));
        //如果有n个数据要进行排序，总共需要比较n-1次，每比较完毕，下一次就会少一个数据参与比较
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] >= arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
                cnt++;
            }
        }
        System.out.println("arr数组排序后：" + arrayToString(arr));
        System.out.println("循环总次数：" + cnt);*/

        System.out.println("--Arrays");
        /*Random ra = new Random();
        int[] arr = new int[10];
        for (int x = 0; x < arr.length; x++) {
            arr[x] = ra.nextInt(100);
        }
        System.out.println("arr数组排序前：" + arrayToString(arr));
        Arrays.sort(arr);
        System.out.println("arr数组升序排序后：" + Arrays.toString(arr));*/

        System.out.println("--基本类型包装类");
        /*将基本数据类型封装成对象的好处在于可以在对象中定义更多的功能方法操作该数据
        常用的操作之一用于基本数据类型于字符串之间的转换
        除int和char对应的包装类分别是Integer和Character外
        其他的基本数据类型(byte,short,long,float,double,boolean)对应的包装类都是大写首字母
        System.out.println("int最大值："+ Integer.MAX_VALUE);
        System.out.println("int最小值："+ Integer.MIN_VALUE);*/

        System.out.println("--Integer类的概述和使用");
        /*Integer x = new Integer("100");
        System.out.println(x);
        Integer y = Integer.valueOf("100");//可以识别字符串是不是数字组成
        System.out.println(y);*/

        System.out.println("--int和String相互转换");
        /*//int转String
        int number = 100;
        //方式一
        String s1 = "" + number;
        //方式二
        String.valueOf(number);
        //String转int
        String s3 = "100";
        //方式一
        Integer.valueOf(s3).intValue();
        //方式二
        Integer.parseInt(s3);*/

        System.out.println("--案例，字符串中数据排序");
        /*有一个字符串：91 27 46 38 50 最终实现 27 38 46 50 91*/
        /*String s = "91 27 46 38 50";
        String[] arr = s.split(" ");
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=Integer.parseInt(arr[i]);
        }
        Arrays.sort(arr);
        System.out.print("不转换成int排序后输出：");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length -1){
                System.out.println(arr[i]);
            }else{
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println("转换成int数组排序前输出："+ arrayToString(arr1));
        Arrays.sort(arr1);
        System.out.println("转换成int数组排序后输出："+ arrayToString(arr1));*/

        System.out.println("--自动装箱和开箱");
        /*装箱：把基本数据类型转换为对应的包装类类型
         * 拆箱：把包装类类型转换成对应的基本数据类型*/
        /*//装箱
        Integer i = Integer.valueOf(100);
        //自动装箱
        Integer ii = 100;
        //自动拆箱后自动装箱
        ii += 200;//ii = ii.intValue() + 200;*/

        System.out.println("--日期类");
        /*Date date = new Date();
        System.out.println("当前系统时间：" + date);//Fri May 26 15:14:42 CST 2023
        System.out.println("时间戳：" + date.getTime());
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //将日期转化成String
        System.out.println("将日期转化成String: "
                + sd.format(date.getTime()));
        //将String转化成Date
        //System.out.println("将String转化成Date: " + sd.parse(sd.format(date)));
        //创建类DateUtils
        System.out.println("获取当前系统时间："
                + DateUtils.getSystemTime());
        System.out.println("获取当前系统时间-自定义格式："
                + DateUtils.getSystemTime("yyyy年MM月dd日"));
        System.out.println("将时间转换成时间戳毫秒："
                + DateUtils.stringToDate("2023-05-26 16:19:00",
                "yyyy-MM-dd HH:mm:ss"));
        //Calendar日历类
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR) + "年"
                + (c.get(Calendar.MONTH) + 1) + "月"
                + c.get(Calendar.DATE) + "日");
        //Calendar日历类常用方法
        //加6天
        c.add(Calendar.DATE, 6);
        System.out.println(c.get(Calendar.YEAR) + "年"
                + (c.get(Calendar.MONTH) + 1) + "月"
                + c.get(Calendar.DATE) + "日");
        //直接设置日期,月是从0开始的
        c.set(2024,11,12);
        System.out.println(c.get(Calendar.YEAR) + "年"
                + (c.get(Calendar.MONTH) + 1) + "月"
                + c.get(Calendar.DATE) + "日");*/
        System.out.println("--异常");
        /*如果程序出现了问题，我们没有做任何处理，最终JVM会做默认处理
         * 把异常的名称，异常原因以及异常出现的位置等信息输出在控制台，程序停止执行
         * 异常处理：try{可能出现异常的代码;}catch(异常类名，变量名){异常的处理代码;}*/
        /*try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //Throwable成员方法
            //e.printStackTrace();//未来可以将错误用页面弹出
            //System.out.println(e.getMessage());//返回出现异常的原因
            System.out.println(e.toString());//异常的简略信息
            System.out.println("数组越界");
        }*/
        System.out.println("--编译是异常和运行是异常的区别");
        /*Java中的异常被分为两大类，编译时异常和运行时异常，也被称为受检异常和非受检异常
         * 所有的RuntimeException类及其子类的实例被称为运行时异常，其他的异常都是编译时异常
         * 编译时异常，必须显示处理，否则程序就会发生错误，无法通过编译
         * 运行时异常，无需显示处理，也可以和编译时异常一样处理*/
        //编译时异常
        /*Date date1 = new Date();
        try {
            date1 = new SimpleDateFormat("yyyy-MM-dd").parse("2023-05-16");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date1);*/

        System.out.println("--异常处理之throws");
        /*当出现没有权限处理的异常时可以用throws处理
         * 格式：throw 异常类名; 这个格式是跟在方法的括号后面的
         * public 类名 throw 异常类名 抛出异常，不解决，谁调用谁解决*/

        System.out.println("--自定义异常");
        //0-100打分测试
        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数(注意只能输入0-100)：");
        int score = sc.nextInt();
        try {
            privateExceptionTest.checkScore(score);
        } catch (privateException e) {
            e.printStackTrace();//privateException继承了Exception 所以可以使用
        }*/
        /*throws 和 throw 的区别
         * throws
         * 用在方法声明后面，跟的是异常类名
         * 表示抛出异常，由该方法的调用者处理
         * 表示出现异常的一种可能性，并不一定会发生这些异常
         * throw
         * 用在方法体内，跟的是异常对象名
         * 表示抛出异常，由方法体内的语句处理
         * 执行throw一定抛出了某种异常*/

        System.out.println("--集合进阶");
        /*Collection 单列集合--List集合(可以重复)--Set(不可重复)
        * List集合中包含（ArrayList，LinkedList）等
        * Set集合中包含（HashSet，TreeSet）等
        * Map 双列集合--HashMap
        * Collection常用方法
        * add()添加,remove()删除某元素,clear()清空,contains()判断是否存在,
        * isEmpty()判断是否为空,size()长度，元素个数
        * Alt + 7 可以看到所以有方法的结构
        * Collection<String> c = new ArrayList<String>();
        c.add("hhhh");
        System.out.println(c);
        * Iterator :迭代器，集合的的专用遍历方式
        * Iterartor<E> iterator(): 返回此集合中元素的迭代器，
        * 常用方法：next():返回迭代中的下一个元素
        * hasnext():如果迭代具有更多元素，则返回true
        * Collection<String> c = new ArrayList<String>();
        c.add("hhhh");
        Iterator<String> it = c.iterator();
        System.out.println(it.hasNext());
        System.out.println(it.next());*/

        System.out.println("--List集合特点");
        /*特点：有序，存储和取出的元素顺序一致
        * 可以重复，存储的元素可以重复
        * List<String> li = new ArrayList<String>();
        li.add("hhhh");
        Iterator<String> it = li.iterator();
        it.hasNext();
        it.next();*/

        System.out.println("--并发修改异常");
        /*List<String> li = new ArrayList<String>();
        li.add("hhhh");
        li.add("h22");
        Iterator<String> it = li.iterator();
        //ConcurrentModificationException
        //当不允许这样的修改是，可以通过检测到对象的并发修改的方法来抛出此异常
        while (it.hasNext()){
            String s = it.next();
            //每次next都会去核对预期的次数和实际的次数，中途增加了元素导致不一致就会报错
            //改写成for循环，改成get就可以了
            if (s.equals("hhhh")) {
                li.add("hahah");
            }
        }
        System.out.println(li);*/

        System.out.println("--列表迭代器");
        /*ListIterator: 列表迭代器
        * 通过List集合的listiterator()方法的刀，所有说它是List集合特有的迭代器
        * 用于允许程序员沿任意方向遍历列表的列表迭代器，在迭代期间修改列表，并获取列表中迭代器的当前位置
        * Listiterator常用方法
        * E next()：返回迭代中的下一个元素
        * boolean hasNext():如果迭代中具有更多元素，返回true
        * E previous():返回列表中的上一个元素
        * Boolean hasPrevious(): 如果此列表迭代器在相反方向遍历列表是有元素，则返回true
        * void add(E e):将指定元素插入列表
        * List<String> li = new ArrayList<String>();
        li.add("hhhh");
        li.add("h22");
        ListIterator<String> it = li.listIterator();
        while (it.hasNext()){
            String s = it.next();
            //每次next都会去核对预期的次数和实际的次数，中途增加了元素导致不一致就会报错
            //但是ListIterator每次add会把实际值赋值给预期值
            if (s.equals("hhhh")) {
                li.add("hahah");
            }
        }
        System.out.println(li);*/

        System.out.println("--增强for循环");
        /*int[] arr = {1,2,3,4,5};
        for(int i :arr){//内部实际上是Iterator迭代器，需要考虑并发修改异常
            System.out.println(i);
        };*/
        System.out.println("--常见数据结构");
        /*常见数据结构模型栈：数据进入栈的过程被称为进栈，反之出栈，栈是先进后出的模型
         * 常见数据结构模型队列：数据从后端进入，从前端离开，也可以称之为入队列和出队列，队列是先进先出的模型
         * 常见数据结构数组：查询数据通过索引定位，查询任意数据耗时相同，查询效率快
         * 删除数据时，将原始数据删除，同时后面每个数据前移，删除效率低
         * 添加数据时，添加位置后的每个数据后移，再添加元素，添加效率极低
         * 数组是一种查询快，添加删除慢的模型
         * 常见数据结构链表，链表开始有个链表头head，包含一个数据以及下一个数据的地址值，
         * 每一个数据都包含下一个数据的地址值，由此依次相连
         * 链表对比数组来说是一个增删快的模型，查询慢。每次查询都需要从头head开始
         * 常见数据结构之哈希表：
         * JDK8之前，底层采用数组+链表实现，可以说是一个元素为链表的数组
         * JDK8以后，在长度比较长的时候，底层实现了优化
         * 哈希表Hashset默认是容量是16的数组，算出哈希值后除以16取余 放置在存储位置中
         * 在同一个存储位置上又是按照链表的形式判断存储*/

        System.out.println("--List集合子类特点");
        /*List集合常用子类：ArrayList，LinkedList
         * ArrayList：底层数据结构是数组，查询快，增删慢
         * LinkedList：底层数据结构是链表，查询慢，增删快*/
        System.out.println("--Set集合概述和特点");
        /*Set集合特点--hashset:对集合的迭代顺序不作任何保证
        * 不包含重复元素的集合
        * 没有带索引的方法，所以不能使用普通for循环遍历
        * Set<String> st = new HashSet<String>();
        st.add("yzw");
        st.add(null);
        st.add(null);//不包含重复元素
        st.add("hj");
        st.add("hj");//不包含重复元素
        for(String s : st){
            System.out.println(s);
        }*/
        System.out.println("--哈希值");
        /*哈希值：是JDk根据对象的地址或者字符串或者数字算出来的int类型的数值
         * object类中有一个方法可以获取对象的哈希值
         * public int hashCode():返回对象的哈希码值
         * 默认情况下，不同对象的哈希值是不相同的
         * 可以通过方法的重写，实现不同对象的哈希值是一致的*/
        System.out.println("--HashSet集合保证元素唯一性源码");
        /*HashSet集合添加元素的过程：
         * 1.通过调用对象的hashcode方法获取对象的哈希值
         * 2.根据对象的哈希值计算对象的存储位置
         * 3.判断该位置是否存在元素，如果没有直接将新元素存储在该位置
         * 4.存在则遍历该位置的所有元素，和新存入的元素比较哈希值是否相同，都不相同则直接添加
         * 5.如果存在相同的则调用equals方法比较对象是否相同，如果相同则不存储，不同则添加新元素
         * 在案例HashSet集合存储学生对象并遍历中避免重复，需要重写学生类中的hashcode和equals*/

        System.out.println("--LinkedHashSet集合概述和特点");
        /*LinkedHashSet集合特点
         * 哈希表和链表实现的set接口，具有可预测的迭代次序
         * 有链表保证元素有序，也就是说元素的存储和取出顺序是一致的
         * 由哈希表保证元素唯一，也就是说没有重复的元素
         * LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("hhh");
        linkedHashSet.add("aaaa");
        linkedHashSet.add("asda");
        for (String s :
                linkedHashSet) {
            System.out.println(s);
        }*/
        System.out.println("--TreeSet集合概述和特点");
        /*TreeSet集合特点
         * 元素有序，这里是按照一定的规则进行排序，排序方式取决于构造方法
         * TreeSet():根据其元素的自然排序进行排序
         * TreeSet(Comparator comparatot)：根据指定的比较器进行排序
         * 没有带索引的方法，所以不能用普通的for循环遍历
         * 由于是Set集合，所以不包含重复元素*/
        System.out.println("--自然排序Comparable的使用");
        /*存储学生对象并遍历，创建TreeSet集合使用无参构造方法
        * 要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
        * 学生对象需要实现Comparable接口并重写CompareTo方法
        * 方法返回0，则只存储一个元素，正数这按照存储顺序，负责则相反
        * 思考：其实就是两两比较，新数减旧数，负数则新数在旧数前
        * TreeSet<Student> ts = new TreeSet<Student>();
        Student s1 = new Student("yzw",26);
        Student s2 = new Student("yzw",25);
        Student s3 = new Student("hj",27);
        Student s4 = new Student("hj",25);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        for (Student s :
                ts) {
            System.out.println(s.getName()+","+s.getAge());
        }*/

        System.out.println("--比较器排序Comparable的使用");
        /*存储学生对象并遍历，创建TreeSet集合使用带参构造方法
         * 要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
         * //匿名内部类
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });
        Student s1 = new Student("yzw", 26);
        Student s2 = new Student("yzw", 25);
        Student s3 = new Student("hj", 27);
        Student s4 = new Student("hj", 25);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        for (Student s :
                ts) {
            System.out.println(s.getName() + "," + s.getAge());
        }*/




    }

    //简单的方法定义--判断奇数偶数
    public static void theFrist() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字: ");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("你输入的数字是偶数");
        } else if (a % 2 == 1) {
            System.out.println("你输入的数字是奇数");
        } else {
            System.out.println("你输入的是错误字符");
        }
    }

    //输入两个数字输出最大值
    public static void theSecond(int a, int b) {
        int max = a > b ? a : b;
        System.out.println("你输入的两个数中最大的是：" + max);

    }

    //返回两个数之间的最大值
    public static int theThird(int a, int b) {
        return a > b ? a : b;

    }

    //数组遍历输出
    public static void theFourth(int[] b) {
        for (int y = 0; y < b.length; y++) {
            if (y == 0) {
                System.out.print("[" + b[y] + ",");
            } else if (y < (b.length - 1)) {
                System.out.print(b[y] + ",");
            } else {
                System.out.println(b[y] + "]");
            }
        }
    }

    //数组从小到大排序输出
    public static void theFifth(int[] a) {
        //遍历输出排序前的数组为一行
        for (int z = 0; z < a.length; z++) {
            if (z == 0) {
                System.out.print("排序前：[" + a[z] + ",");
            } else if (z < (a.length - 1)) {
                System.out.print(a[z] + ",");
            } else {
                System.out.println(a[z] + "]");
            }
        }
        //数组从小到大排序-冒泡排序
        //每一次遍历数组都找出当前范围内的最小值，并与当前的索引位互换
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] >= a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
        //遍历输出排序后数组为一行
        for (int z = 0; z < a.length; z++) {
            if (z == 0) {
                System.out.print("排序后：[" + a[z] + ",");
            } else if (z < (a.length - 1)) {
                System.out.print(a[z] + ",");
            } else {
                System.out.println(a[z] + "]");
            }
        }

    }

    //输入数组，后输入数字，返回数字在数组中的索引值，否返回-1
    public static int theSixth(int[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你要查询的值：");
        int b = sc.nextInt();
        for (int x = 0; x < a.length; x++) {
            if (b == a[x]) {
                return x;
            }
        }
        return -1;
    }

    //将数组中的元素按照指定规则组成一个字符串：[元素1，元素2，元素3....]
    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i] + ", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}


