package patterns.behavioral.memento_pattern;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class Save {

    private final String level;
    private final int ms;

    public Save(String level, int ms) {
        this.level = level;
        this.ms = ms;
    }

    public String getLevel() {
        return level;
    }

    public int getMs() {
        return ms;
    }
}
