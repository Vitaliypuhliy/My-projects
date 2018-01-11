package lesson5.src.Ex2;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class TaskTest {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date(20000766);
        Date date3 = new Date();
        Date date4 = new Date();
        Task task1 = new Task("a", "a", date1);
        Task task2 = new Task("b", "c", date2);
        Task task3 = new Task("c", "d", date3);
        Task task4 = new Task("d", "b", date4);
        ArrayList<Task> arrayList1 = new ArrayList<>();
        arrayList1.add(task1);
        arrayList1.add(task2);
        arrayList1.add(task3);
        arrayList1.add(task4);
        System.out.println(task1.getCategories(arrayList1));
        System.out.println(task1.compareTo(task2));
        Instant m = date2.toInstant();
        System.out.println(m);
        System.out.println( date1.toInstant().equals(date2.toInstant()));
        System.out.println(date1.toString());
        for (Task e: arrayList1){
            System.out.println(e.getDescription());
        }
        Collections.sort(arrayList1);
        for (Task e: arrayList1){
            System.out.println(e.getDescription());
        }

        ArrayList<Task> arrayListTask = (ArrayList<Task>) task1.getTasksForToday(arrayList1);
        for (Task e :arrayListTask){
            System.out.println(e.getDate());
        }
        ArrayList<Task> arrayListTaskByCategory = (ArrayList<Task>) task1.getTasksByCategory("a");
        Task tas = arrayListTaskByCategory.get(0);
        System.out.println(tas.getCategory());
    }
}
