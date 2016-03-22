package com.example.administrator.inputui_02_23;

/**
 * Created by Administrator on 2016/3/22.
 */
public class BubbleSort {
    public static void bubbleSort(int array[]){
        int len = array.length;
        int temp;


        for(int i=0;i<len;i++){
            boolean flag=false;
            for(int j=len-1;j>i;j--){
                if(array[j-1]>array[j]){
                    /*temp=array[j-1];
                    array[j-1] = array[j];
                    array[j]=temp;*/
                    /*array[j-1]=array[j-1]+array[j];
                    array[j]=array[j-1]-array[j];
                    array[j-1]=array[j-1]-array[j];*/
                    array[j-1]=array[j-1]^array[j];
                    array[j]=array[j-1]^array[j];
                    array[j-1]=array[j-1]^array[j];
                    flag=true;
                }
            }
            if(flag==false) break;
        }

    }
    public static void main(String[] args){
        int a[] = {5,4,9,8,7,6,0,1,3,2};
        bubbleSort(a);
        for(int i:a){
            System.out.print(i+" ");
        }

    }

}
