package arrays;//40.	Create a program to find the sum and average of all elements in an array.

import java.util.Scanner;

public class SumOfAllElementsOfArray {

    int[] acceptUserInputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter elements of an array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    void displayArray(int[] arr){
        System.out.print("Array : ");
        for(int i=0; i<arr.length;i++){
            if(i==(arr.length-1))
                System.out.println(arr[i]+".");
            else
                System.out.print(arr[i]+", ");
        }
    }

    int sumOfArray(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            if(i==0)
                sum += arr[i]+arr[i+1];
            else
                sum += arr[i+1];
        }
        return sum;
    }

    float averageOfArrayElements(int[] arr){
        int avg = 1;
        return (float)sumOfArray(arr)/arr.length;   }

    public static void main(String[] args) {
        SumOfAllElementsOfArray obj = new SumOfAllElementsOfArray();
        int[] myArray = obj.acceptUserInputArray();
        obj.displayArray(myArray);
        System.out.println("Sum of all elements of the array= "+ obj.sumOfArray(myArray));
        System.out.println("Average of all elements of the array= "+ obj.averageOfArrayElements(myArray));

    }


}
