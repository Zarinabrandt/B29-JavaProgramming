package day05_operators;

public class Logical_operators {

    public static void main(String[] args) {

        double salary = 60000;
        int creditScore = 650;
        int age = 25;

        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650 && age >= 18;
        //                             true               true                true
        System.out.println(eligibleForLoan);//true

        System.out.println("----------------------------------------------");

        age = 18;
        String country = "USA";
        boolean eligibleToVote = age >= 18 && country == "USA";
        System.out.println(eligibleToVote); //true

        System.out.println("-------------------------------------------------");

        String answer = "maybe";
        boolean validAnswer = answer == "yes" || answer == "no";
        System.out.println(validAnswer);//false

        System.out.println("----------------------------------------------------");

        char grade = 'B';
        boolean passedExam = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D';
        System.out.println(passedExam); //true

        System.out.println("----------------------------------------------");

        System.out.println(!true);//false

        String a = "yes";
        boolean yes = a == "yes";//true
        boolean no = !yes; //false

        System.out.println("yes = " + yes);
        System.out.println("no = " + no);

        System.out.println("--------------------------------------------");

        int score = 65;
        boolean passed = score >= 60;
        boolean failed = !passed;
        System.out.println("passed = " + passed);//true
        System.out.println("failed = " + failed);//false

        System.out.println("---------------------------------------------");

        System.out.println(true == !false && false == !true && true != !true);//true
        //                     true            true                true


    }

}
