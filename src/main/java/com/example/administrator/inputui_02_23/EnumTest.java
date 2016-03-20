package com.example.administrator.inputui_02_23;

import java.util.Arrays;

/**
 * Created by Administrator on 2016/3/19.
 */
public class EnumTest {
   private enum Enum{
        C1,C2,C3

    }
    private class commom{


    }
    static{
        int f=1;
    }
private static void fun(){
    System.out.println();
}

    @Override
    public boolean equals(Object o) {
        return true;
    }

    public static void main(String[] args){
//        System.out.println(EnumTest.Enum.C1);
//        System.out.println(this.);
//        EnumTest.fun();
//        System.out.println(EnumTest.class);
//        System.out.println(Enum.C1.getClass());
        EnumTest a = new EnumTest();
        EnumTest b = new EnumTest();
        if(a.equals(b)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        System.out.println(Enum.C1);
        String.valueOf(1);
        a.toString();System.out.println(a.toString());
        Enum[] enums = Enum.values();
        System.out.println(Enum.C1.name());
        System.out.println(enums[0]);
        Enum.valueOf("C2");
        System.out.println();

        short a1= 256;
        byte b1=(byte)a1;
        System.out.println(a1+" "+b1);

        int a2= 129;
        byte b2 = (byte)a2;
        System.out.println(a2+" "+b2);

        EnumTest j = new EnumTest();
        EnumTest.InnerEnum k = j.
                new InnerEnum();
        k.fun();
        Outer outer = new Outer();
//        outer.fun1();
        StringBuilder s1 = new StringBuilder("f");
        StringBuilder s2 = new StringBuilder("f");
        if(s1.equals(s2)){
            System.out.println("等于");

        }else {
            System.out.println("不等于");
        }

//        System.arraycopy();
    X i =new X();
        System.out.println(i.i);
        int m=1;
       int m1=m>>>4;
        int m3 = 15;
        int m2 = m3>>2;
        System.out.println(m1+"\n"+m2);
        int kk=0b10000000000000000000000000001111;
      String  kk1=Integer.toBinaryString(2147483646);
        System.out.println(kk1);
        /*int l =-1;
        int l1 = l>>2;
        System.out.println(l1);*/
    }
    class InnerEnum{
        private void fun(){
            System.out.println("执行内部类方法");
        }

    }
}
class Outer{
     int i=1;
     void fun1(){

    }
}
class X extends Outer{

    @Override
    void fun1() {
        super.fun1();
    }
}
