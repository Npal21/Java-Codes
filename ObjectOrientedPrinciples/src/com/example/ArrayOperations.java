package com.example;

public class ArrayOperations {

    static int[] array;

    static{
        array = new int[] {1,2,3,4};
    }

    static class Statistics{

        double mean(){
            double sum=0;
            for(int e : array){
                sum += e;
            }
            return sum/array.length;
        }

        float median(){
            return 0;
        }

    }
}

class ArrayOperationsTest{
    public static void main(String[] args) {
        ArrayOperations a = new ArrayOperations();
        ArrayOperations.Statistics s = new ArrayOperations.Statistics();
        System.out.println(s.mean());


    }
}
