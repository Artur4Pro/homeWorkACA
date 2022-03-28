package company.day26;

public class DefaultPair<K,V> implements Pair <K,V> {
    K key;
    V value;

    DefaultPair(K key,V value){
        this.key=key;
        this.value=value;
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public V getValue() {
        return this.value;
    }
}
