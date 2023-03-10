package day11_string;

public class String_methods_1 {
    public static void main(String[] args) {

        String str1 = "Cydeo School";

       str1 = str1.toLowerCase(); //"java programming"

        System.out.println(str1);

        //------------------------------------------

        String str2 = "java programming"; //string is immutable

        //str2 = str2.toUpperCase(); //this is re-assigning "JAVA PROGRAMMING"  or creat another variable without changing value of original variable ↙

        String str3 = str2.toUpperCase();

        System.out.println(str2);

        //-----------------------------------------------

        String word = "WOODEN Spoon";//object 1

        word.toUpperCase(); //object 2 //"WOODEN SPOON"

        word.toLowerCase(); // object 3 //"wooden spoon"
        // 3 string objects has been created

        //System.out.println(word); // will print only first object 1

        word = word.toUpperCase(); // "WOODEN SPOON

        word = word.toLowerCase();

        System.out.println(word); //after re-assigning the value, final value will be printed at the end

        //---------------------------------------------------

        String str4 = "      Cydeo School";

        str4 = str4.trim();//"Cydeo School" removed white spaces

        System.out.println(str4);

        //------------------------------------------

        String sentence1 = "Today is Sunday, and we have Java Class";

        int index1 = sentence1.indexOf('w');

        System.out.println(index1);

        String s1 = "I love Java Programming";

        int firstA = s1.indexOf('a');

        System.out.println(firstA);

        int secondA = s1.indexOf("a ");

        System.out.println(secondA);


        String s2 = "Java Python JavaScript Cydeo Python";

        int a1 = s2.indexOf('a');// it will print first "a" since there wasn't any spacification

     System.out.println(a1);

     int a2 = s2.indexOf("a Python");

     //int a2 = s2.indexOf("va")+1; // this is another way to find second "a"

     System.out.println(a2);

     int a3 = s2.indexOf("avaS");

     System.out.println(a3);

     int a4 = s2.indexOf("aS");

     System.out.println(a4);

     //---------------------------------------------------------

     String w = "Java";

     System.out.println(w.indexOf('a'));//1

     System.out.println(w.lastIndexOf('a'));//3


     String w2 = "Java Python JavaScript Cydeo Python";

     System.out.println(w2.lastIndexOf('a'));

     System.out.println(w2.lastIndexOf('P'));//29 it counts last 'P' because is last 'P'



    }
}
