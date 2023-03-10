package day06_IfStatements;

public class Single_If_Statement_Practice {

    public static void main(String[] args) {

        int number = 155;

        boolean isEven = number % 2 == 0;
        if (isEven){
            System.out.println("Even number");
        }

        boolean isOdd = number % 2 != 0;
        if (isOdd){
            System.out.println("Odd number");
        }


        System.out.println("---------------------------");


        int num = 100;

        boolean isEven1 = num % 2 == 0;
        if (isEven1){
            System.out.println("Even number");
        }
        if (!isEven1){
            System.out.println("Odd number");
        }


        System.out.println("--------------------------------");


        if (number % 2 == 0){
            System.out.println("Even number");
        }
        if (number % 2 != 0){
            System.out.println("Odd number");
        }




    }

}
