package lesson11.src.com.geekhub.javalessons.task2;

import java.util.ArrayList;
import java.util.List;

public class ChangeSet {
    List<String> list = new ArrayList<>();


    public ChangeSet() {
    }

    public void addToChangeSet(String o){
        list.add(o);
    }

    @Override
    public String toString() {
        return "ChangeSet{" +
                "list=" + list +
                '}';
    }
}
