package day32_finalKeyword;

import java.time.LocalDate;

class Student {

    public final void language(){
        System.out.println("Java Programming");
    }

}

public final class FinalKeyword extends Student {

    //public void language(){
    //    System.out.println("Python Programming"); //final methods can never be overridden
    //}

    public FinalKeyword(){

    }

    public static void main(String[] args) {

        final char gender = 'M';

        System.out.println(gender); //M

        //gender = 'F';

        System.out.println(gender); //F

        System.out.println("---------------------------------------------------");

        final LocalDate dateOfBirth = LocalDate.now();

        System.out.println(dateOfBirth);

        //dateOfBirth = dateOfBirth.plusYears(1);

        System.out.println(dateOfBirth);

        System.out.println("---------------------------------------------------");

        new Student().language();
        new FinalKeyword().language();

        System.out.println("-------------------------------------------------------");

        final String name = "James"; // with final keyword it will prevent from garbage collection
        //name = null;
        //name = "Daniel";

        System.out.println(name);





    }
}
