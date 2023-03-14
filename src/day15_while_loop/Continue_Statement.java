package day15_while_loop;

public class Continue_Statement {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {

            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("----------------------------------");

        for (int i = 10; i < 21; i++) {

            if (i % 2 == 0) { // if i is even
                continue; // skips current iteration
            }

            System.out.println(i);
        }

        System.out.println("----------------------------------");

        for (char i = 'A'; i <= 'G'; i++) {

            if (i == 'B' || i == 'E') {
                continue;
            }
            //if (i == 'E')  as option
            //    continue;

            System.out.println(i);
        }

        System.out.println("----------------------------------");

        // find the sum of all the even number between 50 ~ 100

        // this one way
        for (int i = 50; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        // second way
        //50, 52, 54, 56, ... 100
        for (int i = 50; i < 101; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();

        // third way
        for (int i = 50; i < 101; i++) {
            if (i % 2 != 0) { // if i's value is odd number
                continue; // skip it
            }
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("-----------------------------------------");
/*
        for (int i = 0; i < 10; i++)
            System.out.println("Hello World");

            //without curly brackets we can give only one print statement, not a good statement
 */

    }
}
