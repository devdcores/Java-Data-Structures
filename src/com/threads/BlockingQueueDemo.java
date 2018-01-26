package com.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by Devaraj Reddy on 1/22/2018.
 */
public class BlockingQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<Integer>(3);
        Producer producer = new Producer(blockingQueue);
        Consumer consumer = new Consumer(blockingQueue);

        Thread thread = new Thread(producer);
        Thread thread1 = new Thread(consumer);

        thread.start();
        thread1.start();

        thread.join();
        thread1.join();


    }
}

class Producer implements Runnable{
    BlockingQueue<Integer> blockingQueue;

    public Producer(BlockingQueue queue){
        this.blockingQueue = queue;
    }

    public void run() {
        System.out.println("10 candidates came for Interview!!!");
        for(Integer i=0 ;i<10; i++){
            try {
                blockingQueue.put(i);
                System.out.println("Interview Started for candidate : "+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        try {
            blockingQueue.put(-1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}


class Consumer implements Runnable{
    BlockingQueue<Integer> blockingQueue;

    public Consumer(BlockingQueue queue){
        this.blockingQueue = queue;
    }

    public void run() {
        try {
            Thread.sleep(3000);
            Integer take;
            while((take=blockingQueue.take()) != -1){
                System.out.println("Interview Completed for candidate : "+take);
                Thread.sleep(3000);

            }

                System.out.println("Interview Completed!!!");


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}