package Inheritance.Interface;

public class DefaultImplementedChild implements DefaultStaticInferface {
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSince() {
        return since;
    }
}
