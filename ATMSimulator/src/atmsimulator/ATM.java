package atmsimulator;

import java.util.Scanner;

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

    public Card getCard() {
        return card;
    }

    @Override
    public String toString() {
        return "ATM{" + "cashInATM=" + cashInATM + '}';
    }

    public void acceptCard(Card card) {
        this.card = card;
    }

    public String enterPIN() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter PIN:");
        String enteredPIN = scanner.nextLine();
        return enteredPIN;

    }

    public boolean isCorrectPIN(String enteredPIN) {
        return this.card.getPINCode().equals(enteredPIN);

    }

    public boolean acceptUserPIN() {
        for (int i = 0; i < 3; i++) {
            String enteredPIN = this.enterPIN();

            if (this.isCorrectPIN(enteredPIN)) {
                return true;
            }

            if (i < 2) {
                System.out.println("Try again.");
            }
        }

        return false;
    }
}
