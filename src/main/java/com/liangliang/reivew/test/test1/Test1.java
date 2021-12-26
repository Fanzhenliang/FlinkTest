package com.liangliang.reivew.test.test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test1 {


    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("One, Today is a very big day");
        System.out.println("Two, Today is a very big day");
        System.out.println("Three, Today is a very big day");

        int[] a = new int[]{1, 2, 3};

        try {
            FileInputStream fileInputStream = new FileInputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        FileInputStream aaaFile = new FileInputStream("");
        System.out.println(aaaFile);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


    }
}
