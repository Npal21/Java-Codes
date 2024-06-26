class Company{
    private int cmp_id;
    private String cmp_name;
    private String cmp_address;

    public Company(){           //default constructor
        this.cmp_id = 0;
        this.cmp_name = "Radhe";
        this.cmp_address = "Noida";
    }

    public Company(String cmp_name, String cmp_address){        //Parameterised constructor
        this.cmp_id = 0;
        this.cmp_name = cmp_name;
        this.cmp_address = cmp_address;
    }

    public int getCmp_id(){
        return cmp_id;
    }
    public String getCmp_name(){
        return cmp_name;
    }
    public String getAddress(){
        return cmp_address;
    }

    public void setCmp_id(int cmp_id){
        this.cmp_id = cmp_id;               //this refers to the current object which is calling the method
    }
    public void setCmp_name(String cmp_name){
        this.cmp_name = cmp_name;           //We can use the same name of local and instance variable
    }
    public void setAddress(String cmp_address){
        this.cmp_address = cmp_address;
    }
}

public class EncapsulationDemo {


    public static void main(String[] args) {
        Company ref = new Company();
        Company ref2 = new Company();
        ref.setCmp_id(1);
        ref.setCmp_name("Hiralal and sons");
        ref.setAddress("Bhusawal");

        ref2.setCmp_id(2);
        ref2.setCmp_name("Rameshwaram and sons");
        ref2.setAddress("Pune");

        Company ref3 = new Company("Radheshyam Group","Vrindavan");
        ref3.setCmp_id(3);

        System.out.println(ref.getCmp_id() + " : "+ref.getCmp_name() +" : "+ref.getAddress());
        System.out.println(ref2.getCmp_id() + " : "+ref2.getCmp_name() +" : "+ref2.getAddress());
        System.out.println(ref3.getCmp_id() + " : "+ref3.getCmp_name() +" : "+ref3.getAddress());

    }
}
