package com.example.administrator.inputui_02_23;

/**
 * Created by Administrator on 2016/4/10.
 */
public class MainInsertSort {

    public static void insertSort(int arr[]){
        

    }


    public static void main(String[] args) {
        int a[]={5,4,9,8,7,6,0,1,3,2,100,9};
        int len=a.length;
        insertSort(a);
        for(int i=0;i<len;i++){
            System.out.print(a[i]+" ");
        }

    }
}