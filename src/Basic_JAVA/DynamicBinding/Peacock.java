package Basic_JAVA.DynamicBinding;

class Bird {
    void eat() {
        System.out.println("Bird is Eating");
    }
}
public class Peacock extends Bird{
    void eat() {
        System.out.println("Peacock is Eating");
    }

    public static void main(String[] args) {
        Bird b = new Bird();
        b.eat();
    }
}
