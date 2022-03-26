package atmsimulator;

public class ATM {

    private double cashInATM;
    private Card card;

    public ATM(double cashInATM) {
        this.cashInATM = cashInATM;
    }

    public double getCashInATM() {
        return cashInATM;
    }

    public void setCashInATM(double cashInATM) {
        this.cashInATM = cashInATM;
    }

    @Override
    public String toString() {
        return "ATM{" + "cashInATM=" + cashInATM + '}';
    }
}
