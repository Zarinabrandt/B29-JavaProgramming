package day28_Encapsulation.Encapsulation;

public class TestEmployeeObject {
    public static void main(String[] args) {

        /*
        Employee employee1 = new Employee();
        //employee1.salary = -200000;

        employee1.setSalary(100000);
        System.out.println( employee1.getSalary());

        //employee1.setName("");
        System.out.println( employee1.getName());
         */


        Employee employee1 = new Employee("Karina",30,"Java Developer",100000);

        // if there is any error it will exit and won't print anything else accept error message

        System.out.println(employee1);

    }
}
