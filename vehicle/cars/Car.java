package cars;
import cars.Vehicle;

public class Car extends Vehicle{


    public Car(String brand,String model,int year){
        super(brand,model,year);
    }

    public void start(){
        System.out.println("the car is starting...");
    }
    public void stop(){
        System.out.println("the car is stopping...");


    }
}