package codeUpPjt.src;

import java.util.Scanner;

public class P1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a, b;
        a = sc.next().charAt(0);
        b = sc.next().charAt(0);
        System.out.printf("%c %c", b, a);
        sc.close();
    }
}
