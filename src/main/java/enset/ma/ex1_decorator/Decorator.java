package enset.ma.ex1_decorator;

public abstract class Decorator
        implements Component {

    protected Component component;

    public Decorator(Component c) {

        this.component = c;
    }

}