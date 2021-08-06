package com.learning.threads;

public class ThreadA extends Thread {
    @Override
    public void run() {
        System.out.printf("thread %s started\n", currentThread().getName());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("thread %s finished\n", currentThread().getName());
    }
}
