package atmsimulator;

public class Main {

    public static void main(String[] args) {

        System.out.println("Some day it will be an ATM simulator.");

        Card newCard = new Card("Roberts Dambergs", "1234567890123456", "03/25", "559", "0045" , 500.0);
        System.out.println(newCard.toString());
        System.out.println(newCard.getCardPrivateDetails());
        System.out.println(newCard.getCardPAN());
        newCard.setAccountBalance(1000000.0);
        System.out.println(newCard.getCardPrivateDetails());
    }

}
