package com.example.administrator.inputui_02_23;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by Administrator on 2016/4/7.
 */
public class FileStruct {
    int intPara;

   private FileStruct() {

        intPara = 0;

    }

    public void setintPara(int i) {

        intPara = i;

    }

    public int getintPara() {

        return intPara;

    }

    public static void main(String[] args) {

        FileStruct[] fs = new FileStruct[10];

        for (int i = 0; i < 10; i++) {

            fs[i] = new FileStruct();
            System.out.println(fs[i].getintPara());
        }

        Hashtable<Integer,Integer> table = new Hashtable<>();
        //table.contains(1);
        FileStruct fs1 = new FileStruct();
        fs1.setintPara(1);
        FileStruct fs2 = new FileStruct();
        fs2.setintPara(1);
        if(fs1.equals(fs2)){
            System.out.println("相等");
        }

        T t1 = new T();
        T t2 = new T();
        if(t1==t2){
            System.out.println("相等1");
        }
        if(t1.equals(t2)){
            System.out.println("相等2");
        }

    }


}
class T{

}