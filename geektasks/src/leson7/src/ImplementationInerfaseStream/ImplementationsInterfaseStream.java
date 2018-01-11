package leson7.src.ImplementationInerfaseStream;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ImplementationsInterfaseStream implements CollectionOperations{
    @Override
    public <E> List<E> fill(Supplier<E> producer, int count) {

        return Stream.generate(producer).limit(count).collect(Collectors.toList());
    }

    @Override
    public <E> List<E> filter(List<E> elements, Predicate<E> filter) {
        List<E> stream = elements.stream().
                filter(filter).
                collect(Collectors.toList());
        return  stream;
    }

    @Override
    public <E> boolean anyMatch(List<E> elements, Predicate<E> predicate) {
        boolean stream = elements.stream().
                anyMatch(predicate);
        return stream;
    }

    @Override
    public <E> boolean allMatch(List<E> elements, Predicate<E> predicate) {
        return elements.stream().
                allMatch(predicate);
    }

    @Override
    public <E> boolean noneMatch(List<E> elements, Predicate<E> predicate) {
        return elements.stream().
                noneMatch(predicate);
    }

    @Override
    public <T, R> List<R> map(List<T> elements, Function<T, R> mappingFunction) {
        return elements.stream().
                map(mappingFunction).
                collect(Collectors.toList());
    }

    @Override
    public <E> Optional max(List<E> elements, Comparator<E> comparator) {
         Optional optional = Optional.of(elements.stream()
                 .max(comparator));
         return optional;
    }

    @Override
    public <E> Optional<E> min(List<E> elements, Comparator<E> comparator) {
        return elements.
                stream().
                min(comparator);
    }

    @Override
    public <E> List<E> distinct(List<E> elements) {
        List<E> stream = elements.stream().
                filter((x) -> x.equals(x)).
                collect(Collectors.toList());
        return stream;
    }

    @Override
    public <E> void forEach(List<E> elements, Consumer<E> consumer) {
        elements.stream().
                forEach(consumer);
    }

    @Override
    public <E> Optional<E> reduce(List<E> elements, BinaryOperator<E> accumulator) {
        Optional<E> optional = elements.stream().reduce(accumulator);
        return optional;
    }

    @Override
    public <E> E reduce(E seed, List<E> elements, BinaryOperator<E> accumulator) {
        E e = elements.stream().reduce(seed,accumulator);
        return e;
    }

    @Override
    public <E> Map<Boolean, List<E>> partitionBy(List<E> elements, Predicate<E> predicate) {
        Map<Boolean,List<E>> map = elements.
                stream().
                collect(Collectors.partitioningBy(predicate));
        return map;
    }

    @Override
    public <T, K> Map<K, List<T>> groupBy(List<T> elements, Function<T, K> classifier) {
        Map<K, List<T>> map = elements.stream().
                collect(Collectors.groupingBy(classifier));
        return map;
    }

    @Override
    public  <T, K, U> Map<K, U> toMap(List<T> elements, Function<T, K> keyFunction, Function<T, U> valueFunction, BinaryOperator<U> mergeFunction){
        Map<K,U> result = new HashMap<>();
        for (T element : elements) {
            result.merge(keyFunction.apply(element), valueFunction.apply(element), mergeFunction);
        }
        return result;
    }
}
