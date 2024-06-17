package lambda.Challenge110;
//110.	Create your own functional interface with a
// single abstract method that accepts an integer and
// returns a boolean. Implement it using a lambda that
// checks if the number is prime.

public class Challenge110{
    public static void main(String[] args) {

        //Defining the abstract method of FunctionalInterface PrimeChecker
        PrimeChecker number = num -> { //this is also a lambda function
            if(num <= 1)
                return false;
            for (int i = 2; i < num; i++) {
                if(num % i == 0)
                    return false;
            }
            return true;
        };

        System.out.println(number.isPrime(17));
        System.out.println(number.isPrime(10));
        System.out.println(number.isPrime(1));
        System.out.println(number.isPrime(2));


    }

}
