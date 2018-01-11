package lesson5.src.Ex2;

import java.util.*;


public class Task implements TaskManager, Comparable {
    private String category;
    private String description;
    private Date date;

    private Map<Date, Task> map = new HashMap<>();
    private List<String> arrayList = new ArrayList<>();
    private List<Task> arrayListTask = new ArrayList<>();
    private List<Task> arrayListTaskByCategory = new ArrayList<>();


    public Task(String category, String description, Date date) {
        this.category = category;
        this.description = description;
        this.date = date;
    }

    @Override
    public void addTask(Date date, Task task) {
        map.put(date, task);
    }

    @Override
    public void removeTask(Date date) {
        map.remove(date);
    }

    @Override
    public Collection<String> getCategories(Collection<Task> collection) {
        for (Task e : collection) {
            if (!arrayList.contains(e.getDescription())) {
                arrayList.add(e.getDescription());
            }
        }
        return arrayList;
    }

    @Override
    public Map<String, List<Task>> getTasksByCategories() {

        return null;
    }

    @Override
    public List<Task> getTasksByCategory(String category) {
        if (this.getCategory().equals(category)) {
            arrayListTaskByCategory.add(this);
        }
        return arrayListTaskByCategory;
    }

    @Override
    public List<Task> getTasksForToday(Collection<Task> collection) {

        for (Task e : collection) {
            String dat1 = e.getDate().toString();
            if (dat1.equals(new Date().toString())) {
                arrayListTask.add(e);
            }
        }
        return arrayListTask;
    }

    @Override
    public int compareTo(Object o) {
        Task oo = (Task) o;
        return this.getDate().compareTo(oo.getDate());

    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }
}
