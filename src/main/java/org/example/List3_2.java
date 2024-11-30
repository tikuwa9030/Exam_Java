// 読み込んだ整数値は正の値か？そうでないか？
package org.example;

import java.util.Scanner;

public class List3_2 {
    public void integerValueJudgement(){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数値：");

        int n = stdIn.nextInt();

        if (n > 0)
            System.out.println("その値は正です");
        else
            System.out.println("その値は負の値です");
    }
}
