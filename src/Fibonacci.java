
public class Fibonacci {
    private Fibonacci() {
    }
//Просторова складність: O(1) - стала
//Часова складність: O(n) - лінійна
    public static int iterativeFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }

        return fib;
    }
//Просторова складність: O(n) - глибина викликів рекурсії, залежить від n.
//Часова складність: O(2^n) - експоненційна.
    public static int recursiveFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }


//Просторова складність: O(n) - кількість збережених проміжних результатів, залежить від n.
//Часова складність: O(n) - лінійна, 
    public static int dynamicProgrammingFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }

    public static Fibonacci createFibonacci() {
        return new Fibonacci();
    }
}


