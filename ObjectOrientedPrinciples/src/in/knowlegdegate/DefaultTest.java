package in.knowlegdegate;

import in.kgcoding.Car;

public class DefaultTest {
    public static void main(String[] args) {
        Car car = new Car("Yellow","Desire",400000,5);
        //car.costOfPurchase = 3000;        //default cant be used outside package=make it public

        Default d = new Default();  //this class has default access,hence we can access within package

    }
}
