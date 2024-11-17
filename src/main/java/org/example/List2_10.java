package org.example;
import java.util.Scanner;

public class List2_10 {

    Scanner minus = new Scanner(System.in);

    public void signChange() {
        System.out.print("整数値:");
        int a = minus.nextInt();
        int b = -a;
        System.out.println(a + "の符号を判定した数値は" + b);
    }
}
