package lesson12.src.com.geekhub.javalessons.task3;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GetSizeOfHtml implements Runnable {

    List list = Collections.synchronizedList(new ArrayList());
    File file = new File("/home/vitaliy/IdeaProjects/" +
            "geekhub-java4web-season7/lesson12/src/com/geekhub/javalessons/urls.txt");

    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        String line;
        while ((line = br.readLine()) != null) {
            Document document = Jsoup.connect(line).get();
            Elements elements = document.getAllElements();
            System.out.println(elements.text().length());
        }
    }catch (IOException e){
        e.getMessage();
    }


    }
}
