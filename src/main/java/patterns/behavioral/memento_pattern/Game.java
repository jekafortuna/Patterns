package patterns.behavioral.memento_pattern;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class Game {

    private String level;
    private int ms;

    public void set(String level, int ms){
        this.level = level;
        this.ms = ms;
    }

    public void load(Save save){
        level = save.getLevel();
        ms = save.getMs();
    }

    public Save save(){
        return new Save(level, ms);
    }

    @Override
    public String toString() {
        return "Game {" + "level = '" + level + '\'' + ", ms = " + ms + '}';
    }
}