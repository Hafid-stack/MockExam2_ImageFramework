package enset.ma.ex1_template;

public class PluginFactory {

    public static Plugin create(String type) {

        if (type.equals("A"))
            return new PluginA();

        if (type.equals("B"))
            return new PluginB();

        return null;
    }

}