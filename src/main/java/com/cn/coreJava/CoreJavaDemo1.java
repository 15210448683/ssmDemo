package com.cn.coreJava;

/**
 * Created by moon on 16/10/13.
 */
public class CoreJavaDemo1  extends abstrackDemo implements interfaceDemo,interfaceDemo1{

    public static void main(String[] args) {
        int[] a =new int[]{4,5,6};
        int[] b =new int[5];
        int[] c ={1,2,3,4};
        int[] d=null;
        System.out.println(a[0]);

        try{
            System.out.println(d[0]);
        }catch (Exception e){
            System.out.println("捕获异常");
        }finally {
            System.out.println("最终执行");
        }


    }

    @Override
    public void method1() {

    }

    @Override
    public void method3() {

    }
}
