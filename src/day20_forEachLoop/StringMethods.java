package day20_forEachLoop;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Cydeo School";

        char[] ch = str.replace(" ","").toCharArray();

        System.out.println(Arrays.toString(ch));

        System.out.println("------------------------------------");

        String str2 = "Today is a great day to learn java";

        String[] words = str2.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("------------------------------------");

        String sentence = "I love Java"; //expecting reverse


        String[] arr = ArraysUtility.reverse(sentence.split(" ")); // [ I, love, Java]

        System.out.println(Arrays.toString(arr));

        String reverseSentence = "";//Java love I

        for (int i = 0; i < arr.length; i++) {
            reverseSentence += arr[i] + " ";
        }

        System.out.println(reverseSentence);




    }
}
