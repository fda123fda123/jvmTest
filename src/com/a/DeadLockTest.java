/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: DeadLockTest
 * Author:   Diaw
 * Date:     2019/3/19 21:20
 * Description: test deadlock
 */
package com.a;

/**
 * 〈一句话功能简述〉<br> 
 * 〈test deadlock〉
 *
 * @author Diaw
 * @create 2019/3/19
 * @since 1.0.0
 */
public class DeadLockTest {
  /*  public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        new Thread(new DeadLock(obj1,obj2)).start();
        new Thread(new DeadLock(obj2,obj1)).start();
    }*/
  public static void main(String[] args) {
      Object obj1 = new Object();
      Object obj2 = new Object();
      new Thread(new DeadLock2(obj1,obj2)).start();
      new Thread(new DeadLock2(obj2,obj1)).start();
  }
}