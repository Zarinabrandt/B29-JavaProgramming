package day06_IfStatements;

public class Identify_number {

    public static void main(String[] args) {

        int number = 100;
        boolean isPositive = number > 0; // if the number is greater than 0 zero, then it's positive number
        boolean isNegative = number < 0; // if the number is less than 0 zero, then it's negative number
        //boolean isZero = number == 0; // if the number is equal to 0 zero, then it's zero
        boolean isZero = !isPositive && !isNegative; //if the number is NOT positive and NOT negative, then it's zero

        System.out.println(number + " is positive number: " + isPositive);
        System.out.println(number + " is negative number: " + isNegative);
        System.out.println(number + " is zero: " + isZero);





    }

}
