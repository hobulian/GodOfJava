package Collection.Map;

import java.util.*;

/* HashTable
    HashMap과 동일하게 Map 인터페이스를 구현. 그러나 HashMap과 차이가 있음
    1. Key와 Value에 Null값 허용 안함
    2. Synchronized
    3. 중복 허용 안함
    일반적으로 Map 인터페이스를 구현한 클래스들과도 차이가 있음
    1. Map은 Collection View을 사용, HashTable은 Enumeration 객체를 통해 데이터 처리
    2. Map은 키, 값, 키-값 쌍으로 데이터를 순환하여 처리, HashTable은 키, 값으로만 데이터 순환 처리
    3. Map은 이터레이션 처리 도중 데이터를 삭제하는 방법 제공, HashTable엔 그런 방법은 없다
 */
public class HashTableSample {
    public static void main(String[] args) {
        Hashtable hashTable = new Hashtable();

        hashTable.put("연예인", "김태희");
        hashTable.put("연예인", "송승헌");
        hashTable.put("연예인", "이병헌");
        hashTable.put("연예인", "조인성");
        // Key는 중복될 수 없어서 계속 Key에 맞는 Value가 덧씌워짐
        System.out.println("Hashtable 사이즈 = "+hashTable.size());

        // 값 출력
        Collection values = hashTable.values();
        for (Object obj : values) {
            System.out.println(obj);
            // 마지막 입력 값이 조인성. 조인성을 반환
        }

        hashTable.put("연예인", "김태희");
        hashTable.put("아이돌", "아이유");
        hashTable.put("영화배우", "이병헌");
        hashTable.put("가수", "김경호");

        /* HashTable 데이터를 출력하는 방법
            1. Key값으로 객체를 찾음
            2. values를 사용하여 Collection 형태로 찾음
         */

        // 방법 1
        Enumeration keys = hashTable.keys();
        while(keys.hasMoreElements()) {
            // Key를 찾고 찾은 Key로 Value를 찾음
            String key = (String)keys.nextElement();
            System.out.println("Key: "+key+" / Value: "+hashTable.get(key));
        }

        // 방법 2
        Collection tableValues = hashTable.values();
        for (Object value : tableValues) {
            System.out.println("Value: "+value);
        }

        // 방법 3
        Set keySet = hashTable.keySet();
        Iterator itrKey = keySet.iterator();
        while(itrKey.hasNext()){
            String key = (String)itrKey.next();
            System.out.println("Key: "+key+" / Value: "+hashTable.get(key));
        }


        hashTable.remove("가수");
        hashTable.clear(); // 테이블 비우기
    }
}
