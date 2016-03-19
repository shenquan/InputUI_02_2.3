package com.example.administrator.inputui_02_23;

/**
 * Created by Administrator on 2016/3/19.
 */
public class StringTest {

    public static void main(String[] args){
        String a = new String("a");
        String b = new String("a");

        if(a.equals(b)){
            System.out.println("a等于b");

        }else {
            System.out.println("a不等于b");
        }
    }
}
