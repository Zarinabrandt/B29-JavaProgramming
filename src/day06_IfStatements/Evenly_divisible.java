package day06_IfStatements;

public class Evenly_divisible {

    public static void main(String[] args) {

        int number = 65;
        boolean isDivisibleBy2 = number % 2 == 0;
        //if the remainder of number divided by 2 is equal to zero, then it's evenly divisible by 2
        boolean isDivisibleBy3 = number % 3 == 0;
        //if the remainder of number divided by 3 is equal to zero, then it's evenly divisible by 3
        boolean isDivisibleBy5 = number % 5 == 0;
        //if the remainder of number divided by 5 is equal to zero, then it's evenly divisible by 5

        System.out.println(number + " is divisible by 2: " + isDivisibleBy2);
        System.out.println(number + " is divisible by 3: " + isDivisibleBy3);
        System.out.println(number + " is divisible by 5: " + isDivisibleBy5);




    }

}
