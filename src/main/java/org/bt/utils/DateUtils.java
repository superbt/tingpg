package org.bt.utils;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public  class DateUtils {


    //获得当前时间戳
    public static String getDateTrs(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"); // 或其他格式
        String formattedDate = now.format(formatter);
        return formattedDate;
    }

    public static void main(String[] args) {

        DateUtils.getDateTrs();

    }
}
