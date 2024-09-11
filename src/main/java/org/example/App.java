package org.example;

import java.util.ArrayList;

/**
 * Hello world!
 */
public class App {
    private static int i;
    public static void main(String[] args) {
//        System.out.println(1/0);
        ArrayList<Integer> arrayList = new ArrayList();
        for (i = 0; i < 100; i++) {
            arrayList.add(i);
        }
        arrayList.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
//        multiThreadTest();
    }

    public static void multiThreadTest(){
        System.out.println("0 main start");
        new Thread(() -> System.out.println("1"), "thread1").start();

        new Thread(() -> System.out.println("2"), "thread2").start();

        System.out.println("3 main end");
    }
}
