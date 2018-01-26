package com.threads;

import java.util.LinkedList;

/**
 * Created by Devaraj Reddy on 1/22/2018.
 */
public class WaitAndNotifyDemo {
    static final int LIMIT = 10;

    public static void main(String[] args) throws InterruptedException {

        LinkedList<Integer> list = new LinkedList<>();
        Object lock = new Object();
        Thread thread = new Thread(new Producer1(list, lock));
        Thread thread2 = new Thread(new Consumer1(list, lock));

        thread.start();
        thread2.start();

        thread.join();
        thread2.join();

    }
}

class Producer1 implements Runnable {

    Object lock;
    LinkedList<Integer> list;


    public Producer1(LinkedList list, Object lock) {
        this.list = list;
        this.lock = lock;
    }

    public void run() {
        Integer value = 0;
        synchronized (lock) {
            while (true) {
                while (list.size() == WaitAndNotifyDemo.LIMIT) {
                    try {
                        System.out.println("List size is full");
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.print("List size : " + list.size());
                list.add(value++);
                System.out.println("; Value : " + value);


                lock.notify();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}


class Consumer1 implements Runnable {

    Object lock;
    LinkedList<Integer> list;


    public Consumer1(LinkedList list, Object lock) {
        this.list = list;
        this.lock = lock;
    }

    public void run() {
        synchronized (lock) {
            while (true) {

                while (list.size() == 0) {
                    try {
                        System.out.println("List size is empty");
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("List size : " + list.size());
                Integer integer = list.removeFirst();
                System.out.println("; Value : " + integer);
                lock.notify();


                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}