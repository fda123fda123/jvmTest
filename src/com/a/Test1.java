/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: Test1
 * Author:   Diaw
 * Date:     2019/3/18 14:37
 * Description: 大对象的垃圾回收
 */
package com.a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈大对象的垃圾回收〉
 *
 * @author Diaw
 * @create 2019/3/18
 * @since 1.0.0
 */
public class Test1 {
    public static void main(String[] args) {

        byte[] a = new byte[222 * 1024 * 1024];
        System.out.println("大对象");

        Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
        for (Map.Entry<Thread, StackTraceElement[]> en : map.entrySet()
        ) {
            Thread t = en.getKey();
            StackTraceElement[] s = en.getValue();

            System.out.println("name is "+t.getName());
            for (StackTraceElement ss: s
                 ) {
                System.out.println("\t"+ss.toString());
            }


        }

    }


}