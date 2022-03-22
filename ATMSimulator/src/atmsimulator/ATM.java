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

    @Override
    public String toString() {
        return "ATM{" + "cashInATM=" + cashInATM + '}';
    }
    
    public void acceptCard(Card card) {
        this.card = card;
    }
    
    private boolean isValidPIN(String userPIN) {
        return this.card.getPINCode().equals(userPIN);
    }
    
    public boolean checkPIN() {
        Scanner scanner = new Scanner(System.in);
        
        for (int i=0; i < 3; i++) {
            System.out.println("Enter PIN: ");
            String userPIN = scanner.nextLine();
            
            if (this.isValidPIN(userPIN)) {
                System.out.println("Success");
                return true;
            }
            
            if (i < 2)
                System.out.println("Wrong PIN, please try again.\n");
        }
        
        System.out.println("Wrong PIN. Bank alert sent. Run.");
        return false;
    }    
}
