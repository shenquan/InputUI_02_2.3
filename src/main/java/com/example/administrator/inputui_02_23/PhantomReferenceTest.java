package com.example.administrator.inputui_02_23;

import java.lang.ref.*;


/**
 * Created by Administrator on 2016/4/13.
 */
public class PhantomReferenceTest {
    public static void main(String[] args) {
        // 创建一个对象
        String str = new String("JAVA讲义");
//  创建一个引用队列
        ReferenceQueue<String> rq = new ReferenceQueue<String>();
        //创建一个虚引用，指定引用对象.不能单独使用必须关联引用队列
        PhantomReference pr = new java.lang.ref.PhantomReference(str,rq);
        //切断强引用
        str = null;
        //试图取得虚引用对象
        System.out.println(pr.get());

        //垃圾回收
        System.gc();
        System.runFinalization();
        //取出引队列中的最先

    }
}
