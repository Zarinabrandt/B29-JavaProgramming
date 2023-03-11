package utilities;

public class String_Utility {

    public static String reverse(String str){

        String reverse = "";

        for (int i = str.length()-1;i >= 0; i--){  // if word/characters are unknown
            reverse += str.charAt(i);
        }

        return reverse;

    }


}
