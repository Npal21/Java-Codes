public class StringDemo {

    public static void main(String[] args) {

        String str = new String("Nidhi"); //String is a class and str is a reference object
        String name1 = "Nidhi";
        String name2 = "Nidhi";
        if(str == name1)     //FALSE ie.str and name store different addresses
            System.out.println(true);
        else System.out.println(false + " ie. 'str and name' store different addresses. They do not point to the same memory location.");

        if(name2 == name1) //TRUE
            System.out.println(true +" ie. 'Name and name' point to the same memory location in String Constant Pool.");

        //======================CONCATENATION=============================================================================
        String fullName = name1 + " Pal";
        System.out.println(fullName+"- A new string is created and the earlier memory of 'name' becomes available for garbage collection.");

        //String methods
        System.out.println(name2.charAt(2));            //d
        System.out.println(fullName.toUpperCase());     //NIDHI PAL
        System.out.println(fullName.toCharArray());     //Nidhi Pal
        System.out.println(fullName.compareTo(name2));  //4--> Return 0 if completely same;Returns +ve no.when some part is same ; returns -ve no.when nothing is same
        System.out.println(fullName.codePointCount(0,fullName.length()-1));       //8
        System.out.println(fullName.trim());        //removes all leading and trailing spaces


    }


}
