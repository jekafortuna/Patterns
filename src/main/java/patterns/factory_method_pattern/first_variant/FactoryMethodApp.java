package patterns.factory_method_pattern.first_variant;

/**
 * Created on 17. November. 16.
 * Factory method pattern realization example
 *
 * @author Evgeniy
 */
public class FactoryMethodApp {

    public static void main(String[] args) {

//        WatchMaker maker = new DigitalWatchMaker();
//        WatchMaker maker = new RomeWatchMaker();
        WatchMaker maker = getMakerByName("Digital");

        Watch watch = maker.createWatch();
        watch.showTime();
    }

    public static WatchMaker getMakerByName(String maker){
        if (maker.equals("Digital"))
            return new DigitalWatchMaker();
        else if (maker.equals("Rome"))
            return new RomeWatchMaker();

        throw new RuntimeException("Not supported watch model " + maker);
    }
}
