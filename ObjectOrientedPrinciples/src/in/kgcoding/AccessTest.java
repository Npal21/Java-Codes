package in.kgcoding;

//import in.knowlegdegate.Default;

public class AccessTest {
    public static void main(String[] args) {
        Car car =new Car();
        car.color = "Red";
        car.model = "Swift";
        car.costOfPurchase = 3000;    //default member can be accessed within package
        System.out.println(car);

        Car car1 = new Car("Blue","Buggati",3000000, 1);
        System.out.println(car1);

        //in.knowlegdegate.Default d = new in.knowlegdegate.Default();      //Error bco this class had default access,
                                                                            //hence cant be used outside the package.
    }
}
