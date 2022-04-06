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

    public String acceptUserInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }

    private boolean isCorrectPIN(String enteredPIN) {
        return this.card.getPINCode().equals(enteredPIN);

    }

    public boolean acceptUserPIN() {
        for (int i = 0; i < 3; i++) {
            String enteredPIN = this.acceptUserInput("Enter PIN: ");

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
        String answer = this.acceptUserInput("Screen or Check?");

        if (answer.equals("Screen")) {
            System.out.println("Your available balance is " + card.getAccountBalance());
        } else if (answer.equals("Check")) {
            System.out.println("Check printed.");
        } else {
            System.out.println("Input wasn't recognized.");

        }
    }

    public void insertCash() {
        String answer = this.acceptUserInput("Enter the amount of cash you want to deposit!");
        
        try {
            double deposit = Double.parseDouble(answer);
            card.setAccountBalance(card.getAccountBalance() + deposit);
            this.cashInATM += deposit;
            System.out.println("Cash successfully inserted.");
        } catch(NumberFormatException e) {
            System.out.println("Error. Next time, please enter a valid amount.");
        }
    }

    public void getCash() {
        String answer = this.acceptUserInput("Enter the amount of cash you want to receive!");
        try {
            double withdrawal = Double.parseDouble(answer);
            
            if (withdrawal <= card.getAccountBalance()) {
                card.setAccountBalance(card.getAccountBalance() - withdrawal);
                this.cashInATM -= withdrawal;
                System.out.println("Please take your money!");
            } else {
                System.out.println("Not enough money in your account!");
            }
        } catch(NumberFormatException e) {
            System.out.println("Error. Next time, please enter a valid amount.");
        }
    }
}
