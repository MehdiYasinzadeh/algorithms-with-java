package session1;

public class Factorial {
    public static int directFactorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static int recursiveFactorial(int num) {
        if (num == 1) return 1;
        return num * recursiveFactorial(num - 1);
    }

    public static void main(String[] args) {
        System.out.println("factorial = " + directFactorial(3));
        System.out.println("factorial = " + recursiveFactorial(3));
    }
}
