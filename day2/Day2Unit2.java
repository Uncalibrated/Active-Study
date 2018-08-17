package activestudy.day2;

import java.util.Scanner;

public class Day2Unit2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten cua ban:");
        String fullname = sc.nextLine();
        System.out.println("Nhap chieu cao cua ban:");
        float height = sc.nextFloat();
        System.out.println("Nhap can nang cua ban:");
        float weight = sc.nextFloat();
        float BMI = weight / (height) * 2;
        if (BMI < 18.5) {
            System.out.println("THIEU CAN");

        } else if (BMI >= 18.5 || BMI < 25) {
            System.out.println("LY TUONG");
        } else if (BMI >= 25 || BMI < 30) {
            System.out.println("THUA CAN");
        } else if (BMI >= 30) {
            System.out.println("BEO PHI");
        }

    }


}

