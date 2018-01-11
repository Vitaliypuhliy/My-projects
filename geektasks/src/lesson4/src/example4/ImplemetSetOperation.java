package lesson4.src.example4;


import java.util.HashSet;
import java.util.Set;

public class ImplemetSetOperation implements SetOperations {
    @Override
    public boolean equals(Set a, Set b) {
        if(a.hashCode() == b.hashCode()){
            return true;
        }
        return false;
    }

    @Override
    public Set union(Set a, Set b) {
        if (null == a) {
            return b;
        } else if (null == b) {
            return a;
        } else if (null == a && null == b) {
            return null;
        } else {
            a.addAll(b);
            return a;
        }

    }

    @Override
    public Set subtract(Set a, Set b) {
        Set c = new HashSet();
        for (Object object:a) {
            if ( !b.contains(object)) {
                c.add(object);
            }
        }
        return c;
    }

    @Override
    public Set intersect(Set a, Set b) {
        Set c = new HashSet();
        for (Object object:a) {
            if ( b.contains(object)) {
                c.add(object);
            }
        }
        return c;
    }

    @Override
    public Set symmetricSubtract(Set a, Set b) {
        Set c1;
        Set c2;
        c1 = union(a,b);
        c2 = union(b,a);
        return union(c1,c2);
    }
}
