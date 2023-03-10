package day08_ternary_switch;

public class Switch_intro {
    public static void main(String[] args) {

        char grade = 'E';

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F' :
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid");
        }

    }
}
