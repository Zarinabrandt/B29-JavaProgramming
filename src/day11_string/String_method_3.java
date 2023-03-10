package day11_string;

public class String_method_3 {
    public static void main(String[] args) {

        String word = "";

        boolean r1 = word.isEmpty();

        System.out.println(r1);

        //---------------------------------------------------

        String str = "        ";

        boolean r2 = str.isEmpty(); // return false because string is NOT empty it just blank

        boolean r3 = str.isBlank(); // returns true is blank

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        //------------------------------------------------

        String str1 = "Cydeo";//in the string pool

        String str2 = new String("Cydeo");//in the heap

        System.out.println(str1 == str2);//false

        System.out.println(str1.equals(str2));//true

        String str3 = new String("cydeo");

        System.out.println(str2.equals(str3));//false

        //----------------------------------------------------

        String s1 = "JAVA";
        String s2 = "java";

        System.out.println(s1.equals(s2));//false case sensitivity
        System.out.println(s1.equalsIgnoreCase(s2));// true

        //-----------------------------------------------------

        String students = "Hasan Naran SUmeve Nataliia";

        boolean hasAhmed = students.contains("Ahmed");

        System.out.println("hasAhmed = " + hasAhmed);

        //------------------------------------------

        String sentence = "My favorite programming language is JAVA";

        boolean hasJava = sentence.toLowerCase().contains("java");// because toLowerCase it is returns true

        System.out.println("hasJava = " + hasJava);

        //-------------------------------------------------

        String name = "Michael";

        boolean l = name.startsWith("Da");

        System.out.println(l);//false


        String url = "www.cydeo.com";

        boolean l2 = url.startsWith("www.");

        System.out.println(l2);//true

        boolean t = url.endsWith(".com");

        System.out.println(t);//true

        //---------------------------------------------------------

        String email = "CydeoSchool@gmail.com";

        boolean isGmail = email.endsWith("gmail.com");

        boolean isYahoo = email.endsWith("yahoo.com");

        boolean isHotmail = email.endsWith("hotmail.com");

        System.out.println("isGmail = " + isGmail); //true
        System.out.println("isYahoo = " + isYahoo);//false
        System.out.println("isHotmail = " + isHotmail);//false




    }
}
