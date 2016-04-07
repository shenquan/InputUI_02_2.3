package com.example.administrator.inputui_02_23;
import java.io.*;
import java.util.*;
/**
 * Created by Administrator on 2016/4/7.
 */
public class Main {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a,b;
        while(scanner.hasNextInt()){
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println(a+b);

        }


    }
}
