package lesson1.src.Ex2;

import java.util.*;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arg = isInput(args);
        if(arg > 10 && arg < 20){
            System.out.println(" Warning print y for continue" +
                    "end everything for input new number ");
            String new_input = in.nextLine();
            char c =  new_input.charAt(0);
            System.out.println(c);
            if (c != 'y') {
                arg = in.nextInt();
            }
        }
        else if(arg < 0) {
            return;
        }  else {
            System.out.println(" Argument is good ");
        }

        int fact = getFact(arg);

        System.out.printf("fact = %d" , fact);
    }

    public static int getFact(int arg) {
        int fact = 1;
        for(int i = 2 ; i <= arg ; i++) {
            fact *= i;
        }
        return fact;
    }

    private static int isInput(String[] args) {
        if (args.length == 0) {
            return  5;
        }else {
            return Integer.parseInt(args[0]);
        }
    }
}
