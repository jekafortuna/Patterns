package patterns.adapter_pattern.first_variant;

import java.io.FileNotFoundException;

/**
 * Created on 21. November. 16.
 * Adapter pattern realization example
 *
 * @author Evgeniy
 */
public class AdapterApp {
    public static void main(String[] args) throws FileNotFoundException{

        VectorGraphicsInterface graphicsInterface1 = new VectorAdapterFromRaster();
        graphicsInterface1.drawLine();
        graphicsInterface1.drawSquare();

        VectorGraphicsInterface graphicsInterface2 = new VectorAdapterFromRaster2();
        graphicsInterface2.drawLine();
        graphicsInterface2.drawSquare();
    }
}
