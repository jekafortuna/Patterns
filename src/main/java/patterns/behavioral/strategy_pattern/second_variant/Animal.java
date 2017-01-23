package patterns.behavioral.strategy_pattern.second_variant;

/**
 * Created on 1. December. 16.
 *
 * @author Evgeniy
 */
public class Animal {

    private String name;
    private double height;
    private int weight;
    private String favoriteFood;
    private double speed;
    private String sound;

    private Flys flyingType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int newWeight) {
        if (newWeight > 0){
            weight = newWeight;
        } else {
            System.out.println("Weight must be positive!");
        }
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void fly(){
        System.out.println("I'm flying!");
    }

    public String tryToFly(){
        return flyingType.Fly();
    }
}
