package com.example.administrator.inputui_02_23;

/**
 * Created by Administrator on 2016/4/11.
 */
public class InternTest {

    public static void main(String[]args){
        String str = new StringBuilder("ja").append("va").toString();
        System.out.println(str.intern()==str);
        
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern()==str1);

        String str3 = "java1";
        String str2 = new StringBuilder("ja").append("va1").toString();
        System.out.println(str2);
        System.out.println(str2.intern()==str2);

        String s4 = "abc";
        String s6 = "abc";
        String s5 = new String("abc");
        System.out.println(s4==s5);
        System.out.println(s4.equals(s5));

    }
}
