package Basic_JAVA.DynamicBinding;

class India {
    public void locate() {
        System.out.println("We are in India");
    }
}

class SubIndia extends India {

    @Override
    public void locate() {
        System.out.println("We are in Delhi");
    }
}
public class DynamicBindingTest {
    public static void main(String[] args) {
        India superObj = new India();
        superObj.locate();
        India subObj = new SubIndia();
        subObj.locate();
        SubIndia subObj2 = new SubIndia();
        subObj2.locate();
    }
}
