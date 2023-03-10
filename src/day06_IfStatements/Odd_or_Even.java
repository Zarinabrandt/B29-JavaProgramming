package day06_IfStatements;

public class Odd_or_Even {

    public static void main(String[] args) {

        int number = 100;
        boolean isEven = number % 2 == 0; //when we divide a number by 2, if remainder is 0, means the number is even number

        //boolean isOdd = number % 2 != 0; //when we divide a number by 2, if remainder is NOT 0, means the number is odd number

        boolean isOdd = !isEven; //if the number is NOT even, then it's odd

        System.out.println(number + " is an even number: " + isEven);
        System.out.println(number + " is an odd number: " + isOdd);


    }

}
