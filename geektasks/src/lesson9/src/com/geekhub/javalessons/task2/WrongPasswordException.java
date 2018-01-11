package lesson9.src.com.geekhub.javalessons.task2;

class WrongPasswordException extends AuthException {
    WrongPasswordException() {
        System.out.println("No corect password!");
    }
}
