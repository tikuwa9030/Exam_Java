// 読み込んだ整数値は性の値か？
package org.example;

import java.util.Scanner;

public class List3_1 {

    public void integerValueJudgement() {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数値：");
        int n = stdIn.nextInt();
        if (n > 0)
            System.out.println("その値は正です。");
    }
}
