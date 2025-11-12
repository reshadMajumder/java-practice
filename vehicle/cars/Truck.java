package cars;
import cars.Vehicle;

public class Truck extends Vehicle{
    public Truck(String brand,String model,int year){
        super(brand,model,year);
    }
    public void start(){
        System.out.println("the truck is starting...");
    }
    public void stop(){
        System.out.println("the truck is stopping...");


    }
}
