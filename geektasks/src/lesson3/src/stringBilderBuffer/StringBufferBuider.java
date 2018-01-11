package lesson3.src.stringBilderBuffer;

public class StringBufferBuider {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        StringBuffer sBuffer = new StringBuffer("StringBuffer");
        int numberOfConcat = 0;
        long differenceTimeBufferConcat = 0, differenceTimeBuilderConcat = 0, differenceTimeStringConcat = 0;
        long timeInMillis1, timeInMillis2, timeInMillis3, timeInMillis4, timeInMillis5, timeInMillis6;
        while (numberOfConcat < 1000) {
            timeInMillis1 = System.currentTimeMillis();

            addStringBuffer(sBuffer);

            timeInMillis2 = System.currentTimeMillis();
            differenceTimeBufferConcat += timeInMillis2 - timeInMillis1;


            timeInMillis3 = System.currentTimeMillis();
            builder.append("Some Builder");
            addStringBuider(builder);

            timeInMillis4 = System.currentTimeMillis();
            differenceTimeBuilderConcat += timeInMillis4 - timeInMillis3;


            timeInMillis5 = System.currentTimeMillis();
            addString("some String");
            timeInMillis6 = System.currentTimeMillis();
            differenceTimeStringConcat += timeInMillis6 - timeInMillis5;
            numberOfConcat++;
        }
        System.out.println(differenceTimeBufferConcat/numberOfConcat);
        System.out.println(differenceTimeBuilderConcat/numberOfConcat);
        System.out.println(differenceTimeStringConcat/numberOfConcat);
    }

    public static String addString(String output) {
        int count = 100;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                output += j;
            }
        }
        return output;
    }

    public static String addStringBuffer(StringBuffer output) {
        int count = 100;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                output.append(j);
            }
        }
        return output.toString();
    }

    public static String addStringBuider(StringBuilder stringBuilder) {

        int count = 100;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                stringBuilder.append(j);
            }
        }
        return stringBuilder.toString();
    }
}
