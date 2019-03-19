/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: DeadLock2
 * Author:   Diaw
 * Date:     2019/3/19 21:28
 * Description: use wait notify make deadlock
 */
package com.a;

/**
 * 〈一句话功能简述〉<br> 
 * 〈use wait notify make deadlock〉
 *
 * @author Diaw
 * @create 2019/3/19
 * @since 1.0.0
 */
public class DeadLock2 implements Runnable{
    Object obj1;
    Object obj2;

    public DeadLock2(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }


    @Override
    public void run() {
        synchronized (obj1){

            synchronized (obj2){
                obj2.notify();
            }
            try {
                obj1.wait();
            }catch (Exception e){

            }

        }
    }
}