package lesson1.src.Ex3;

import java.io.*;

public class Example3 {
    public static void main(String[] args) {
        int alphabetCount = 26;
        char array[] = new char[alphabetCount];
        int i = 0;
        for (char c = 'A'; c <= 'Z'; c++) {
            array[i] = c;
            i++;
        }
        for (int j = 0; j < array.length; j++) {
            array[j] = Character.toLowerCase(array[j]);
        }
        System.out.println(array);
    }
}
