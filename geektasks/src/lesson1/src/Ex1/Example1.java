package lesson1.src.Ex1;

public class Example1 {
    public static void main(String[] args) {

        for (int i = 1000; i >= 1; i--) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;

    }
}
