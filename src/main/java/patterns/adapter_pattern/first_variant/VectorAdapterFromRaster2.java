package patterns.adapter_pattern.first_variant;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class VectorAdapterFromRaster2 implements VectorGraphicsInterface {

    RasterGraphics rasterGraphics = new RasterGraphics();

    @Override
    public void drawLine() {
        rasterGraphics.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        rasterGraphics.drawRasterSquare();
    }
}
