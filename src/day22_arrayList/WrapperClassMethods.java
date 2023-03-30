package day22_arrayList;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "20";

        System.out.println(str + 1); //concatenation

        // Integer num1 = Integer.parseInt(str); // unboxing

        int num = Integer.parseInt(str); // parse method, parseInt

        System.out.println(num + 1);

        Integer num2 = Integer.valueOf(str);

        System.out.println(num2);

        System.out.println("--------------------------------------------------------");

        String s = "20.5";

        double num3 = Double.parseDouble(s);

        Double num4 = Double.valueOf(s);

        System.out.println(num3);
        System.out.println(num4);

        System.out.println("--------------------------------------------------");

        String x = "false"; // boolean can be only true or false it can Not be anything else

        boolean r1 = Boolean.parseBoolean(x);

        Boolean r2 = Boolean.valueOf(x);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("--------------------------------------------------");

        char ch = '$'; //or '1' if you want digit, or 'A' if you want upper case isLetter

        boolean isDigit = Character.isDigit(ch);

        boolean isLetter = Character.isLetter(ch);

        boolean isLowerCaseLetter = Character.isLowerCase(ch);

        boolean isUpperCaseLetter = Character.isUpperCase(ch);

        boolean isSpecialChar = !Character.isLetterOrDigit(ch); // special character

        System.out.println("isDigit = " + isDigit);
        System.out.println("isLetter = " + isLetter);
        System.out.println("isLowerCase = " + isLowerCaseLetter);
        System.out.println("isUpperCase = " + isUpperCaseLetter);
        System.out.println("isSpecialCharacter = " + isSpecialChar);

        System.out.println("--------------------------------------------------");

        String string = "a1b2c3d4e5";

        int sum = 0;

        for (char each : string.toCharArray()) {

            if (Character.isDigit(each)){
               sum += Integer.parseInt(""+each);
            }

        }
        System.out.println("sum = " + sum);


    }
}
