package com.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Devaraj Reddy on 1/20/2018.
 */
public class SynchronizedLocksOnDiffObjects {

    public static void main(String[] args) {

        Worker worker = new Worker();

        long start = System.currentTimeMillis();

        worker.process();

        long end = System.currentTimeMillis();

        System.out.println("Time : "+(end-start));

        worker.display();
    }
}

class Worker {
    private List<Integer> list1 = new ArrayList<Integer>();
    private List<Integer> list2 = new ArrayList<Integer>();

    private Object lock1 = new Object();
    private Object lock2 = new Object();

    Random random = new Random();

    public void populateList1() {
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            list1.add(random.nextInt(100));
        }
    }

    public void populateList2() {
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
        }
    }

    public  void populate() {
        for(int i=0 ; i<1000; i++){
            populateList1();
            populateList2();
        }
    }

    public void process() {

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                populate();
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                populate();
            }
        });

        thread1.start();
        thread2.start();


        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void display(){
        System.out.println("List1 size : "+list1.size());
        System.out.println("List2 size : "+list2.size());
    }
}