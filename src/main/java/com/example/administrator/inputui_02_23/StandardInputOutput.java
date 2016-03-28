package com.example.administrator.inputui_02_23;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/3/26.
 */
public class StandardInputOutput {

    public static void main(String[] args){

        /*Scanner  scanner = new Scanner(System.in);
        int inputInt = scanner.nextInt();
        System.out.println(inputInt);
        String inputString = scanner.next();
        System.out.println(inputString);*/
        Scanner in =  new Scanner(System.in);
                 System.out.println("请输入一个整数");
                while(in.hasNextInt()){
                       int num = in.nextInt();
                        System.out.println("请输入一个字符串");
                         String str = in.next();
                        System.out.println("num="+num+",str="+str);
                        System.out.println("请输入一个整数");
                    }

    }
}
