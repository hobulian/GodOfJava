package Annotation.UserAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // 사용 대상 지정, 여기 같은 경우엔 메소드
//@Target({ElementType.METHOD, ElementType.TYPE}) // 메소드 + 클래스
@Retention(RetentionPolicy.RUNTIME) // 어노테이션 유지 정보 지정, 실행 시에 참조하는 어노테이션
public @interface UserAnnotation { //@UserAnnotation으로 어노테이션 실행 가능
    public int number();
    public String text() default "This is first Annotation";
}
