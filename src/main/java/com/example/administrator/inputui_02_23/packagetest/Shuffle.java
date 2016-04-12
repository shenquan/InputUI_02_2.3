package com.example.administrator.inputui_02_23.packagetest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2016/3/19.
 */
public class Shuffle {
    public static void shuffle(){
        int[] x = {1,2,3,4,5,6,7,8,9};
        List list = new ArrayList();
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+",");
            list.add(x[i]);
        }
        System.out.println();

        Collections.shuffle(list);

        Iterator ite = list.iterator();
        while(ite.hasNext()){
            System.out.print(ite.next().toString()+",");
        }

    }
    public static void main(String[] args){
        shuffle();
    }

}
