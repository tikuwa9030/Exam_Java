// 読み込んだ値がゼロかどうか
package org.example;

import java.util.Scanner;
public class List3_4 {
    public void zeroJudgement() {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数値：");

        int zero = stdIn.nextInt();
        if (!(zero != 0))
            System.out.println("その値はゼロです");
        else
            System.out.println("その値はゼロではありません");
    }
}
