import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    public static void main(String[] args) throws IOException {
        String url = "https://ua.sinoptik.ua/";
        Document page= Jsoup.parse(new URL(url),3000);
        Element table = page.select("div[class = tabs]").first();
        Elements numbers = table.select("p[class = date]");
        Elements freeDay = table.select("p[class =date dateFree]");
        Elements temperatureMin = table.select("div[class = min]");
        Elements temperatureMax = table.select("div[class = max]");
        List<Integer> listDate = new ArrayList<>();
        List<Element> listMinTemp = new ArrayList<>();
        List<Element> listMaxTemp = new ArrayList<>();
       for (Element e:numbers){
           listDate.add(Integer.parseInt(e.toString().substring(17,19)));
       }
        listMinTemp.addAll(temperatureMin);
        listMaxTemp.addAll(temperatureMax);
       for (Element e :freeDay){
           listDate.add(Integer.parseInt(e.text()));
       }
        Collections.sort(listDate);
        List<String> listMaxString = new ArrayList<>();
        List<String> listMinString = new ArrayList<>();
        Pattern pattern = Pattern.compile("[-+ ][0-9+].{0,1}°");
        Matcher m = pattern.matcher(temperatureMax.text());
        while (m.find()){
            listMaxString.add( m.group());
        }
        Matcher m1 = pattern.matcher(temperatureMin.text());
        while (m1.find()){
            listMinString.add( m1.group());
        }
        Collections.sort(listDate);
        for (int i = 0; i < 7; i++) {
            System.out.println("temperature in "+listDate.get(i) +" max = "
                    + listMaxString.get(i)+
                    " min = "+ listMinString.get(i));
        }
    }
}
