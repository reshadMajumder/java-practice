package shapes;

public class Shape{
    String color;
    int height;
    int length;

    public Shape(String color, int height, int length){
        this.color = color;
        this.height = height;
        this.length = length;
    }

    public int heightXlength(){
        return height*length;
    }

}



