package Collection.ArrayList;

import java.util.ArrayList;

import static java.lang.Double.valueOf;

/** Vector와 ArrayList의 차이
    Vector는 Thread-safe하다는 특징이 있다.
    ArrayList도 다음과 같은 방식으로 Thread-safe를 구현 가능하다.

    List list = Collections.synchronizedList(new ArrayList(...));
 */
public class ListSample {
    public static void main(String[] args) {
        ListSample sample = new ListSample();
        sample.checkArrayList1();
        sample.checkArrayList2();
        sample.checkArrayList3();
        sample.checkArrayList4();
        sample.checkArrayList5();
        sample.checkArrayList6();
        sample.checkArrayList7();
        sample.checkArrayList8();
        /*
        이 외에도
        set(int index, E element) : 특정 인덱스의 값을 수정 가능 -> remove + add 기능
        trimToSize() : ArrayList 객체의 공간 크기를 데이터의 개수만큼으로 맞춰줌 -> 데이터 전송에 효율적

         */
    }

    public void checkArrayList1() {
        ArrayList list = new ArrayList();
        // 데이터는 add로 추가
        list.add(new Object());
        list.add("ArrayListSample");
        list.add(valueOf(1)); // new Double()은 Deprecated
        // 위처럼 여러 종류 담을 때는 DTO 사용이 일반적임

    }
    public void checkArrayList2() {
        ArrayList <String> list = new ArrayList<>(100);
        // 정해두지 않으면 초기 크기는 10으로 설정됨 가능하면 데이터 크기에 맞게 설정
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1, "A1");

        System.out.println("===checkArrayList2() Output===");
        for(String temp:list){
            System.out.println(temp);
        }
    }
    public void checkArrayList3() {
        ArrayList <String> list = new ArrayList<>();
        // 정해두지 않으면 초기 크기는 10으로 설정됨 가능하면 데이터 크기에 맞게 설정
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1, "A1");

        /* ArrayList <String> list2 = new ArrayList<>();
        list2.add("0");
        list2.addAll(list);
        */

        // 위 방법과 아래 방법은 동일한 결과를 반환
        ArrayList <String> list2 = new ArrayList<>(list);
        list2.add(0, "List II");

        System.out.println("===checkArrayList3() Output===");
        for(String temp:list2){
            System.out.println(temp);
        }
    }

    public void checkArrayList4() {
        ArrayList <String> list = new ArrayList<>();
        list.add("A");

        ArrayList <String> list2 = list;
        /** Shallow Copy / Deep Copy
         * 다른 객체에 원본 객체의 주소 값만 할당함 / 원본에 영향이 없게 객체의 모든 값을 복제(arraycopy() 사용)
         * 위와 같은 경우엔 주소를 복사하는 Shallow Copy이다.
         */
        list.add("Oops!");

        System.out.println("===checkArrayList4() Output===");
        for(String temp:list2){
            System.out.println(temp);
        }
    }

    public void checkArrayList5() {
        ArrayList <String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("A");
        int listSize = list.size();

        System.out.println("===checkArrayList5() Output===");
        for (int loop=0;loop<listSize;loop++){
           System.out.println("list.get("+loop+")="+list.get(loop));
        }

        // ArrayList는 중복 값을 허용. 검색할 때 앞에서 부터 찾을 때와 뒤에서 부터 찾을 때의 메소드가 다름
        System.out.println("indexOf("+"A"+")="+list.indexOf("A"));
        System.out.println("lastIndexOf("+"A"+")="+list.lastIndexOf("A"));
    }

    public void checkArrayList6() {
        ArrayList <String> list = new ArrayList<>();
        list.add("A");

        String[] strList = list.toArray(new String[0]);

        System.out.println("===checkArrayList6() Output===");
        System.out.println(strList[0]);
    }

    public void checkArrayList7() {
        ArrayList <String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        //String[] tempArray = new String[3];
        //String[] tempArray = new String[5]; // 객체의 데이터 크기가 매개 변수로 넘어간 배열 객체의 크기보다 크면 나머지는 Null
        //String[] tempArray = new String[2]; // 객체의 데이터 크기가 매개 변수로 넘어간 배열 객체의 크기보다 작으면 정상 처리됨
        String[] tempArray = new String[0];
        String[] strList = list.toArray(tempArray);

        System.out.println("===checkArrayList7() Output===");
        for(String temp:strList){
            System.out.println(temp);
        }
    }

    public void checkArrayList8() {
        ArrayList <String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");

        System.out.println("===checkArrayList8() Output===");

        //System.out.println("Removed index of 0 = "+list.remove(0));
        //System.out.println("Removed A = "+list.remove("A"));

        ArrayList<String> temp = new ArrayList<>();
        temp.add("A");
        // removeAll 메서드가 Collection을 매개변수로 받기 때문에 만들어 넘겨줘야 함
        list.removeAll(temp);
        System.out.println("Remove All A");

        for(int i=0;i<list.size();i++){
            System.out.println("list.get("+i+")="+list.get(i));
        }
    }
}
