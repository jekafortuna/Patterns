package patterns.adapter_pattern.first_variant;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class VectorAdapterFromRaster extends RasterGraphics implements VectorGraphicsInterface {

    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}
