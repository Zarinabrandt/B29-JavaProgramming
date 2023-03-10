package day05_operators;

public class Relational_operators {

    public static void main(String[] args) {

        int a = 1000;
        int b = 200;
        //System.out.println(a > b); //if you dont want to write an expiration you can use boolean primitive variable
        boolean aIsGreater = a > b;

        System.out.println(aIsGreater);

        System.out.println("-------------------------------------");

        int score = 75;
        boolean passed = score >= 60;
        System.out.println("passed = " + passed);

        System.out.println("-------------------------------------");

        int age = 21;
        boolean eligibleToBuyAlcohol = age >= 21;
        System.out.println(eligibleToBuyAlcohol);

        boolean eligibleToVote = age >= 18;
        System.out.println(eligibleToVote);

        System.out.println("-------------------------------------");

        System.out.println( 100 > 100);//false
        System.out.println( 100 >= 100);//true
        System.out.println( 100 >= 85);

        System.out.println("-------------------------------------");

        score = 48; //assignment operator
        boolean failed = score < 60;
        System.out.println(failed);

        System.out.println("-------------------------------------");

        System.out.println( 100 < 2000); //true
        System.out.println( 100 < 20); //false

        System.out.println("----------------------------------------");

        System.out.println(95 <= 100);//true
        System.out.println(100 <= 100 );//true

        System.out.println( 10 <= 5); //false

        System.out.println("-------------------------------------");

        //System.out.println("Java" <= "C#"); //>, <, >=, <= only applicable for the numbers
        System.out.println('a' > 'b');//even characters has in ascii table have numbers
         //                65     66  //false



    }

}
