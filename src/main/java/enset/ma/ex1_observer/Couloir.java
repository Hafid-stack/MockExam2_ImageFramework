package enset.ma.ex1_observer;

public class Couloir
        implements Observer {

    public void update(int score) {

        System.out.println("Couloir updated");
    }

}