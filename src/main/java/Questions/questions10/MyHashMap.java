package Questions.questions10;

import java.util.HashSet;
import java.util.Objects;

public class MyHashMap  <K,V> {
    private HashSet<Pair<K,V>> pairs = new HashSet<>();
    public MyHashMap () {

    }
    public void add (K key, V value) {
        pairs.add(new Pair<>(key, value));
    }
    public V get (K key) {
        for (Pair<K,V> pair : pairs) {
           if (pair.key.equals(key)){
               return pair.value;
           }
        }
        return null;
    }
    private class Pair <K,V> {
        public K key;
        public V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(key, pair.key);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key);
        }
    }

}
