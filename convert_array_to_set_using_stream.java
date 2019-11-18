import java.util.*;

public class ArraySet {
    public static void main(String[] args) {
        String[] array = { "a", "b", "c" };
        Set<String> set = new HashSet<>(Arrays.stream(array).collect(Collectors.toSet()));
        System.out.println("Set: " + set);
    }
}