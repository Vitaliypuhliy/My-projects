package lesson4.src.example4;



import java.util.ArrayList;
import java.util.Set;

public interface SetOperations {
        /* Two sets A and B are equal (A = B) if they consist of the same elements
         */
        boolean equals(Set a, Set b);

        /* A union (sum) of sets A and B is a set A ∪ B whose elements belong to at
         * least one of these sets
         */
        Set union(Set a, Set b);

        /* The difference between sets A and B is the set AB whose elements belong to
         * the set A, but do not belong to the set B
         */
        Set subtract(Set a, Set b);

        /* The intersection (product) of sets A and B is the set A ∩ B whose elements
         * belong to both the set A and the set B
         */
        Set intersect(Set a, Set b);

        /* A symmetric difference of the sets A and B is the set A Δ B, which is the union
         * of the differences of the sets AB and BA, that is, A Δ B = (AB) ∪ (BA)
         */
        Set symmetricSubtract(Set a, Set b);

}
