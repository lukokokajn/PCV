package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> array1 = new ArrayList<>();
        List<Integer> array2 = new ArrayList<>();

        Random r = new Random();

        for (int i = 0; i < 200; i++) {
            array1.add(r.nextInt(100));
        }
        for (int i = 0; i < 200; i++) {
            array2.add(r.nextInt(100));
        }
        for (int i = 50; i < 100; i++) {
            array1.remove(i);
        }

        for (int i = 0; i < 100; i++) {
            array1.set(i, array1.get(i));
        }

        Collections.sort(array1);
        Collections.sort(array2);

        for (Integer integer1 : array1) {
            System.out.println(integer1);
        }
        for (Integer integer2 : array2) {
            System.out.println(integer2);
        }
        if(array1 != array2){
            System.out.println("Not Same");
        }
        else {
            System.out.println("Same");
        }
    }
}
