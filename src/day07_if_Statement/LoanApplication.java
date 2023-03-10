package day07_if_Statement;

public class LoanApplication {

    public static void main(String[] args) {

        int salary = 55000;
        int creditScore = 780;

        String result = "";

        if (salary >= 45000 && creditScore >= 700){
            result = "Eligible apply for the loan";
        }else {
            result = "Not eligible for the loan";
        }
        System.out.println(result);



    }

}
