package leson7.src.ImplementationInerfaseStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(1,2,0,5,8,0,6,9,0,9);
        List<Animal> animals = Arrays.asList(
                new Animal("a",3),
                new Animal("b",4),
                new Animal("c",5),
                new Animal("d",6)
        );
        ImplementationsInterfaseStream implementationsInterfaseStream =
                new ImplementationsInterfaseStream();

        Supplier<Integer> supplier = () -> 1;
        Predicate<Integer> filter = p -> p!=0;
        Consumer<Integer> consumer = p -> System.out.println(p);
        BinaryOperator<Integer> binaryOperator = (x,y) -> x+y;
        Function function = (x) -> x.hashCode();
        implementationsInterfaseStream.forEach(list,consumer);
        Function<Animal,Integer> valueFunc = (x) -> x.getAge();
        Function<Animal,String> keyFunc = (x) -> x.getName();
        BinaryOperator<Integer> mergeFunc = (x,y) -> x.hashCode()-y.hashCode();
        int count =10;

        System.out.println(implementationsInterfaseStream.fill(supplier,count));
        System.out.println(implementationsInterfaseStream.filter(list,filter));
        System.out.println(implementationsInterfaseStream.groupBy(list,function));
        System.out.println(implementationsInterfaseStream.partitionBy(list,filter));
        System.out.println(implementationsInterfaseStream.reduce(list,binaryOperator).get());
        System.out.println(implementationsInterfaseStream.reduce(4,list,binaryOperator));
        System.out.println(implementationsInterfaseStream.toMap(animals,keyFunc,valueFunc,mergeFunc));
    }
}
