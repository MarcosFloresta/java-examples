import java.util.ArrayList;
import java.util.List;
import org.apache.commons.collections.ListUtils;

public class JoinLists {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("a");
        List<String> list2 = new ArrayList<String>();
        list2.add("b");
        List<String> joined = ListUtils.union(list1, list2);
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("joined: " + joined);
    }
}