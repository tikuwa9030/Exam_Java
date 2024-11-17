package org.example;
import java.util.Scanner;

public class List2_9 {
    Scanner stdIn = new Scanner(System.in);

    public void calculateMethod() {
        System.out.println("xとyを加減乗除します。");

        System.out.print("xの値：");
        int x = stdIn.nextInt();

        System.out.print("yの値：");
        int y = stdIn.nextInt();

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
    }
}
