package Annotation.UserAnnotation;

import java.lang.reflect.Method;

public class UserAnnotationCheck {
    public static void main(String[] args) {
        UserAnnotationCheck sample = new UserAnnotationCheck();
        sample.checkAnnotations(UserAnnotationSample.class);
    }

    public void checkAnnotations(Class useClass) {
        Method[] methods = useClass.getDeclaredMethods(); // 클래스에 선언된 메소드들을 배열로 반환
        for(Method temp:methods){
            UserAnnotation annotation = temp.getAnnotation(UserAnnotation.class); // 메소드에 선언되어 있는 매개 변수로 넘겨준 어노테이션 객체를 반환
            if(annotation!=null){
                int number= annotation.number();
                String text= annotation.text();
                System.out.println(temp.getName() + "() number = "+number+" text = "+text);
            } else {
                System.out.println(temp.getName() + "() : annotation is null.");
            }
        }
    }
}
