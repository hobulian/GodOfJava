package Annotation.UserAnnotation;

public class UserAnnotationSample {
    @UserAnnotation(number=0)
    public static void main(String[] args) {
        UserAnnotationSample sample = new UserAnnotationSample();
    }

    @UserAnnotation(number=1) // text는 default로 기본 값이 지정되어서 별도로 지정할 필요가 없다
    public void annotationSample1(){}

    @UserAnnotation(number=2, text="Second")
    public void annotationSample2(){}

    @UserAnnotation(number=3, text="Third")
    public void annotationSample3(){}

}
