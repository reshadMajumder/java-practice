package cars;
import cars.Vehicle;

public class Bike extends Vehicle{
    public Bike(String brand,String model,int year){
        super(brand,model,year);
    }
    public void start(){
        System.out.println("the bike is starting...");
    }
    public void stop(){
        System.out.println("the Bike is stopping...");


    }
}
