package patterns.structural.bridge_pattern;

/**
 * Created on 8. February. 17.
 * Responsible for type of car. More important. Saving link on interface
 *
 * @author Evgeniy
 */
public abstract class Car {
    Model model;

    public Car(Model model) {
        this.model = model;
    }

    abstract void showType();
    void showDetails(){
        showType();
        model.setModel();
    }
}
