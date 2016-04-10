package com.example.administrator.inputui_02_23;

/**
 * Created by Administrator on 2016/4/10.
 */
public class MainSelectSort {

    public static void selectSort(int arr[]){

        int len = arr.length;
        for(int i=0;i<len;i++){
            //记录最小值
            int min=arr[i];
            //记录最小的位置
            int k=i;
            for(int j=i+1;j<len;j++){
                if(min>arr[j]){
                    min =arr[j];
                    k=j;
                }
            }
            if(min<arr[i]){
                //swap i and k
                arr[i] = arr[i]+arr[k];
                arr[k]=arr[i]-arr[k];
                arr[i]=arr[i]-arr[k];
            }

        }

    }
    public static void main(String[] args) {
        int a[]={5,4,9,8,7,6,0,1,3,2,100,9};
        int len=a.length;
        selectSort(a);
        for(int i=0;i<len;i++){
            System.out.print(a[i]+" ");
        }

    }
}
