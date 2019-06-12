package bridge;

public class AnotherRefinedAbstraction extends Abstraction{
    public AnotherRefinedAbstraction(Implementor impl) {
        super(impl);
    }

    @Override
    public void function() {
        System.out.println("we are changed");
        super.function();
    }
}
