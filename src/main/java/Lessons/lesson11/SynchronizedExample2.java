package Lessons.lesson11;

import java.util.ArrayList;
import java.util.Random;

public class SynchronizedExample2 {
    static int age = 30;

    public static void doSomething() throws InterruptedException {

        Thread one = new Thread(() -> {

            for (int i = 0; i < 1000; i++) {
                synchronized (SynchronizedExample2.class) {
                    System.out.println(Thread.currentThread().getName() + " " + age);
                    age++;
                }
            }
        });
        Thread two = new Thread(() -> {

            for (int i = 0; i < 1000; i++) {

                synchronized (SynchronizedExample2.class) {
                    System.out.println(Thread.currentThread().getName() + " " + age);
                    age--;
                }
            }
        });
        one.start();
        two.start();
        one.join();
        two.join();
        System.out.println(age);
    }

    public static void main(String[] args) throws InterruptedException {
        doSomething();
    }
}
