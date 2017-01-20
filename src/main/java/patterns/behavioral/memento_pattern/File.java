package patterns.behavioral.memento_pattern;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class File {

    private Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}
