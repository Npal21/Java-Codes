package arrays;
import arrays.NumberOfOccurencesInArray;
import java.util.Scanner;

//44.	Create a program to return a new array deleting a specific element.
public class DeleteArrayElement {

    public int acceptElementToDelete(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the element of array which you wish to delete:");
        return sc.nextInt();
    }

    public int[] deleteArrayElement(int[] arr, int ele){

        NumberOfOccurencesInArray obj = new NumberOfOccurencesInArray();
        int occ = obj.numberOfOccurrencesOfAnElement(arr,ele);
        if (occ == 0)
            return arr;

        int[] new_arr = new int[arr.length-occ];
        for(int i=0,j=0; i<=arr.length-1; i++){
            if(arr[i] != ele){
                new_arr[j] = arr[i];
                j++;
            }
        }
        return new_arr;
    }

    public static void main(String[] args) {
        SumOfAllElementsOfArray ref= new SumOfAllElementsOfArray();
        int[] arr = ref.acceptUserInputArray();
        ref.displayArray(arr);

        DeleteArrayElement ref2 = new DeleteArrayElement();
        int element = ref2.acceptElementToDelete();
        System.out.println("Array after deleting element "+ element+" : ");
        ref.displayArray(ref2.deleteArrayElement(arr, element));



    }

}
//25, 8, 36, 9, 45, 8, 4