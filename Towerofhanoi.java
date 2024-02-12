import java.util.*;
public class Towerofhanoi {
    static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base case: Return n if it's 0 or 1
        } else {
            // Recursive call to calculate Fibonacci number using previous two numbers
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10; // Change this value to calculate a different Fibonacci number
        for (int i = 0; i <=n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    }
    

