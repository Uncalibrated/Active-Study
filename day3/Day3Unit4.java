package activestudy.day3;

import java.util.Scanner;

public class Day3Unit4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int months;
        double money;
        do {
            System.out.println("Nhập tháng : ");
            months = input.nextInt();
        } while (months <= 0);
        do {
            System.out.println("Mời bạn nhập số tiền: ");
            money = input.nextDouble();
        } while (money <= 0);
        double interest = (money * months) * 0.3 / 100;
        double totalMoney = interest + money;
        System.out.println("Tổng số tiền bạn nhận được sau " + months + " tháng là : " + totalMoney);
    }
}
