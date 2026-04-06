package enset.ma.ex1_observer;


public class Gardien
        implements Observer {

    public void update(int score) {

        System.out.println("Gardien updated");
    }

}