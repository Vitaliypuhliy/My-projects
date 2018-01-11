package lesson3.src.writeViceVersa;

import java.util.Scanner;

public class WriteViceVersa {
    public static void main(String[] args) {
        String line = inputLine();

        char firstLetter1 = line.charAt(0);
        if (Character.isLowerCase(firstLetter1)) {
        System.out.println(line.toUpperCase());
        }else {
        System.out.println(line.toLowerCase());
        }
    }
    static String inputLine(){
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        return line;
    }
}
