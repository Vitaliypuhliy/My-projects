package lesson12.src.com.geekhub.javalessons.task1;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class GetCodeOfResponce implements Runnable{
    private List<String> list = new ArrayList<>();
    public GetCodeOfResponce() {
    }

    @Override
    public void run() {
        URL url= null;
        try {
            for (String l:list) {
                url = new URL(l);
                URLConnection connection = url.openConnection();
                connection.connect();

                HttpURLConnection httpConnection = (HttpURLConnection) connection;

                int code = httpConnection.getResponseCode();

                System.out.println(code);
            }
        } catch ( IOException e) {
            e.printStackTrace();
        }
    }


    public void getListLinks(String str){
        Document doc = null;
        try {
            doc = Jsoup.connect(str).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Elements link = doc.select("a");
        Connection.Response response = null;

        for (Element l:link){
            String absHref = l.attr("abs:href");
            list.add(absHref);
            //response = Jsoup.connect(l.);
            System.out.println(response);
        }
    }
}
