package patterns.structural.facade_pattern;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class DVDRom {

    private boolean data = false;

    public boolean hasData(){
        return data;
    }

    void load(){
        data = true;
    }

    void unload(){
        data = false;
    }
}
