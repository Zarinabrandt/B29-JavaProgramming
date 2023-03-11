package day14_For_Loop;

public class Warmup_task_customMethod {
    public static void main(String[] args) {

        String str3  = combine("one","eight");
        System.out.println(str3);

        System.out.println("-------------------------------------");

        System.out.println( sumOf2IntegerNumbers(10, 20) );

        System.out.println( sumOf3IntegersNumbers(10, 20, 30) );

        System.out.println( sumOf4IntegerNumbers(10, 20, 30, 40) );

    }
    public static String combine(String str1,String str2){
        String result;

         if( str1.endsWith( ""+ str2.charAt(0) ) ){  //if the first string ends with same character as second string Ex."e"
             result = str1 + str2.substring(1);
         }else {
             result = str1 + str2;
         }

        return result;
    }


    public static int sumOf2IntegerNumbers(int n1, int n2){
        return n1 + n2;
    }

    public static int sumOf3IntegersNumbers(int n1, int n2, int n3){
        //return n1 + n2 + n3;
        return sumOf2IntegerNumbers(n1, n2) + n3;
    }

    public static int sumOf4IntegerNumbers(int n1, int n2, int n3, int n4){
        //return n1 + n2 + n3 + n4;
        //return sumOf3IntegersNumbers(n1, n2, n3) + n4;
        //return sumOf2IntegerNumbers(n1, n2) + sumOf2IntegerNumbers(n3, n4);
        return sumOf2IntegerNumbers( sumOf3IntegersNumbers(n1,n2,n3), n4 );
    }



}
/*
Task1:
	    Create a method named combine that can take two string and hen add them together and returns it.
        	But if the last letter of the first word and the first letter of the last letter are the same, return that character once.
	        combine("one", "eight")  ==> oneight
	Task 2:
	    1. create a method that can find the sum of two integer numbers
	                method name: sumOf2Numbers
	    2. create a method that can find the sum of three integer numbers
	                method name: sumOf3Numbers
	    3. create a method that can find the sum of four integer numbers
	                method name: sumOf4Numbers
 */