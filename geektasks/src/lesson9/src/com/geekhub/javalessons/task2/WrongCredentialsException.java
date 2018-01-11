package lesson9.src.com.geekhub.javalessons.task2;

class WrongCredentialsException extends AuthException{

    WrongCredentialsException(){
        System.out.println("you have null fields");
    }
}
