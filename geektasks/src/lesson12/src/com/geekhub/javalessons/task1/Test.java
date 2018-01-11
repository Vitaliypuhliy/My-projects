package lesson12.src.com.geekhub.javalessons.task1;

import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        String string = new String("https://www.wikipedia.org/");
        GetCodeOfResponce getCodeOfResponce = new GetCodeOfResponce();
        getCodeOfResponce.getListLinks(string);
        Thread thread = new Thread(getCodeOfResponce);
        thread.start();

    }
}
