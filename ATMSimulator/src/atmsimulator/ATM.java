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

    private String enterPIN() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter PIN:");
        String enteredPIN = scanner.nextLine();
        return enteredPIN;

    }

    private boolean isCorrectPIN(String enteredPIN) {
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

    public void checkBalance() {

        System.out.println("Screen or check?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.equals("Screen")) {
            System.out.println("Your available balance is " + card.getAccountBalance());
        } else if (answer.equals("Check")) {
            System.out.println("Check printed.");
        } else {
            System.out.println("Input wasn't recognized.");

        }
    }

    public void insertCash() {

        System.out.println("Enter the amount of cash you want to deposit!");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        double deposit = Double.parseDouble(answer);
        card.setAccountBalance(card.getAccountBalance() + deposit);
        System.out.println("Cash successfully inserted.");

    }

    public void getCash() {
        System.out.println("Enter the amount of cash you want to receive!");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        double withdrawal = Double.parseDouble(answer);

        if (withdrawal <= card.getAccountBalance()) {
            card.setAccountBalance(card.getAccountBalance() - withdrawal);
            System.out.println("Please take your money!");
        }else {
            System.out.println("Not enough money in your account!");
        }
    }
}
