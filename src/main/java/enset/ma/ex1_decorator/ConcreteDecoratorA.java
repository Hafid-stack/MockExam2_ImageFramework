package enset.ma.ex1_decorator;

public class ConcreteDecoratorA
        extends Decorator {

    public ConcreteDecoratorA(Component c) {

        super(c);
    }

    public void traitement() {

        System.out.println("Before A");

        component.traitement();

        System.out.println("After A");
    }

}