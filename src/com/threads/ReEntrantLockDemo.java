package com.threads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Devaraj Reddy on 1/22/2018.
 */
public class ReEntrantLockDemo {
    public static void main(String[] args) throws InterruptedException {

        final Processor2 processor2 = new Processor2();


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    processor2.firstThread();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    processor2.secondThread();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        thread.start();
        thread1.start();

        thread.join();
        thread1.join();


        processor2.finished();
    }
}

class Processor2{

    int count =0;
    private Lock lock= new ReentrantLock();
    private Condition condition = lock.newCondition();


    public void increment(){
        for(int i=0; i<10000; i++){
            count++;
        }
    }

    public void firstThread() throws InterruptedException {

        lock.lock();
        System.out.println("Waiting .....");
        condition.await();
        System.out.println("Woken Up..");
        try {
            this.increment();
        }finally {
            lock.unlock();
        }
    }

    public void secondThread() throws InterruptedException {
        Thread.sleep(1000);
        lock.lock();
        System.out.println("Signalling to wake up...");
        condition.signal();
        try {
            this.increment();
        }finally {
            System.out.println("unlock should be called after signalling...");
            lock.unlock();
        }
    }

    public void finished(){

        System.out.println("Value of count : "+count);
    }

}