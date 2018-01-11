package leson6.src.implementInterfase;





import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;



public class Test {
    public static void main(String[] args) {
        ImplementationsInterfase implementationsInterfase = new ImplementationsInterfase();
        List<Integer> list = Arrays.asList(1,2,3,1,5,3,6);
        List<Integer> numList = Arrays.asList(4,3,2,1,16,17,19,20,34,56);

        Predicate<Integer> filter = Test::filter;
        Predicate<Integer> anyMatch = Test::filter;
        Predicate<Integer> allMatch = Test::filter;
        Predicate<Integer> noneMatch = Test::filter;
        Comparator<Integer> max = (a, b) ->min(b, a);

        Comparator<Integer> min = Test::min;

        Consumer<Integer> consumer = System.out::println;

        List<Integer> list1;
        list1 = implementationsInterfase.distinct(list);
        implementationsInterfase.forEach(list1,consumer);
        Supplier<Integer> supplier1= () -> 1;
        List<Integer> arrayList;
        arrayList = implementationsInterfase.fill(supplier1,6);
        System.out.println(arrayList);

        List<A> aList = Arrays.asList(new A(1,2),
                new A(3, 4), new A(5, 6));
        Function <List<A>,List<B>> function = (List<A> list2) ->  {
            List<B> bList = aList.stream()
                    .map(a -> new B(a.getVar1() + a.getVar2()))
                    .collect(Collectors.toList());
            return bList;

        };

        Optional<Integer> optional;
        Optional<Integer> optional1;
        optional = implementationsInterfase.max(numList,max);
        optional1 = implementationsInterfase.max(numList,min);
        System.out.println(optional.get());
        System.out.println(optional1.get());




        boolean bol = implementationsInterfase.anyMatch(list,anyMatch);
        boolean bol1 = implementationsInterfase.allMatch(list,allMatch);
        boolean bol2 = implementationsInterfase.noneMatch(list,noneMatch);
        System.out.println("anyMatch = " + bol);
        System.out.println("allMatch = " + bol1);
        System.out.println("noneMatch = " + bol2);
        List<Integer> arrayList2;
        arrayList2 = implementationsInterfase.filter(list,filter);


        arrayList2.forEach(x-> System.out.println(x));
        Optional<Integer> optional2;
        BinaryOperator<Integer> operator =  (a,b) ->  a + b ;
        optional2 = implementationsInterfase.reduce(list,operator);
        System.out.println("optional sum = " +optional2.get());
        int sum = implementationsInterfase.reduce(2,list,operator);
        System.out.println("sum = " + sum);
        List<String> list2 = new ArrayList<>();
        list2.add("dds1");
        list2.add("dds11");
        list2.add("dds111");
        Function<String,Integer> function1 = t -> t.length();
        System.out.println(implementationsInterfase.groupBy(list2,function1));
        Function<String,Integer> keyFunc = t ->t.hashCode();
        Function<String,Integer>valueFunc = t -> t.length();
        BinaryOperator<Integer> binaryOperator = (a,b) -> a.hashCode() - b.hashCode();
        System.out.println(implementationsInterfase.toMap(list2,keyFunc,valueFunc,binaryOperator));
    }


    public static int min(Integer a, Integer b) {
        if (a == b) {
            return b;
        } else if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static boolean filter(Integer t) {
        if (t > 4) {
            return true;
        }else{
            return false;
        }
    }

    public static class A {
        private int var1;
        private int var2;

        public A(int var1, int var2) {
            this.var1 = var1;
            this.var2 = var2;
        }

        public int getVar1() {
            return var1;
        }

        public int getVar2() {
            return var2;
        }

    }

    public static class B {
        private int vars;

        public B(int vars) {
            this.vars = vars;
        }


    }

}
