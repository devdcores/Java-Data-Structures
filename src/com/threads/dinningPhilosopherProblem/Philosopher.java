package com.threads.dinningPhilosopherProblem;

import java.util.Random;

/**
 * Created by Devaraj Reddy on 1/26/2018.
 */
public class Philosopher implements Runnable{

    private int id;
    private Chopstick leftChopstick;
    private Chopstick rightChopstick;
    private volatile boolean isFull = false;
    private Random random;
    private int eatCounter;


    public Philosopher(int id, Chopstick leftChopstick, Chopstick rightChopstick) {
        this.id = id;
        this.leftChopstick = leftChopstick;
        this.rightChopstick = rightChopstick;
        this.random= new Random();
    }


    @Override
    public void run() {
        while(!isFull){
            try {
                think();
                if(leftChopstick.pickUp(this, State.LEFT)){
                    if(rightChopstick.pickUp(this,State.RIGHT)){
                        eat();
                        rightChopstick.putDown(this,State.RIGHT);
                    }
                    leftChopstick.putDown(this,State.LEFT);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void think() throws InterruptedException {
        System.out.println(this + " is thinking!!!");
        Thread.sleep(random.nextInt(1000));
    }

    private void eat() throws InterruptedException {
        System.out.println(this + " is eating!!!");
        this.eatCounter++;
        Thread.sleep(random.nextInt(1000));
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public int getEatCounter() {
        return eatCounter;
    }

    @Override
    public String toString() {
        return "Philosopher : "+id;
    }
}