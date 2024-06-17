package arrays;//42.	Create a program to find the maximum and minimum element in an array.

import java.util.Scanner;

public class MinMaxArray {
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

    int minimumElementOfArray(int[] a){
        int minElement = 0;
        for(int i=0;i<a.length-1;i++) {
            if (a[i] < a[i + 1] && a[i] <= minElement)
                minElement = a[i];
        }
        if(minElement > a[a.length-1])
            minElement = a[a.length-1];
        return minElement;
    }
    int maximumElementOfArray(int[] a) {
        int maxElement = a[0];
        for(int i=0;i< a.length-1;i++){
            if(a[i+1] > a[i] && maxElement <= a[i+1])
                maxElement = a[i+1];
        }
        if(maxElement < a[a.length-1])
            maxElement = a[a.length-1];
        return maxElement;
    }

    public static void main(String[] args) {
        MinMaxArray ref = new MinMaxArray();
        //int[] arr = ref.acceptUserInputArray();
        int[] arr = new int[]{10,34, 78, 244,78,0};
        ref.displayArray(arr);
        System.out.println("The minimum element in array: "+ ref.minimumElementOfArray(arr));
        System.out.println("The maximum element in array: "+ ref.maximumElementOfArray(arr));
    }


}
