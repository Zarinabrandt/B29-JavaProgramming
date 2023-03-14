package day15_while_loop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class While_Loop_Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();

        while (!(age >= 1 && age <= 150)) { // while  the age is invalid
            System.out.println("Invalid entry! please re-enter your age:");
            age = input.nextInt();
        }


        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }

        input.close();


    }
}
