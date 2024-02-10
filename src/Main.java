
import static java.lang.System.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n = 10;
        out.println("Iterative Fibonacci: " + Fibonacci.iterativeFibonacci(n));
        out.println("Recursive Fibonacci: " + Fibonacci.recursiveFibonacci(n));
        out.println("Recursive Fibonacci: " + Fibonacci.dynamicProgrammingFibonacci(n));


    }
}