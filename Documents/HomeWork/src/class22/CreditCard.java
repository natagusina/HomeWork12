package class22;

public class CreditCard {
    int balance;
    int interest;
    void setInterest(int balance, int interest){
        System.out.println("Cc");

    }
}
class Visa extends CreditCard{

}
class AX extends CreditCard{
    void setInterest(int balance, int interest){

        System.out.println("Ax");
    }

    public static void main(String[] args) {
        CreditCard cc=new CreditCard();
        cc.setInterest(1200,4);
        AX ax=new AX();
        ax.setInterest(1200,6);

    }
}
