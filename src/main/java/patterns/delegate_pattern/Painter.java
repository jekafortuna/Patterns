package patterns.delegate_pattern;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class Painter {

    public Graphics graphics;

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public void draw(){
        graphics.draw();
    }
}
