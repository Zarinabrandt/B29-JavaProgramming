package day13_Return_Methods_Overloading;

public class Return_Method_Intro {
    public static void main(String[] args) {

       //int total = sum(20, 40); //sum is a void method,does not return any data

        int total = addition(20, 25);

        //square(10); // or ↓

        int t = square(10); // or ↓

        System.out.println( square(10)); // all lines 10, 12 and 14 correct to use for return data

        System.out.println( cube(5));

        int r = cube(5);

    }

/*
    public static void sum(int n1, int n2){

        int result = n1 + n2;

        return;

    }

 */

    public static int addition(int num1, int num2){
        int result = num1 + num2;
        return result;

    }


    public static int square(int num){

        int square = num * num;
        return square;

    }


    public static int cube(int num){

        int cube = square(num) * num;
        return cube;
    }




}
