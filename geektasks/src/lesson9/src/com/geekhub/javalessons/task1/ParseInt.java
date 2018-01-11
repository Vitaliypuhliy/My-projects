package lesson9.src.com.geekhub.javalessons.task1;

public class ParseInt {
    public static void main(String[] args) {
        System.out.println(strToInt("6487657"));
        //System.out.println(strToInt("00"));
        // System.out.println(strToInt(""));
        char c = '9';
        System.out.println(c );

    }
    public static double strToInt(String s) {
        if (s.length() == 0){
            throw new NumberFormatException("str must be no empty");
        }
        if (s.charAt(0) == '0') {
            throw new NumberFormatException("first number cant be zero");
        }


        double value = 0;
        int index = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int m = c -'0';
            value =  (value + m * (Math.pow(10, index)));
            index++;
        }
        return value;
    }

}

