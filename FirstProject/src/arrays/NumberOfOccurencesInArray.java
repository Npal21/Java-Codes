package arrays;//41.	Create a program to find number of occurrences of an element in an array.

import java.util.Scanner;

public class NumberOfOccurencesInArray {

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

    int acceptUserInputOccurrence(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an element to find out its occurrence count: ");
        return sc.nextInt();
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

    public int numberOfOccurrencesOfAnElement(int[] arr, int n){
        int count = 0;
        for(int e : arr)
            if(e == n)
                count++;
        return count;
    }
    public static void main(String[] args) {
        NumberOfOccurencesInArray ref = new NumberOfOccurencesInArray();
        int[] array = ref.acceptUserInputArray();
        ref.displayArray(array);
        int element = ref.acceptUserInputOccurrence();
        System.out.println("Element "+element+" occurs "+ref.numberOfOccurrencesOfAnElement(array,element)+" times.");


    }
}
