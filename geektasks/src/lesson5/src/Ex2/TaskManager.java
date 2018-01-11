package lesson5.src.Ex2;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface TaskManager {
    void addTask(Date date, Task task);
    void removeTask(Date date);
    Collection<String> getCategories(Collection<Task> collection);

    //For next 3 methods tasks should be sorted by scheduled date
    Map<String, List<Task>> getTasksByCategories();
    List<Task> getTasksByCategory(String category);
    List<Task> getTasksForToday(Collection<Task> collection);
}
