package com.threads;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Devaraj Reddy on 1/22/2018.
 */
public class DeadLocksDemo {
    public static void main(String[] args) throws InterruptedException {

        final Runner runner = new Runner();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.firstThread();
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.secondThread();
            }
        });

        thread.start();
        thread1.start();

        thread.join();
        thread1.join();

        runner.finished();

    }
}

class Account {
    private int balance = 10000;

    public void deposit(int amount) {

        balance += amount;
    }

    public void withdraw(int amount) {

        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public static void transfer(Account acc1, Account acc2, int amount) {
        acc1.withdraw(amount);
        acc2.deposit(amount);
    }
}


class Runner {

    Account acc1 = new Account();
    Account acc2 = new Account();

    Lock lock1 = new ReentrantLock();
    Lock lock2 = new ReentrantLock();

    public void firstThread() {

        Random random = new Random();

        for (int i = 0; i < 100000; i++) {
        //Uncomment code for deadlock
//            lock1.lock();
//            lock2.lock();

            acquireLocks(lock1, lock2);

            try {
                Account.transfer(acc1, acc2, random.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void secondThread() {
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            //Uncomment code for deadlock
//            lock2.lock();
//            lock1.lock();

            acquireLocks(lock2, lock1);
            try {
                Account.transfer(acc2, acc1, random.nextInt(100));
            } finally {
                lock2.unlock();
                lock1.unlock();
            }
        }
    }

    public void finished() {
        System.out.println("Account1 Balance :" + acc1.getBalance());
        System.out.println("Account2 Balance :" + acc2.getBalance());
        System.out.println("Total Balance :" + (acc1.getBalance() + acc2.getBalance()));
    }

    public void acquireLocks(Lock firstLock, Lock secondLock) {

        while(true) {
            boolean gotFirstLock = false;
            boolean gotSecondLock = false;

            try {
                gotFirstLock = firstLock.tryLock();
                gotSecondLock = secondLock.tryLock();
            } finally {
                if (gotFirstLock && gotSecondLock) {
                    return;
                }
                if (gotFirstLock) {
                    firstLock.unlock();
                }
                if (gotSecondLock) {
                    secondLock.unlock();
                }
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}