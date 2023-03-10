package day11_string;

public class String_methods_2 {
    public static void main(String[] args) {

        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";

        sentence = sentence.replace("Python","Java");

        System.out.println(sentence);

        //------------------------------------------------------------

        String word = "java";

        //word = word.replace('a', 'e');//"jeve" //this is re-assigning as character in this line 16, another method is re-assign as a string ↓

        word = word.replace("a", "e");// new string

        System.out.println(word);

        //------------------------------------------------------------

        String sentence2 = "I love Java, Java is cool";

        //sentence2 = sentence2.replace("Java", "Python"); //this works with replace all "Java"

        sentence2 = sentence2.replaceFirst("Java", "Python");// this will replace only first "Java" with "Python"

        System.out.println(sentence2);

        //------------------------------------------------------------

        String sentence3 = "Java is fun, Java is cool, Java is amazing";

        //sentence3 = sentence3.replace("Java", "Python");

        sentence3 = sentence3.replaceFirst(", Java", ", Python");// it will replace first ", Java"

        System.out.println(sentence3);

        //-------------------------------------------------------------

        String sentence4 = "I love Java Programming";
        //                  012345678910
        String languageName = sentence4.substring(7, 10+1);

        System.out.println(languageName);

        //-----------------------------------------------------------

        String sentence5 = "Today is Sunday, Tomorrow is Monday";
        //                  0123456789....14(y)

        String today = sentence5.substring(9, 14+1);

        System.out.println(today);

        //-------------------------------------------------------------

        String email = "CydeoSchoolJavaProgramming@yahoo.com";

        int beginning = email.indexOf('@') + 1;//trying to get domain "gmail"
        int ending = email.lastIndexOf('.');

        String domain = email.substring(beginning, ending);

        System.out.println(domain);

        //-----------------------------------------------------------

        String sentence6 = "I love Java programming";

        //String beginning2 = sentence6.substring(7, sentence6.length());
        String beginning2 = sentence6.substring(7);

        System.out.println(beginning2);

        //----------------------------------------------------

        String sentence7 = "Today is Sunday, tomorrow is Monday";

        String tomorrow = sentence7.substring( sentence7.lastIndexOf(' ') + 1);

        System.out.println(tomorrow);

        //------------------------------------------------------
        String sentence8 = "I study at Cydeo School";

        String schoolName = sentence8.substring(11);

        System.out.println(schoolName);

        System.out.println("----------------------------------------------");

        String str = "Python";

        String result = (str+"\n").repeat(10);

        System.out.println(result);


        

    }
}
