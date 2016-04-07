package com.example.administrator.inputui_02_23;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Administrator on 2016/4/5.
 */
public class ShuffleClass {

    int data ;
    public ShuffleClass(int data){
        this.data= data;
    }

    public static void main(String args[]){

        ShuffleClass all[] = new ShuffleClass[100];
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0;i<100;i++){

            all[i] = new ShuffleClass(i);
            //System.out.println(all[i].data);

            arrayList.add(all[i].data);

        }
        /*for(int i=0;i<100;i++){
            System.out.println(arrayList.get(i));
        }*/

        Collections.shuffle(arrayList);
        for(int i=0;i<100;i++){
            System.out.println(arrayList.get(i));
        }


    }
}
