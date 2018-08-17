package activestudy.day3;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Day3Unit1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an enterger for seconds:");
        int seconds = input.nextInt();
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        System.out.println(seconds + "seconds is" + minutes + "minutes and" + remainingSeconds + "seconds");
    }
}
