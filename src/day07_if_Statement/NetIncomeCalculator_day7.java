package day07_if_Statement;

public class NetIncomeCalculator_day7 {

    public static void main(String[] args) {

        int salary = 100000;
        double taxRate = 0;
        boolean isMarried = true;

        if (salary >=200000){
            taxRate = 0.35;
        }
        if (salary >= 100000 && salary < 130000){
            taxRate = 0.3;
        }
        if (salary >= 80000 && salary < 100000 ){
            taxRate = 0.25;
        }
        if (salary < 80000 ){
            taxRate = 0.2;
        }


        if (isMarried){// if the person is married
            taxRate -= 0.05;//tax is reduced by 5%
        }

        double netIncome = salary * (1-taxRate);

        System.out.println("netIncome = " + netIncome);


    }


}
