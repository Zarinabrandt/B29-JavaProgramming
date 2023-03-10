package day06_IfStatements;

public class Operator_precedence {

    public static void main(String[] args) {

        System.out.println( 5 + 2 * 3);// the highest precedence doing the math first, in this case is 2*3, than 6+5
        //                  5 + 6

        System.out.println( 7 + 3 - 2 / 2);//division is the highest precedence
        //                  7 + 3 -1 == 9 //first come executed

        System.out.println( -5 + 3);// unary minus has the highest precedence
        //                  -2


        System.out.println( 10 > 9 == 8 < 7);// first order come executed first
        //                  true   == false
        //                       false

        System.out.println( 10 > 9 == 8 < 7 && "Java" == "Python" || 'a' == 'A');
        //                  true  == false && "Java" == "Python" || 'a' == 'A'
        //                         false     &&       false    ||  false
        //                                      false     || false
        //                                         false

        System.out.println(100 >= 20 && 40 * 2 > 60 );
        //                 100 >= 20 &&   80 > 60
        //                   true    &&   true
        //                         true


        int a = 20;

        a += 10 + 2 * 3;
        //a += 10 + 6
        //a += 16
        //a = 36






    }

}
