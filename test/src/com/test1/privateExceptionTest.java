package com.test1;

public class privateExceptionTest {
    public static void checkScore(int score) throws privateException{
        if(score<0||score>100){
            throw new privateException("输入的分数有误，分数应该在0-100之间");
        }
        else{
            System.out.println("输入正常");
        }
    }
}
