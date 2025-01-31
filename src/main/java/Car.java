public class Car {
    String model;
    String color;
    int horsePower;

    {
        this.model = "Camry";
        this.color = "Black";
        this.horsePower =200;
    }

    public void startCar(){
        System.out.println("Vehicle started...");
    }

    public void stopCar(){
        System.out.println("Vehicle stopped...");
    }
}


