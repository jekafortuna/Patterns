package patterns.structural.facade_pattern;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class Computer {

    private Power power = new Power();
    private DVDRom dvdRom = new DVDRom();
    private HDD hdd = new HDD();

    void copy(){
        power.onPower();
        dvdRom.load();
        hdd.copyFromDVD(dvdRom);
        power.offPower();
    }
}
