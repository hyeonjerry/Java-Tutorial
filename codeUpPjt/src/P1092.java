package codeUpPjt.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1092 {
    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);
        int c = Integer.parseInt(nums[2]);
        int max = getMax(getMax(a, b), c);
        for (int i = 1;; i++) {
            int t = i * max;
            if (t % a == 0 && t % b == 0 && t % c == 0) {
                System.out.print(t);
                break;
            }
        }
    }
}
