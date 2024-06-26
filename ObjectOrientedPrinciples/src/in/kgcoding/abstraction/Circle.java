package in.kgcoding.abstraction;

public class Circle extends Shape{

    int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI*radius*radius;
    }
}
