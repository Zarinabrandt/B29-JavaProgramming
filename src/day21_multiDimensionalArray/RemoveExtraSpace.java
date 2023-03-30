package day21_multiDimensionalArray;

public class RemoveExtraSpace {
    public static void main(String[] args) {

        String str = "  Hello world      I      love      Java    ";

        //str = str.trim(); // it trims at beginning and at the end //unnecessary

        //System.out.println(str); //unnecessary

        String[] words = str.split(" ");

        //System.out.println(Arrays.toString(words)); //unnecessary

        str = "";

        for ( String each : words ){
            if(!each.isEmpty()){
                str += each+ " ";
            }
        }

        str = str.trim(); //for the last space
        System.out.println(str);



    }
}
/*
1. Write a program that can remove all the extra space from string
			Ex:
				str = "  Hello world      I      love      Java    "
        	Output:
        		Hello world I love Java
 */