package day17_CustomClass;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.setInfo("Molly",39,'F',"Developer",110000,"A245");

        Employee employee2 = new Employee();
        employee2.setInfo("Irina", 41,'F',"Backend Developer", 98000,"A12");

        Employee employee3 = new Employee();
        employee3.setInfo("Rifat",40,'M',"SDET",95000,"A54");

        Employee employee4 = new Employee();
        employee4.setInfo("Natalie", 37,'F',"HR", 45000,"A78");


        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);

        employee3.work();

    }
}
