package lesson11.src.com.geekhub.javalessons.task2;


public class TestAnnotations {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Va",3);
        Dog dog2 = new Dog("Bi",5);
        ChangeSet changeSet = new ChangeSet();
        User user1 =new User(12,"Vanya",8,dog1);
        User user2 =new User(10,"Vitaliy",18,dog2);
        System.out.println(user1.extract(user1,user2));




    }
}
