package org.vashonsd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int num = input.nextInt();

        System.out.println(squareOf(num));
    }

    public static int squareOf(int n) {
        return n * n;
    }
}
