package leson7.src.ImplementationInerfaseStream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.*;


public interface CollectionOperations {
    /**
     * creates list of object
     *
     * @param producer - creates one object should be added to list
     * @param count    - number of objects should be added to list
     */
    <E> List<E> fill(Supplier<E> producer, int count);

    /**
     * filters list by some rule
     *
     * @param elements - list of objects that should be filtered
     * @param filter   - rule that should be used for filtering
     *                 (if filter returns true then object should be included into result list)
     */
    <E> List<E> filter(List<E> elements, Predicate<E> filter);

    /**
     * returns true if at least one of objects from list match the rule
     *
     * @param elements  - list of objects that should be verified
     * @param predicate - rule should match object(s) from list
     */
    <E> boolean anyMatch(List<E> elements, Predicate<E> predicate);

    /**
     * returns true if all objects from list match the rule
     *
     * @param elements  - list of objects that should be verified
     * @param predicate - rule should match object(s) from list
     */
    <E> boolean allMatch(List<E> elements, Predicate<E> predicate);

    /**
     * returns false if at least one of objects from list match the rule
     *
     * @param elements  - list of objects that should be verified
     * @param predicate - matching rule should be applied to each object from list
     */
    <E> boolean noneMatch(List<E> elements, Predicate<E> predicate);

    /**
     * transforms all elements in list
     *
     * @param elements        - list of objects should be transformed
     * @param mappingFunction - transformation rule
     */
    <T, R> List<R> map(List<T> elements, Function<T, R> mappingFunction);

    /**
     * returns maximum value from list if exists, {@link Optional#empty()} otherwise
     *  @param elements   - list of elements
     * @param comparator - comparator that implements comparing rules for current list of objects
     */
    <E> Optional max(List<E> elements, Comparator<E> comparator);

    /**
     * returns minimum value from list if exists, {@link Optional#empty()} otherwise
     *
     * @param elements   - list of elements
     * @param comparator - comparator that implements comparing rules for current list of objects
     */
    <E> Optional<E> min(List<E> elements, Comparator<E> comparator);

    /**
     * returns list of unique object from original list (List should be returned, not Set)
     *
     * @param elements - list of elements
     */
    <E> List<E> distinct(List<E> elements);

    /**
     * applies some action to each object from list (prints into console, adds to another list, etc)
     *
     * @param elements - list of elements
     */
    <E> void forEach(List<E> elements, Consumer<E> consumer);

    /**
     * reduces all objects from list by some rule (for example calculates sum of all elements in the list)
     *
     * @param elements    - list of elements
     * @param accumulator - function to combine two values (for example: addition, subtraction, multiplication)
     */
    <E> Optional<E> reduce(List<E> elements, BinaryOperator<E> accumulator);

    /**
     * the same as {@link #reduce(List, BinaryOperator)} but with specified initial value: seed
     *
     * @param elements    - list of elements
     * @param accumulator - function to combine two values (for example: addition, subtraction, multiplication)
     * @param seed        - the identity value for the accumulating function
     */
    <E> E reduce(E seed, List<E> elements, BinaryOperator<E> accumulator);

    /**
     * splits all elements into two group: 1 - match specified predicate, 2 - do not match predicate
     *
     * @param elements  -  list of elements
     * @param predicate - a predicate used for classifying input elements
     */
    <E> Map<Boolean, List<E>> partitionBy(List<E> elements, Predicate<E> predicate);

    /**
     * groups elements according to a classification function (for example: groups tasks by category name)
     *
     * @param elements   - list of object should be grouped by specified classifier
     * @param classifier - a classifier function mapping input elements to keys
     */
    <T, K> Map<K, List<T>> groupBy(List<T> elements, Function<T, K> classifier);

    /**
     * Accumulates elements into a Map whose keys and values are the result of applying the provided
     * mapping functions to the input elements.
     *
     * @param elements      - list of object should be grouped by specified classifier
     * @param keyFunction   - a mapping function to produce keys
     * @param valueFunction - a mapping function to produce values
     * @param mergeFunction -  merge function, used to resolve collisions between values associated with the same key
     */
    <T, K, U> Map<K, U> toMap(List<T> elements, Function<T, K> keyFunction, Function<T, U> valueFunction, BinaryOperator<U> mergeFunction);
}