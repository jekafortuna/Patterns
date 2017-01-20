package patterns.behavioral.chain_of_respons_pattern.bankomat;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class NoteModule100 extends NoteModule{

    @Override
    void takeMoney(Money money) {

        int countNote = money.getSumOfMoney() / Note.U100;
        int remind = money.getSumOfMoney() % Note.U100;
        if (countNote > 0){
            System.out.println("Got " + countNote + " notes with value of " + Note.U100);
        }
        if (remind > 0 && next != null){
            next.takeMoney(new Money(remind));
        }
    }
}
