package in.kgcoding.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Challenge98 {
    public static void main(String[] args) {

        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("India","New Delhi");
        countryMap.put("USA","Washington DC");
        countryMap.put("Russia","Moscow");
        countryMap.put("China","Beijing");
        countryMap.put("Nepal","Kathmandu");
        countryMap.put("Bhutan","Thimphu");
        countryMap.put("Bangladesh","Dhaka");

        Scanner sc = new Scanner(System.in);
        System.out.print("\nPlease enter country name to know its capital: ");
        String countryName = sc.next();
        //findCapital(countryMap,countryName);    //long method

        //Direct method
        if(countryMap.containsKey(countryName))
            System.out.println(countryMap.get(countryName) + " is the capital of "+countryName+".");
        else
            System.out.println("Data not found!");

    }

    static void findCapital(Map<String, String> countryMap, String countryName){
        boolean token = false;
        for (String key : countryMap.keySet()) {
            if(key.equalsIgnoreCase(countryName)) {
                System.out.println(key + " : " + countryMap.get(key));
                token = true;
            }
        }
        if(!token)
            System.out.println("Data not found!");
    }
}
