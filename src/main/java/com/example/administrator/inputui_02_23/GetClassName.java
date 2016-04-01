package com.example.administrator.inputui_02_23;


import android.util.Log;

/**
 * Created by Administrator on 2016/4/1.
 */
public class GetClassName {
    GetClassName() {
        System.out.println("父类构造");
        System.out.println("父类构造" + getClass().getSimpleName());

    }

    void a() {
        System.out.println("父类");
    }

}

class Zi extends GetClassName {
    Zi() {
        System.out.println("子类构造");
        System.out.println("子类构造" + getClass().getSimpleName());
    }

    public static void main(String[] args) {
        /*GetClassName zi = new Zi();
         zi.a();
        GetClassName getClassName= new GetClassName();
        getClassName.a();*/

        GetClassName getClassName = new GetClassName();
        getClassName.a();
        System.out.println("-----------------------");
        Zi zi = new Zi();

    }

    @Override
    void a() {
        System.out.println("子类");
    }
}


