package myjava.test;

import myjava.servlets.HomeworkD;
import myjava.tables.Homework;

import java.sql.Date;

public class testhomework {
    public static void main(String[] args) {
        HomeworkD test=new HomeworkD();
        Homework htest=new Homework("javaee4", Date.valueOf("2020-02-02"),Date.valueOf("2020-06-06"),"hanlaoshi",0);
        test.add(htest);
    }
}
