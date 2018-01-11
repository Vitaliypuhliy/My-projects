package lesson3.src.PCInfo;

import java.io.File;

public class PCInfo {

    public static void main(String args[]) {

        int megaByte = 1024 * 1024;

        Runtime instance = Runtime.getRuntime();
        System.out.println(" -----------Number in megaBytes-------");
        System.out.println("Total Memory: " + instance.totalMemory() / megaByte);

        System.out.println("Free Memory: " + instance.freeMemory() / megaByte);

        System.out.println("Used Memory: "
                + (instance.totalMemory() - instance.freeMemory()) / megaByte);

        System.out.println("Max Memory: " + instance.maxMemory() / megaByte);

        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("number of cores = " +cores);

        long diskSize = new File("/").getTotalSpace()/megaByte;
        System.out.println("All memory = " + diskSize);
    }
}


