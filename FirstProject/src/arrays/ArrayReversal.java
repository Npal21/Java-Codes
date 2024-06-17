package arrays;
//45.	Create a program to reverse an array.
//46.	Create a program to check is the array is palindrome or not.

public class ArrayReversal {

    int[] reverseArray(int[] a){
        int x = 0, j = a.length-1;
        for(int i=0; i<a.length/2; i++){
            x= a[i];
            a[i] = a[j];
            a[j] = x;
            j--;
        }
        return a;
    }

    boolean isPalindrome(int[] a){
        for(int i=0,j=a.length-1; i<=a.length-1 ; i++,j--){
            if(a[i] != a[j])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        SumOfAllElementsOfArray ref= new SumOfAllElementsOfArray();
        int[] arr = ref.acceptUserInputArray();
        ref.displayArray(arr);

        ArrayReversal ref2 = new ArrayReversal();
        System.out.println("The reversed array is: ");
        ref.displayArray(ref2.reverseArray(arr));

        System.out.println("Is the array palindrome? "+ref2.isPalindrome(arr));

    }
}

