package com.learning.threads;

public class ThreadB extends Thread {
    @Override
    public void run() {
        System.out.printf("thread %s started\n", currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("thread %s finished\n", currentThread().getName());
    }
}
