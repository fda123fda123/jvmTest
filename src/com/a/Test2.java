/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: Test2
 * Author:   Diaw
 * Date:     2019/3/19 20:27
 * Description:
 */
package com.a;

import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Diaw
 * @create 2019/3/19
 * @since 1.0.0
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.next();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (1 == 1) {

                }
            }
        },"12221").start();

    }

}