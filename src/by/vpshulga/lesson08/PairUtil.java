package by.vpshulga.lesson08;

public final class PairUtil {
    public static <K, V> Pair<V, K> swap(Pair<K, V> pair) {
        return new Pair<>(pair.getValue(), pair.getKey());
    }
}
