package by.vpshulga.lesson08;

public class PairUtil {
    public static <K, V> Pair<K, V> swap(Pair<K, V> pair){
        K key = pair.getKey();
        V value = pair.getValue();

        pair.setKey((K) value);
        pair.setValue((V) key);

        return pair;

    }
}
