package leson6.src.implementInterfase;

import java.util.*;
import java.util.function.*;

public class ImplementationsInterfase implements CollectionOperations{

    @Override
    public <E> List<E> fill(Supplier<E> producer, int count) {
        List<E> result = new ArrayList<>();
        for (int i = 0; i < count ; i++) {
                result.add(producer.get());
        }

        return result;
    }
    @Override
    public <E> List<E> filter(List<E> elements, Predicate<E> filter) {
            List<E> result = new ArrayList<>();
            for (E apple : elements) {
                if (filter.test(apple)) {
                    result.add(apple);
                }
            }
            return result;
        }

    @Override
    public <E> boolean anyMatch(List<E> elements, Predicate<E> predicate) {
        for (E e:elements) {
            if (predicate.test(e)){
                return true;
            }
        }
        return false;
    }

    @Override
    public <E> boolean allMatch(List<E> elements, Predicate<E> predicate) {
        for (E e:elements) {
            if (predicate.test(e)){
                return false;
            }
        }
        return true;
    }

    @Override
    public <E> boolean noneMatch(List<E> elements, Predicate<E> predicate) {
        for (E e : elements) {
            if (predicate.test(e)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public <T, R> List<R> map(List<T> elements, Function<T, R> mappingFunction) {
        List<R> result = new ArrayList<>();
        for (T t : elements) {
            result.add(mappingFunction.apply(t));
        }

        return result;
    }

    @Override
    public <E> Optional max(List<E> elements, Comparator<E> comparator) {
        Optional<Integer> optional = Optional.empty();
        int k;
        for (int i = 0;i <elements.size()-1 ; i++) {
            k = comparator.compare(elements.get(i), elements.get(i + 1));
            optional = Optional.of(k);
        }
        return optional;
    }

    @Override
    public <E> Optional<E> min(List<E> elements, Comparator<E> comparator) {
        Optional<Integer> optional = Optional.empty();
        int k;
        Object minimum = 1;
        for (int i = 0;i <elements.size()-1 ; i++) {
            k = comparator.compare(elements.get(i), (E) minimum);
            optional = Optional.of(k);
        }
        return (Optional<E>) optional;
    }

    @Override
    public <E> List<E> distinct(List<E> elements) {
        List<E> arrayList = new ArrayList<>();
        for (E e:elements) {
            if (!arrayList.contains(e))
                arrayList.add(e);
        }
        return arrayList;
    }

    @Override
    public <E> void forEach(List<E> elements, Consumer<E> consumer) {
        for (E e:elements){
            consumer.accept(e);
        }

    }
 @Override
    public <E> Optional<E> reduce(List<E> elements, BinaryOperator<E> accumulator) {
       E optional = elements.get(0);
        for (E e:elements){
            optional = accumulator.apply(optional, e);
        }
        return Optional.of(optional);
    }

    @Override
    public <E> E reduce(E seed, List<E> elements, BinaryOperator<E> accumulator) {
        E num = seed;
        for (E e:elements){
            num = accumulator.apply(num,e);
        }
        return num;
    }

    @Override
    public <E> Map<Boolean, List<E>> partitionBy(List<E> elements, Predicate<E> predicate) {
        Map<Boolean,List<E>> map = new HashMap<>();
        for (E e:elements){
            map.put(predicate.test(e),elements);
        }
        return map;
    }

    @Override
    public <T, K> Map<K, List<T>> groupBy(List<T> elements, Function<T, K> classifier) {
        Map<K,List<T>> hashMap =new HashMap<>();
        for (T t :elements){
            hashMap.put(classifier.apply(t),elements);
        }
        return  hashMap;
    }

    @Override
    public <T, K, U> Map<K, U> toMap(List<T> elements, Function<T, K> keyFunction,
                                     Function<T, U> valueFunction, BinaryOperator<U> mergeFunction) {
        Map<K,U> map = new HashMap<>();
        for (T t :elements){
            map.put(keyFunction.apply(t),mergeFunction.apply(valueFunction.apply(t),valueFunction.apply(t)));
        }
        return map;
    }
}
