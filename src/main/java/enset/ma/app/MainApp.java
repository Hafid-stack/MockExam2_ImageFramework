package enset.ma.app;

import enset.ma.framework.ImageFramework;
import enset.ma.strategy.StandardFilter;
import enset.ma.template.StandardCompressor;

public class MainApp {

    public static void main(
            String[] args) {

        ImageFramework framework =
                new ImageFramework();

        framework.setFilter(
                new StandardFilter());

        framework.setCompressor(
                new StandardCompressor());

        int[] data = {1,2,3,4};

        framework.filter(data);

        framework.compress(data);

        System.out.println(
                "Framework OK");

    }

}