package day03;

public class PrimitiveDataTypeIntro2 {

    public static void main(String[] args) {

        // char: for single character ' ' only

        char a = '@';
        char b = '!';
        char c = '2';
        char d = 'D';

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(a+b+c+d);

        System.out.println("---------------------------------------------");

        char ch1 = 'A';
        char ch2 = 65;

        System.out.println(ch1);
        System.out.println(ch2);

        System.out.println("---------------------------------------------");

        char ch3 = 40000;

        System.out.println(ch3);

        System.out.println("---------------------------------------------");

        int sum = 'A' + 'B';

        System.out.println(sum);//131

        System.out.println("---------------------------------------------");

        boolean r1 = true;
        boolean r2 = false;

        boolean r3 = 100 > 10 ; // true
        boolean r4 = 0 < -1; // false

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);







    }

}
