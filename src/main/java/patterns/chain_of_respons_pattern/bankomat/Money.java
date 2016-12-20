package patterns.chain_of_respons_pattern.bankomat;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class Money {

    private int sumOfMoney;

    public int getSumOfMoney() {
        return sumOfMoney;
    }

    public Money(int sumOfMoney) {
        setSumOfMoney(sumOfMoney);
    }

    public void setSumOfMoney(int sumOfMoney){

        if (sumOfMoney > 0 && sumOfMoney <= 20000 && sumOfMoney %Note.U50 == 0){
            this.sumOfMoney = sumOfMoney;
        }
        else {
            throw new RuntimeException("The amount of money should not be more than 20000 and a multiple to 50");
        }
    }
}
