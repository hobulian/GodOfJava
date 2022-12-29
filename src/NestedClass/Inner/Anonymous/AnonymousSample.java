package NestedClass.Inner.Anonymous;

public class AnonymousSample {
    public static void main(String[] args) {
        AnonymousSample sample = new AnonymousSample();
        sample.setButtonListener();
    }

    public void setButtonListener() {
        MagicButton button = new MagicButton();

        /*
        MagicButtonListener listener = new MagicButtonListener();
        button.setListener(listener);
        button.onClickProcess();
        // 위와 같이 내부 클래스로 만들 수도 있지만
         */

        /*
        button.setListener(new EventListener() {
            @Override
            public void onClick() {
                System.out.println("Magic Button Clicked !!");
            }
        });
        // 위 처럼 익명 클래스로 제작 가능.
        // 그런데 위 방식은 클래스와 객체 이름이 없어서 다른 클래스와 메소드에서 참조가 불가능하다
        // 이런 경우에는 아래처럼
         */

        EventListener listener = new EventListener() {
            @Override
            public void onClick() {
                System.out.println("Magic Button Clicked !!");
            }
        };
        button.setListener(listener);
        button.onClickProcess();

        /*
        클래스를 많이 만들수록 메모리가 많이 필요해지고, 애플리케이션을 시작할 때 더 많은 시간이 소요됨.
        익명 클래스는 이런 문제 해결에 약간이나마 도움
         */
    }
}

class MagicButtonListener implements EventListener {
    @Override
    public void onClick() {
        System.out.println("Magic Button Clicked !!");
    }
}
