package codeUpPjt.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1032 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.printf("%x", n);
    }
}
