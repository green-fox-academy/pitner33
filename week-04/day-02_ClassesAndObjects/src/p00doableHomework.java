import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p00doableHomework {
    public static void main(String[] args) {
        List<Map<String, Object>> treeList = new ArrayList<>();

        Map<String, Object> tree1 = new HashMap<>();
        tree1.put("type", "pine");
        tree1.put("leafColor", "green");
        tree1.put("age", "50");
        tree1.put("sex", "uni");
        treeList.add(tree1);

        Map<String, Object> tree2 = new HashMap<>();
        tree2.put("type", "oak");
        tree2.put("leafColor", "green");
        tree2.put("age", "150");
        tree2.put("sex", "uni");
        treeList.add(tree2);

        Map<String, Object> tree3 = new HashMap<>();
        tree3.put("type", "cedar");
        tree3.put("leafColor", "green");
        tree3.put("age", "40");
        tree3.put("sex", "uni");
        treeList.add(tree3);

        Map<String, Object> tree4 = new HashMap<>();
        tree4.put("type", "willow");
        tree4.put("leafColor", "green");
        tree4.put("age", "67");
        tree4.put("sex", "uni");
        treeList.add(tree4);

        Map<String, Object> tree5 = new HashMap<>();
        tree5.put("type", "spruce");
        tree5.put("leafColor", "green");
        tree5.put("age", "15");
        tree5.put("sex", "uni");
        treeList.add(tree5);

    }
}
