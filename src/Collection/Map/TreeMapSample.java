package Collection.Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* TreeMap
    SortedMap 인터페이스를 구현
    키를 정렬. String 순서는 숫자 > Upper Case > Lower Case > 한글
    숫자나 Object의 경우 순서가 달라짐
 */
public class TreeMapSample {
    public static void main(String[] args) {
        TreeMapSample sample = new TreeMapSample();
        sample.checkTreeMap();
        sample.checkKeys();
    }
    private void checkTreeMap() {
        System.out.println("=== checkTreeMap() ===");
        TreeMap<String, String> map = new TreeMap<String, String>();
        map.put("A", "a");
        map.put("가", "b");
        map.put("1", "c");
        map.put("a", "d");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String, String> temp:entries) {
            System.out.println(temp.getKey()+"="+temp.getValue());
        }
    }
    private void checkKeys() {
        TreeMap<String, String> map = new TreeMap<String, String>();
        map.put("A", "a");
        map.put("가", "b");
        map.put("1", "c");
        map.put("a", "d");
        System.out.println("=== checkFirstKey() ===");
        System.out.println(map.firstKey());
        System.out.println("=== checkLastKey() ===");
        System.out.println(map.lastKey());
        System.out.println("=== checkLowerKey() ===");
        System.out.println(map.lowerKey("A"));

    }


}
