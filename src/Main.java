
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        out.println("Iterative Fibonacci: " + Fibonacci.iterativeFibonacci(n));
        out.println("Recursive Fibonacci: " + Fibonacci.recursiveFibonacci(n));
        out.println("Recursive Fibonacci: " + Fibonacci.dynamicProgrammingFibonacci(n));


    }
}
