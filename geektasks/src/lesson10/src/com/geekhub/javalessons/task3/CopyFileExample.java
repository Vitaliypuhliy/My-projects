package lesson10.src.com.geekhub.javalessons.task3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class CopyFileExample
{
    public static void main(String[] args)
    {
        File afile =new File("/home/vitaliy/Downloads/Atlantida.avi");
        File bfile =new File("/home/vitaliy/Downloads/Atlantida2.avi");
        File cfile =new File("/home/vitaliy/Downloads/Atlantida3.avi");
        long time1,time2,time3,time4;
        System.out.println("print -1 for copyingWithBuffering , 1 for" +
                "copyingWithoutBuffering and 0 for both ");
        int withBuffer = input();


        //with buffer coping faster in 100 times for my example with
        //video 1.5 GB


        try(InputStream inStream = new FileInputStream(afile);
        OutputStream outStream = new FileOutputStream(bfile)){
            if (withBuffer == -1 || withBuffer == 0) {
                time1 = System.currentTimeMillis();
                copyingWithBuffering(inStream, outStream);
                time2 = System.currentTimeMillis();
                System.out.println(time2 - time1);
            }
            if (withBuffer == 1 || withBuffer == 0) {
                time3 = System.currentTimeMillis();
                copyingWithoutBuffer(afile, cfile);
                time4 = System.currentTimeMillis();
                System.out.println(time4 - time3);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        int withBuffer = in.nextInt();
        return withBuffer;
    }

    public static void copyingWithBuffering(InputStream inStream, OutputStream outStream) throws IOException {
        byte[] buffer = new byte[4024];

        int length;
        //copy the file content in bytes
        while ((length = inStream.read(buffer)) > 0){

            outStream.write(buffer, 0, length);

        }
        System.out.println("File is copied successful!");
    }
    public static void copyingWithoutBuffer(File source, File destination) throws IOException {
        try (InputStream in = new FileInputStream(source);
             OutputStream out = new FileOutputStream(destination)
        ) {
            int b;
            while((b = in.read()) != -1) {
                out.write(b);
            }
            System.out.println("well done");
        }
    }
}
