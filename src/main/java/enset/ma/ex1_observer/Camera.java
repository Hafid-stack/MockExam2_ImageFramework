package enset.ma.ex1_observer;

public class Camera
        implements Observer {

    public void update(int score) {

        System.out.println("Camera updated");
    }

}