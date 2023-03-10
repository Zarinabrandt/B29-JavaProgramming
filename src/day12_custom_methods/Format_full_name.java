package day12_custom_methods;

import java.util.Scanner;

public class Format_full_name {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = scan.nextLine().trim().replace(" ", "");
        // trim(0 & replace methods will make sure that the white spaces & additional spaces between the characters will be removed

        System.out.println("Enter your last name:");
        String lastName = scan.nextLine().trim().replace(" ", "");

        scan.close();

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        // getting first character of first name + the remaining characters of the first name

        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        String full_name = firstName + " " + lastName;

        System.out.println(full_name);
    }
}
/*
1. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School
 */