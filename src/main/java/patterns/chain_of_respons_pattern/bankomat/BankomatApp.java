package patterns.chain_of_respons_pattern.bankomat;

/**
 * Created on 21. November. 16.
 * Chain of responsibility pattern realization example
 *
 * @author Evgeniy
 */
public class BankomatApp {
    public static void main(String[] args) {

        NoteModule note500 = new NoteModule500();
        NoteModule note200 = new NoteModule200();
        NoteModule note100 = new NoteModule100();
        NoteModule note50 = new NoteModule50();

        note500.setNextMoneyModule(note200);
        note200.setNextMoneyModule(note100);
        note100.setNextMoneyModule(note50);

//        NoteModule note500 = new NoteModule500();
//        NoteModule note200 = new NoteModule200();
//        NoteModule note50 = new NoteModule50();
//
//        note500.setNextMoneyModule(note200);
//        note200.setNextMoneyModule(note50);

        note500.takeMoney(new Money(17350));
    }
}
