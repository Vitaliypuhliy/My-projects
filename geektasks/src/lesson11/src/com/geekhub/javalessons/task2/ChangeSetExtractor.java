package lesson11.src.com.geekhub.javalessons.task2;

public interface ChangeSetExtractor<T> {
    ChangeSet extract(T oldObject, T newObject);
}
