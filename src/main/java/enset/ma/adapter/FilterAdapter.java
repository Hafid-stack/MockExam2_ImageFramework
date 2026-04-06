package enset.ma.adapter;

import enset.ma.strategy.FilterStrategy;

public class FilterAdapter
        implements FilterStrategy {

    private OldFilter oldFilter =
            new OldFilter();

    public int[] filter(int[] data) {

        return oldFilter
                .appliquerFiltre(
                        "default",
                        data);
    }

}