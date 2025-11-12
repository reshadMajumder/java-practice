import cars.Car;
import cars.Bike;
import cars.Truck;


public class Main{
    public static void main(String[] args){
        Car c = new Car("volvo","extreeme",2000);

        Bike  b = new Bike("yamaha","xi",2000);
        Truck T = new Truck("mahindra","tRUCK",9000);


        c.start();
        c.stop();

        b.start();
        b.stop();
        T.start();
        T.stop();  

        T.displayInfo();   

    }
}