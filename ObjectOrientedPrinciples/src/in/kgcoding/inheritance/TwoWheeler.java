package in.kgcoding.inheritance;

public class TwoWheeler extends Vehicle{

    protected TwoWheeler(){
        setTyres(2);
    }
    public void balance(){
        System.out.println("I am balancing on 2 tyres.");
    }
}
