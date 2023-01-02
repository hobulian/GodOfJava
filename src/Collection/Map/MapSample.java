package Collection.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSample {
    public static void main(String[] args) {
        MapSample sample = new MapSample();
        sample.checkHashMap();
        sample.checkKeySet();
        sample.checkValues();
        sample.checkHashMapEntry();
        sample.checkContains();
        sample.checkRemove();
    }
    public void checkHashMap() {
        System.out.println("=== checkHashMap() ===");
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        System.out.println(map.get("A"));
        System.out.println(map.get("B")); // Collection에서는 ArrayIndexOutOfBound 예외
        map.put("A", "1");
        System.out.println(map.get("A")); // 이미 있는 Key값에 다른 Value로 Put하면 대체됨
    }
    private void checkKeySet() {
        System.out.println("=== checkKeySet() ===");
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        Set<String> keySet = map.keySet();
        for(String temp:keySet){
            System.out.println(temp+"="+map.get(temp)); // 결과 순서는 중요하지 않다.
        }
    }
    private void checkValues() {
        System.out.println("=== checkValues() ===");
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        Collection<String> values = map.values();
        for(String temp:values){
            System.out.println(temp); // 결과 순서는 중요하지 않다.
        }
    }
    private void checkHashMapEntry() {
        System.out.println("=== checkHashMapEntry() ===");
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");

        Set<Map.Entry<String,String>> entries = map.entrySet();
        for(Map.Entry<String,String> temp:entries){
            System.out.println(temp.getKey()+"="+temp.getValue()); // 결과 순서는 중요하지 않다.
        }
    }
    private void checkContains() {
        System.out.println("=== checkContains() ===");
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");

        System.out.println("Contains key A = "+map.containsKey("A"));
        System.out.println("Contains value a = "+map.containsValue("a"));
        System.out.println("Contains key Z = "+map.containsKey("Z"));
        System.out.println("Contains value z = "+map.containsValue("z"));
    }
    private void checkRemove() {
        System.out.println("=== checkRemove() ===");
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");

        map.remove("A");
        //map.remove("A", "a"); // 키 - 값 쌍으로도 삭제 가능
        System.out.println(map.size());
    }
}
