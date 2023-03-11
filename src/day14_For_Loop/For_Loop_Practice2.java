package day14_For_Loop;

import java.util.Scanner;

public class For_Loop_Practice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter a number for 10 times");
            sum += input.nextInt();
        }
        System.out.println("sum = "+sum);


    }
}
