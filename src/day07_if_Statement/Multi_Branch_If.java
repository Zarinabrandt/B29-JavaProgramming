package day07_if_Statement;

public class Multi_Branch_If {

    public static void main(String[] args) {

        int num = -9;

        String result = "";

        if (num > 0){
            result = "Positive";
        } else if (num < 0) {
            result = "Negative";
        }else{
            result = "Zero";
        }

        System.out.println(result);

    }

}
