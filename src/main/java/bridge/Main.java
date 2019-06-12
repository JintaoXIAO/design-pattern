package bridge;

public class Main {
    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction(new ConcreteImplementor());
        abstraction.function();

        Abstraction abstraction1 = new AnotherRefinedAbstraction(new AnotherImplementor());
        abstraction1.function();
    }
}
