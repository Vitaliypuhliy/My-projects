package lesson11.src.com.geekhub.javalessons.task1;

import com.geekhub.javalessons.task2.Dog;
import org.jsoup.Jsoup;

public class TestClone{
    public static void main(String[] args){
        Dog dog = new Dog("maluy",3);
        CloneCreatorImp cloneCreatorImp = new CloneCreatorImp();
        UserForClone userForClone = new UserForClone("User",dog,18,true);
        UserForClone userForClone1 = cloneCreatorImp.clone(userForClone);
        System.out.println(userForClone1);
        System.out.println(userForClone.equals(userForClone1));



    }
}
