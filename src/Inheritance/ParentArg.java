package Inheritance;

public class ParentArg {
    public ParentArg(String name) {
        System.out.println("ParentArg("+name+") Constructor");
    }

    public ParentArg(InheritancePrint name) {
        System.out.println("ParentArg("+name+") Constructor");
    }

    public void printName(){
        System.out.println("printName() - ParentArg");
    }
}
