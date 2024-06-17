package arrays;//43.	Create a program to check if the given array is sorted.
import java.util.Scanner;

public class SortedArray {

    int[] acceptUserArray(){

        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Please enter the elements of array: ");
        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        return a;
    }

    void displayArray(int[] a){
        for(int e : a){
            System.out.print(e+",");
        }
        System.out.println();
    }
    boolean isAscending(int[] a){
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1])
                return false;
        }
        return true;
    }
    boolean isDescending(int[] a){
        for(int i=0;i<a.length-1;i++){
            if(a[i]<a[i+1])
                return false;
        }
        return true;
    }
    boolean isSorted(int[] a){
        if(isAscending(a) || isDescending(a))
            return true;
        return false;
    }
    public static void main(String[] args) {
        SortedArray ref = new SortedArray();
        int[] arr = ref.acceptUserArray();
        ref.displayArray(arr);
        System.out.println("Ascending: "+ref.isAscending(arr));
        System.out.println("Descending: "+ref.isDescending(arr));
        System.out.println("Is sorted?: "+ref.isSorted(arr));


    }
}
