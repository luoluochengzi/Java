package com.test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private DateUtils() {
    }

    //将时间戳(毫秒)转换成带格式的String时间，格式例如： yyyy-MM-dd HH:mm:ss
    public static String dateToString(Date date, String format) {
        return new SimpleDateFormat(format).format(date);
    }

    //获取当前系统时间，可以手动设置格式
    public static String getSystemTime(String format) {
        return new SimpleDateFormat(format).format(new Date());
    }

    //获取当前系统时间，默认格式:yyyy-MM-dd HH:mm:ss
    public static String getSystemTime() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    //将String转换成时间戳(毫秒)，按照格式解析
    public static Long stringToDate(String date, String format) {
        Date date1 = new Date();
        try {
            date1 = new SimpleDateFormat(format).parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date1.getTime();

    }

}
