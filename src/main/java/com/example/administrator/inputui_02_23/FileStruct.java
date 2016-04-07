package com.example.administrator.inputui_02_23;

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

    }
}
