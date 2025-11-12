package shapes;
import shapes.Shape;

public class Ractangle extends Shape{

    public Ractangle(String color, int height, int length){
        super(color, height, length);
    }

    public String elements(){
        return " the color is : "+ this.color+"height is : "+this.height+"the length is " +this.height;
    }

}