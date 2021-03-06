package patterns.behavioral.chain_of_respons_pattern.bankomat;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class NoteModule50 extends NoteModule{

    @Override
    void takeMoney(Money money) {

        int countNote = money.getSumOfMoney() / Note.U50;
        int remind = money.getSumOfMoney() % Note.U50;
        if (countNote > 0){
            System.out.println("Got " + countNote + " notes with value of " + Note.U50);
        }
        if (remind > 0 && next != null){
            next.takeMoney(new Money(remind));
        }
    }
}
