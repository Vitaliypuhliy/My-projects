import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PaserImail {
    public static void main(String[] args) {
        Pattern pattern4 = Pattern.compile("[a-zA-Z0-9+].{3,30}[@+][a-z+].{3,10}[.+][a-z].{1,9}");
        Matcher m4 = pattern4.matcher("qerewqre@gmail.com");
        while (m4.find()){
            System.out.println(m4.start()+" " + m4.group());
        }
    }
}
