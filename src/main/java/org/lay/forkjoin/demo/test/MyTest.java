package org.lay.forkjoin.demo.test;

import java.util.Arrays;

public class MyTest {

    public static void main(String[] args) {

//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 6, 7, 8, 9);

//        list.parallelStream().forEach(out::println);

//        Executors.newWorkStealingPool();

        int[] num1 = new int[]{2, 5, 8};
        int[] copy = Arrays.copyOfRange(num1, 0, num1.length);
        for (int i : num1) {
            System.out.println(i);
        }
        for (int i : copy) {
            System.out.println(i);
        }
    }

}
