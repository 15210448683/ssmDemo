package com.cn.coreJava;

/**
 * Created by moon on 16/10/13.
 */
public class CorejavaDemo3 {
    public static void main(String[] args) {
        String st1="t"+2+3;
        String st2=3+4+"tt";
        System.out.println(st1);
        System.out.println(st2);


        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("a");
        stringBuffer.append("b");
        System.out.println(stringBuffer.toString());



    }
}
