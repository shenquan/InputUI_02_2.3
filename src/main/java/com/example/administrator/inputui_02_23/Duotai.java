package com.example.administrator.inputui_02_23;

/**
 * Created by Administrator on 2016/3/28.
 */
public class Duotai {
    void A(){
        System.out.println("基类输出");
    }
}

class Jicheng extends Duotai{
    @Override
    void A() {
        System.out.println("继承输出");
    }

    public static void main(String[]args){
        Duotai duotai = new Jicheng();
        duotai.A();

        Duotai duotai1 = new Duotai();
        duotai1.A();
    }
}
