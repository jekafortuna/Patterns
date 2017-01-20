package patterns.behavioral.chain_of_respons_pattern.bankomat;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
abstract class NoteModule {

    protected NoteModule next;

    abstract void takeMoney(Money money);

    void setNextMoneyModule(NoteModule module){
        next = module;
    }
}
