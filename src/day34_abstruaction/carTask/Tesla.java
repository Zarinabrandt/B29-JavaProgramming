package day34_abstruaction.carTask;

public class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Use voice control to start "+getModel());
    }

    public void autoPilot(){
        System.out.println(getMake()+ " "+getModel()+" has auto pilot feature");
    }

}