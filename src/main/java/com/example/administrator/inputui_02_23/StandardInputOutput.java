package com.example.administrator.inputui_02_23;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/3/26.
 */
public class StandardInputOutput {

    public static void main(String[] args){

        Scanner  scanner = new Scanner(System.in);
        int inputInt = scanner.nextInt();
        System.out.println(inputInt);
        String inputString = scanner.next();
        System.out.println(inputString);

    }
}
