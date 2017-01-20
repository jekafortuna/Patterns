package patterns.behavioral.memento_pattern;

/**
 * Created on 21. November. 16.
 * Memento pattern realization example
 *
 * @author Evgeniy
 */
public class MementoGame {
    public static void main(String[] args) {

        Game game = new Game();
        game.set("LVL 2", 30000);
        System.out.println(game);

        File file = new File();
        file.setSave(game.save());

        game.set("LVL 3", 55000);
        System.out.println(game);

        System.out.println("Loading...");
        game.load(file.getSave());
        System.out.println(game);
    }
}
