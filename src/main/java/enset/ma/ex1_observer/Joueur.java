package enset.ma.ex1_observer;

import java.util.ArrayList;
import java.util.List;

public class Joueur {

    private int score;

    private List<Observer> observers =
            new ArrayList<>();

    public void addObserver(Observer o) {

        observers.add(o);
    }

    public void setScore(int s) {

        score = s;

        notifyObservers();
    }

    private void notifyObservers() {

        for (Observer o : observers) {

            o.update(score);
        }

    }

}