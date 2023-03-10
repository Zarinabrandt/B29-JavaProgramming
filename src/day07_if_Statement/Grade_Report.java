package day07_if_Statement;

public class Grade_Report {

    public static void main(String[] args) {

        int score = 85; // 0~100
        String result = "";

        if (score >= 90){ //false score < 90
            result = "a";
        } else if (score >= 80) {//false score < 80
            result = "B";
        } else if (score >= 70) {//false score < 70
            result = "C";
        } else if (score >= 60) {//false score < 60
            result = "D";
        }else {
            result = "F";
        }

        System.out.println("Your grade is: " + result);


    }

}
