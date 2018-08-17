package activestudy.day2;

import java.util.Scanner;

public class Day2Unit1 {
    public static void main(String[] args) {
        float a, b, c, i;

        Scanner input = new Scanner(System.in);
        System.out.print("Nhap  a :");
        a = input.nextFloat();
        System.out.print("Nhap  b :");
        b = input.nextFloat();
        System.out.print("Nhap c :");
        c = input.nextFloat();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem :");
            } else {
                System.out.println("Phuong trinh co mot nghiem : x=" + (-c / b));
            }
        } else {
            float delta = b * b - 4 * a * c;
            if (delta == 0) {
                System.out.println("Phuong trinh co nghiem kep :x1=x2= " + (-b / 2 * a));
            } else if (delta > 0) {
                System.out.println("Phuong trinh co 2 nghiem phan biet:");
                System.out.println("x1= " + (-b + Math.sqrt(delta) / (2 * a)));
                System.out.println("x2= " + (-b - Math.sqrt(delta) / (2 * a)));
            } else if (delta < 0) {
                System.out.println("Phuong trinh co 2 nghiem nghiem phan biet:");
                System.out.println("x1=" + (-b + "+" + Math.sqrt(Math.abs(delta)) + "*i") + "/" + (2 * a));
                System.out.println("x2=" + (-b + "-" + Math.sqrt(Math.abs(delta)) + "*i") + "/" + (2 * a));
            }
        }
    }
}