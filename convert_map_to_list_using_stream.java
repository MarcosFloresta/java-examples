import java.util.*;
import java.util.stream.Collectors;
public class MapList {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "e");
        List<Integer> keyList = map.keySet().stream().collect(Collectors.toList());
        List<String> valueList = map.values().stream().collect(Collectors.toList());
        System.out.println("Key List: " + keyList);
        System.out.println("Value List: " + valueList);
    }
}
