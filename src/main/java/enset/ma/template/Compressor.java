package enset.ma.template;

public abstract class Compressor {

    public final int[] compress(
            int[] data) {

        step1(data);

        step2(data);

        return data;
    }

    protected abstract void step1(int[] data);

    protected abstract void step2(int[] data);

}