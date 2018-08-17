package activestudy.day1;

import java.util.Scanner;

public class Day1Unit3 {

    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a :");
        a = sc.nextInt();
        if (a < 0 && a > 1000) {
            System.out.println("Input again (0<n<1000) :");
            a = sc.nextInt();
        }
        System.out.println("Input b :");
        b = sc.nextInt();
        if (b < 0 && b > 1000) {
            System.out.println("Input again (0<n<1000) :");
            b = sc.nextInt();
        }
        int add, sub, mul;
        float div;
        add = a + b;
        System.out.println("Addition: " + add);
        sub = a - b;
        System.out.println("Subtraction: " + sub);
        mul = a * b;
        System.out.println("Multiplication: " + mul);
        div = (float) a / b;
        System.out.println("Division : " + div);
    }
}
