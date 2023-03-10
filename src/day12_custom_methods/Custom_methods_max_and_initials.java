package day12_custom_methods;

public class Custom_methods_max_and_initials {
    public static void main(String[] args) {

     maxNum(2.5, 20.5);

        System.out.println("------------------------------------");

        maxNum(10000, 12345);

        System.out.println("--------------------------------------");

        maxNum(125, 20.5);

        System.out.println("-------------------------------");
         maxNum(-23, - 50);

        System.out.println("-----------------------------------------");

        initials("Cydeo","School");

        System.out.println("--------------------------------");

        initials("Mukhabbat","Khusnatdinova");

        System.out.println("--------------------------------");

        initials("Doctor","Karimi");//D.K

        System.out.println("--------------------------------");

        initials("Java","Programming");//J.P

    }

    // create a method that can print the maximum number between two numbers, if both are equal then it prints "Equal", (num1, num2)
    public static void maxNum(double num1, double num2){

       if (num1 > num2){
           System.out.println(num1 + " is maximum number");
       }else if (num2 > num1){
           System.out.println(num2 + " is maximum number");
       }else {
           System.out.println("Equal");
       }


    }



    //Create a method that can display the initials of a person  (firstName, lastName)
    public static void initials(String firstName, String lastName){
        String initial = firstName.charAt(0) + "." + lastName.charAt(0);

        System.out.println("initial is: " + initial);

    }


}
