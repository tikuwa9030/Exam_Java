package org.example;

import java.util.Scanner;

public class List2_11 {
    Scanner stdIn = new Scanner(System.in);

    public void calculateMethod() {
        System.out.println("xとyを加減剰余します。");
        System.out.print("xの値：");
        double x = stdIn.nextDouble();

        System.out.print("yの値：");
        double y = stdIn.nextDouble();

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
    }

}
