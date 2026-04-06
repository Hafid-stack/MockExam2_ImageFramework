package enset.ma.framework;

import enset.ma.strategy.FilterStrategy;
import enset.ma.template.Compressor;

public class ImageFramework {

    private FilterStrategy filter;

    private Compressor compressor;

    public void setFilter(
            FilterStrategy f) {

        filter = f;
    }

    public void setCompressor(
            Compressor c) {

        compressor = c;
    }

    public int[] filter(
            int[] data) {

        return filter.filter(data);
    }

    public int[] compress(
            int[] data) {

        return compressor.compress(data);
    }

}