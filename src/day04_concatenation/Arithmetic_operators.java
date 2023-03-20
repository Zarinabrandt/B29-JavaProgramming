package day04_concatenation;

public class Arithmetic_operators {

    public static void main(String[] args) {

        System.out.println(100 + 200); //300
        System.out.println(40 - 10); // 30
        System.out.println(50 / 6); // will get integer result (int)
        System.out.println(50 / 6.0); // will get decimal result (double)
        System.out.println( 50.0 / 6); // will get decimal (double)
        System.out.println( 50d / 6); // will get decimal (double)
        System.out.println( 2.5 / 0.5); // will get decimal (double)
        System.out.println(  (2.5 / 0.5)  ); // will get decimal (double)
        System.out.println(  (int)  (2.5 / 0.5)    ); // will get integer (int)
        //System.out.println( 9 / 0); // denominator should not be "0"
        System.out.println( 10 * 2); //20
        System.out.println(20 * 12); //240
        System.out.println( 100 % 13); // remainder is 9
        System.out.println( 100 % 10); // remainder is 0
        System.out.println( 45 % 8); // remainder will be 5

        System.out.println("---------------------------------------------");


    }

}
