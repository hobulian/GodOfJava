package Annotation.Override;

public class AnnotationOverride extends Parent{
    @Override
    public void printName(){
        System.out.println("@Override");
    }

//    @Override // java: method does not override or implement a method from a supertype
//    public void printName(String args){
//        System.out.println("@Override");
//    }
}
