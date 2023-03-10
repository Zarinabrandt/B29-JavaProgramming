package day06_IfStatements;

public class Grade_Level_Two {

    public static void main(String[] args) {

        int gradeLevel = 1;

        String result = ""; // temporary value

        if (gradeLevel >= 1 && gradeLevel <= 5){
            System.out.println("Elementary SChool"); ;
        }
        if (gradeLevel >= 6 && gradeLevel <= 8){
            result = "Middle School";
        }
        if (gradeLevel >= 9 && gradeLevel <= 12){
            result = "High School";
        }
        if (gradeLevel >= 13 && gradeLevel <= 16){
            result = "College";
        }
        if (gradeLevel >= 17 && gradeLevel <=18){
            result = "Grade School";
        }

        System.out.println(result);




    }

}
