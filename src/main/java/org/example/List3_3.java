// 読み込んだ２つの値が等しいか
package org.example;

import java.util.Scanner;

public class List3_3 {
    public void twoValueEqual() {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数a：");
        int a = stdIn.nextInt();

        System.out.print("整数b：");
        int b = stdIn.nextInt();

        if (a == b)
            System.out.println("２つの値は等しいです。");
        else
            System.out.println("2つの値は等しくありません。");
    }
}
