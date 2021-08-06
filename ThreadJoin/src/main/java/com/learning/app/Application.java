package com.learning.app;

import com.learning.threads.ThreadA;
import com.learning.threads.ThreadB;

public class Application {
    public static void main(String... args) {
        Application instance = new Application();
        instance.run();
    }

    private void run() {
        System.out.println("hello world!");
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        threadA.start();
        threadB.start();
        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("The end!");
    }
}
