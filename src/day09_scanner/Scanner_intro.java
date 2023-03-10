package day09_scanner;
import java.util.Scanner;

public class Scanner_intro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number:");

        byte num1 = input.nextByte();

        System.out.println("Enter your second number:");

        short num2 = input.nextShort();

        System.out.println("Enter your third number:");

        int num3 = input.nextInt();

        System.out.println("Enter your fourth number:");

        long num4 = input.nextLong();

        System.out.println("First number is: "+num1);
        System.out.println("Second number is: "+num2);
        System.out.println("Third number is: "+num3);
        System.out.println("Fourth number is: "+num4);

        input.close();//scanner is closed, can not read user inputs againinput.close();//scanner is closed, can not read user inputs again
    }
}
