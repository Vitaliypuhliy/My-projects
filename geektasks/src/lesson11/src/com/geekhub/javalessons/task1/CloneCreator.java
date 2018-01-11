package lesson11.src.com.geekhub.javalessons.task1;

public interface CloneCreator<T extends CanBeCloned> {
    T clone(T object) ;
}
