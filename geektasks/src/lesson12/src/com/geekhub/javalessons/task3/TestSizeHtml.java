package lesson12.src.com.geekhub.javalessons.task3;

public class TestSizeHtml {
    public static void main(String[] args)  {

        GetSizeOfHtml getSizeOfHtml = new GetSizeOfHtml();
        Thread thread = new Thread(getSizeOfHtml);
        thread.start();
        System.out.println(thread.getName());

    }
}
