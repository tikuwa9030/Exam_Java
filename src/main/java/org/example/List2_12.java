package org.example;

import java.util.Scanner;

public class List2_12 {
    Scanner stdStr = new Scanner(System.in);

    public void nameGreeting() {

        System.out.print("お名前は:");
        String name = stdStr.next();
        System.out.println("私の名前は" + name + "です。");
    }

}
