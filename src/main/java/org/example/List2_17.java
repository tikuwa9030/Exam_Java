package org.example;

// 0〜9のラッキーナンバーを乱数にて生成
import java.util.Random;

public class List2_17 {

    public void randomSelect() {
        Random rm = new Random();
        int number = rm.nextInt(10);
        System.out.println("今日のラッキナンバーは" + number + "です。");
    }

}
