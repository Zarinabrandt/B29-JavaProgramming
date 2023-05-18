package day38_exceptions;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {

        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();

        if (age < 0 || age > 150){

            //System.err.println("Invalid age");
            //System.exit(1);
            // it is better to use throw keyword and creat object

            if(age < 0 ) {
                throw new InputMismatchException("Age of the person should not be negative");
            }else {
                throw new InputMismatchException("Age of the person can not be greater than 150 : "+age);
            }
        }

        if (age >= 21){
            System.out.println("Eligible");
        }else {
            System.out.println("Not eligible");
        }

        System.out.println("-------------------------------------------------------------------");

        //throw new RuntimeException("Runtime exception");
        //System.out.println("Hello World");

        throw new FileNotFoundException("");



    }
}
