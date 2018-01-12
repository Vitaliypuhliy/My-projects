import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpresions {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a");
        Matcher m = pattern.matcher("Jack is a boy");
        while (m.find()){
            System.out.println(m.start()+" " + m.group());
        }
        Pattern pattern1 = Pattern.compile("boy");
        Matcher m1 = pattern1.matcher("Jack is a boy boy boy");
        while (m1.find()){
            System.out.println(m1.start()+" " + m1.group());
        }
        Pattern pattern2 = Pattern.compile("\\Q1+1=4\\E");
        Matcher m2 = pattern2.matcher("1+1=4");
        while (m2.find()){
            System.out.println(m2.start()+" " + m2.group());
        }
        Pattern pattern3 = Pattern.compile("[0-2]");
        Matcher m3 = pattern3.matcher("1423142141=4");
        while (m3.find()){
            System.out.println(m3.start()+" " + m3.group());
        }

    }
}
