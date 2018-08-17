package activestudy.day3;

import java.util.Scanner;

public class Day3Unit3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an enterger for a year:");
        int year = input.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Normal year");
        }
        //if (year % 19 == 0 || year % 19 == 3 || year % 19 ==6 || year % 19 ==9 || year % 19 ==11 || year % 19 ==14 || year % 19 ==17) {
        //System.out.println("Leap lunar year");
    }
}
//}