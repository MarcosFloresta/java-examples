import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoinLists {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("a");
        List<String> list2 = new ArrayList<String>();
        list2.add("b");
        List<String> joined = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("joined: " + joined);
    }
}
