package activestudy.day2;

import java.util.Scanner;

public class Day2Unit4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n:");
        int n = sc.nextInt();
        int i = 2;
        System.out.println("So" + n + "=");
        while (n > 1) {
            if (n % i == 0) {
                System.out.println(i + "x");
                n /= 2;
            } else {
                i++;
            }
        }
    }
}
