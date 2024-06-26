package in.kgcoding.abstraction;

public class Square extends Shape{
    int side;

    public Square(int side){
        this.side = side;
    }

    double calculateArea(){
        return side*side;
    }
}
