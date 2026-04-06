package enset.ma.ex1_decorator;

public class ConcreteDecoratorB
        extends Decorator {

    public ConcreteDecoratorB(Component c) {

        super(c);
    }

    public void traitement() {

        System.out.println("Before B");

        component.traitement();

        System.out.println("After B");
    }

}