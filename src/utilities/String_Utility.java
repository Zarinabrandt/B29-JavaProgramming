package utilities;

public class String_Utility {

    public static String reverse(String str){

        String reverse = ""; // to contain all the characters of the given string in reverse

        for (int i = str.length()-1;i >= 0; i--){  // if word/characters are unknown i: index number of the given string starting from last index to index 0
            reverse += str.charAt(i); // to get each character of the string from last index to index zero
        }

        return reverse;

    }


}
