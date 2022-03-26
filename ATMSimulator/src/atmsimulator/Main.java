package atmsimulator;

public class Main {

    public static void main(String[] args) {

        System.out.println("Some day it will be an ATM simulator.");

        Card newCard = new Card("Roberts Dambergs", "1234567890123456", "03/25", "559", "0045" , 500.0);
        ATM myATM = new ATM(10000);
        
        myATM.acceptCard(newCard);
        boolean correctPIN = myATM.checkPIN();
        
        if (correctPIN) {
            System.out.println("Programma trurpinajas");
        } else {
            System.out.println("Programma beidzas");
        }
    }

}
