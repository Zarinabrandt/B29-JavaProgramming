package day14_For_Loop;

public class String_Reverse {
    public static void main(String[] args) {

        //String str = "Java"; //"avaJ"  is if characters are known
        String str = "Cydeo School";

        String reverse = ""; //"avaJ"

        /*
        for (int i = 3; i >= 0; i--){  //        //String str = "Java"; //"avaJ"  is if characters are known

            reverse += str.charAt(i);
        }
         */

        for (int i = str.length()-1;i >= 0; i--){  // if word/characters are unknown
            reverse += str.charAt(i);
        }

        System.out.println(reverse);

        System.out.println("-------------------------------------------------------");

        String name = "Mukhabbat Aldanovna";

        String result = reverse(name);

        System.out.println(result);


    }


    public static String reverse(String str){

        String reverse = "";

        for (int i = str.length()-1;i >= 0; i--){  // if word/characters are unknown
            reverse += str.charAt(i);
        }

        return reverse;

    }


}
