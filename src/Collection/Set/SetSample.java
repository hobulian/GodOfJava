package Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetSample {
    public static void main(String[] args) {
        SetSample sample = new SetSample();
        String []cars = new String[]{
                "티코", "소나타", "BMW", "벤츠",
                "렉서스", "아반떼", "그렌저", "무스탕",
                "미니 쿠퍼", "테슬라", "I30", "BMW",
                "렉서스", "카니발", "SM5", "SM7", "SM3", "티코"
        };
        System.out.println(sample.getCarKinds(cars));
    }
    public int getCarKinds(String[] cars) {
        if (cars == null) return 0; // Null 체크
        if (cars.length == 1) return 1; // 받은 배열의 크기가 1이면 1을 반환
        Set<String> temp = new HashSet<String>(); // 임시 HashSet을 생성
        for(String car:cars) {
            temp.add(car); // 임시 HashSet에 car 배열의 값을 담음. 중복값은 HashSet이기 때문에 자연히 제거
        }
        printCarSet(temp); // 호출할 때마다 순서가 바뀜. Set은 데이터가 보관되는 순서가 중요하진 않음
        printCarSet2(temp); // 이터레이터 사용
        checkContains(temp, "티코");
        return temp.size(); // 임시 HashSet의 크기를 반환
    }
    public void printCarSet(Set<String> carSet) {
        System.out.println("=== For 구문 사용 ===");
        for(String temp:carSet) {
            System.out.println(temp+ " ");
        }
        System.out.println();
    }

    public void printCarSet2(Set<String> carSet) {
        System.out.println("=== 이터레이터 구문 사용 ===");
        Iterator<String> iterator = carSet.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next()+ " ");
        }
        System.out.println();
    }

    public void checkContains(Set<String> carSet, String str) {
        System.out.println("=== Contains 체크 ===");
        System.out.println(carSet.contains(str));
        System.out.println("=== Remove 테스트 ===");
        System.out.println(str+" 삭제됨");
        carSet.remove(str);
        System.out.println("=== Contains 체크 ===");
        System.out.println(carSet.contains(str));
        carSet.add(str);
    }
}
