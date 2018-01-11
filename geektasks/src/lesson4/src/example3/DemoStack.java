package lesson4.src.example3;

public class DemoStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        stack.add(6);
        stack.add(7);
        stack.add(8);
        stack.add(9);
        stack.toString();
       int m =(int) stack.poll();
        System.out.println(m);
        stack.toString();
        int peek = (int) stack.peek();
        System.out.println(peek);
        stack.toString();
        System.out.println(stack.contains(1));
        stack.remove(1);
        stack.remove(2);
        stack.remove(3);
        stack.toString();
        System.out.println(stack.iterator().next());
        stack.iterator().remove();


    }
}
