//111.	Write two versions of a program that calculates
// the factorial of a number: one using structural (procedural)
// programming, and the other using functional programming.

package lambda.Challenge111;

public class FactorialUsingProceduralMethod {

    public int factorial(int num){
        if(num == 0 || num == 1) return 1;

        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
