package com.threads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Devaraj Reddy on 1/21/2018.
 */
public class CountDownLatchDemo {

    public static void main(String[] args) {


        CountDownLatch countDownLatch = new CountDownLatch(3);
        Processor processor = new Processor(countDownLatch);

        ExecutorService executorService = Executors.newFixedThreadPool(1);

        for(int i = 0; i<3; i++){
            executorService.submit(processor);
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Completed...");
    }
}

class Processor implements Runnable{

    CountDownLatch count;

    Processor(CountDownLatch count){
        this.count=count;
    }


    public void run() {
        System.out.println("Started...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        count.countDown();
    }
}