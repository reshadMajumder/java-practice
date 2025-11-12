package cars;

abstract class Vehicle{
    String brand;

    String model;

    int year;

    public Vehicle(String brand ,String model ,int year){
        this.brand=brand;
        this.model = model;
        this.year = year;
    }

    abstract void start();

    abstract void stop();

    public void displayInfo(){
        System.out.println("brand : "+this.brand + " model: "+ this.model+ " year: "+this.year);

    }
}