package org.example;

// final変数を利用したプログラム
import java.util.Scanner;
public class List2_15 {
    Scanner stdIn = new Scanner(System.in);

    public void piCalculate() {

        System.out.print("半径:");
        double radius = stdIn.nextDouble();
        final double PI = 3.1416;

        System.out.println("円周の長きは:" + (2 * PI * radius) + "です。");
        System.out.println("面積は:" + (radius * radius * PI) + "です。");
    }
}
