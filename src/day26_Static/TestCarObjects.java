package day26_Static;


public class TestCarObjects {
    public static void main(String[] args) {

        Car car1 = new Car("BMW");
        System.out.println(car1);

        Car car2 = new Car("Audi", "Q4");
        System.out.println(car2);

        Car car3 = new Car("Toyota","Camry",2021);
        System.out.println(car3);

        Car car4 = new Car("Honda","Insight",2019, 30000);
        System.out.println(car4);

        Car car5 = new Car("Kia","Sportage",2023,45000,"Moon Gray");
        System.out.println(car5);


    }
}
