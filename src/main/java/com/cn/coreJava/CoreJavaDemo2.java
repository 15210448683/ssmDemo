package com.cn.coreJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by moon on 16/10/13.
 */
public class CoreJavaDemo2 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();

        map.put("a", "zhangsan");
        map.put("b", "lisi");
        map.put("c", "wangwu");

//      System.out.println(map);

        /**
         * 方法一遍历map
         */
        Set<String> keySet = map.keySet();

        for(Iterator<String> iterator = keySet.iterator(); iterator.hasNext();){
            String key = iterator.next();

            String value = map.get(key);

            System.out.println(key+"="+value);
        }

        System.out.println("**********************");

        /**
         * 方法二遍历map
         */
        for(String key : map.keySet()){
            System.out.println(key+"="+map.get(key));
        }

        System.out.println("**********************");

        /**
         * 方法三遍历map，推荐使用该方法遍历map集合，尤其是容量大时
         */
        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }


        System.out.println("**********************");

        /**
         * 方法四遍历map
         */
        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        for(Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();iterator.hasNext();){
            Map.Entry<String, String> entry = iterator.next();

            System.out.println(entry.getKey()+"="+entry.getValue());
        }


        System.out.println("**********************");
        /**
         * 方法五，这种方法遍历的是所有的值
         */
        for(String value : map.values()){
            System.out.println(value);
        }

    }

}
