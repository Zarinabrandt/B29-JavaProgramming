package day07_if_Statement;

public class Grade {

    public static void main(String[] args) {

        char grade = 'A';
        String result = "";

        if (grade == 'A'){
            result = "Excellent";
        }else if (grade == 'B'){
            result = " Great job";
        }else if (grade == 'C'){
            result = "Good";
        }else if (grade == 'D'){
            result = "Passed";
        }else{
            result = "Failed";
        }
        System.out.println(result);






    }

}
