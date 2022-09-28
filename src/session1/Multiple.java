package session1;

public class Multiple {

    public static int iterativeMultiple(int a, int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += a;
        }
        return result;
    }

    public static int recursiveMultiple(int a, int n) {
        if (n == 1) return a;
        return recursiveMultiple(a, n - 1) + a;
    }

    public static void main(String[] args) {
        System.out.println("multiple = " + iterativeMultiple(3, 5));
        System.out.println("multiple = " + recursiveMultiple(3, 5));
    }
}
