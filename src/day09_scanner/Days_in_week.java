package day09_scanner;
import java.util.Scanner;

public class Days_in_week {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);// if we use this code then we have to close at hte end

        System.out.println("Enter the day number:");
        //int num = new Scanner(System.in).nextInt(); //after one use it going to garbage collector, and we do NOT have to close at the end
        int num = input.nextInt();

        String day = "Invalid";

        if (num >= 1 && num <= 7){
            day = (num==1)? "Monday": (num==2)? "Tuesday": (num==3)? "Wednesday": (num==4)? "Thursday": (num==5)? "Friday": (num==6)? "Saturday": "Sunday";
        }
        System.out.println(day);

        input.close();


    }
}
