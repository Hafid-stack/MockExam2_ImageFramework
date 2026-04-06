package enset.ma.ex1_composite;

import java.util.ArrayList;
import java.util.List;

public class Group extends Figure {

    private List<Figure> figures = new ArrayList<>();

    public void add(Figure f) {

        figures.add(f);
    }

    @Override
    public void draw() {

        for (Figure f : figures) {

            f.draw();
        }
    }
}