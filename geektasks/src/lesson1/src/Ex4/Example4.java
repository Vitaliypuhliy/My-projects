package lesson1.src.Ex4;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("pls input prime number");
        n = in.nextInt();
        checkWin(in, n);
    }

    public static void checkWin(Scanner in, int number) {
        boolean isWin = false;
        while(!isWin){
            if(isPrime(number)){
                System.out.println("Congratulations");
                isWin = true;
            }
            else{
                System.out.println("Write one more");
                number = in.nextInt();
            }
        }
        return;
    }

    static boolean isPrime(int number) {
        if(number == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;

    }

}
