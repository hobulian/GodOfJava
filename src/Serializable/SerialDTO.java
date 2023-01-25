package Serializable;

import java.io.Serializable;

public class SerialDTO implements Serializable {
    static final long serialVersionUID = 1L;
    private String bookName;
    transient private int bookOrder; // transient를 사용하면 해당 변수는 시리얼라이저블의 대상에서 제외됨. 패스워드 같은 보안 상 이유로 사용됨.
    private boolean bestSeller;
    private long soldPerDay;
    private String bookType = "IT";

    public SerialDTO(String bookName, int bookOrder, boolean bestSeller, long soldPerDay, String bookType) {
        this.bookName = bookName;
        this.bookOrder = bookOrder;
        this.bestSeller = bestSeller;
        this.soldPerDay = soldPerDay;
        this.bookType = bookType;
    }

    @Override
    public String toString() {
        return "SerialDTO{" +
                "bookName='" + bookName + '\'' +
                ", bookOrder=" + bookOrder +
                ", bestSeller=" + bestSeller +
                ", soldPerDay=" + soldPerDay +
                ", bookType='" + bookType + '\'' +
                '}';
    }
}
