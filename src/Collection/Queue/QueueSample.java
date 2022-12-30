package Collection.Queue;

import java.util.LinkedList;
import java.util.ListIterator;

public class QueueSample {
    public static void main(String[] args) {
        QueueSample sample = new QueueSample();
        sample.checkLinkedList1();
    }

    public void checkLinkedList1() {
        LinkedList<String> link = new LinkedList<>();
        link.add("A");
        link.addFirst("B"); // [B, A] 처음에 추가
        System.out.println(link);
        link.offerFirst("C"); // [C, B, A] 처음에 추가
        System.out.println(link);
        link.addLast("D"); // [C, B, A, D] 마지막에 추가
        System.out.println(link);
        link.offer("E");// [C, B, A, D, E] 마지막에 추가
        System.out.println(link);
        link.offerLast("F"); // [C, B, A, D, E, F] 마지막에 추가
        System.out.println(link);
        link.push("G"); // [G, C, B, A, D, E, F] 처음에 추가
        System.out.println(link);
        link.add(0,"H"); // [H, G, C, B, A, D, E, F] 처음에 추가
        System.out.println(link);
        System.out.println("EX = "+link.set(0,"I")); // 제일 처음의 데이터를 I로 수정 -> [I, G, C, B, A, D, E, F]
        System.out.println(link);
        // 가급적 add, addFirst를 사용하는 것이 좋다.

        System.out.println("First = "+link.getFirst()); // element, peek, peekFirst도 있지만 getFirst를 사용하자
        System.out.println("Last = "+link.getLast()); // peekLast도 있지만 getLast 사용
        System.out.println("Second = "+link.get(1));

        System.out.println("LinkedList Contains "+"A? :"+link.contains("A"));
        System.out.println("Index of "+"A? = "+link.indexOf("A"));
        System.out.println("Index of "+"Z? = "+link.indexOf("Z")); // 없으면 -1 리턴
        System.out.println("Last Index of "+"B? = "+link.lastIndexOf("B"));
        System.out.println("Last Index of "+"Z? = "+link.lastIndexOf("Z")); // 없으면 -1 리턴

        System.out.println("Remove "+link.remove(link.indexOf("A")));
        System.out.println(link);
        // 삭제는 removeFirst, removeLast를 사용하자. 각각 삭제한 값을 리턴해준다.

        ListIterator<String> iterator = link.listIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        } //hasPrevious()와 previous()도 사용 가능
    }
}
