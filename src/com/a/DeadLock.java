/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: DeadLock
 * Author:   Diaw
 * Date:     2019/3/19 21:02
 * Description: deadlock
 */
package com.a;

/**
 * 〈一句话功能简述〉<br>
 * 〈deadlock〉
 *
 * @author Diaw
 * @create 2019/3/19
 * @since 1.0.0
 */
public class DeadLock implements Runnable {
    private Object obj1;
    private Object obj2;

    public DeadLock(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }


    @Override
    public void run() {
        synchronized (obj1) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj2) {
                System.out.println("qwe");
            }
        }
    }
}