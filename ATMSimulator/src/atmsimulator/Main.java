package atmsimulator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Card newCard = new Card("Roberts Dambergs", "1234567890123456", "03/25", "559", "0045", 500.0);
        ATM myATM = new ATM(10000);

        myATM.acceptCard(newCard);
        System.out.println(myATM.getCard().toString());

        boolean isCorrectPIN = myATM.acceptUserPIN();

        if (!isCorrectPIN) {
            System.out.println("Programma beidzas");
            return;
        }

        while (true) {
            String answer = myATM.acceptUserInput("Choose your next step: A - check balance; B - Insert cash; C - get cash");

            if (answer.equals("A")) {
                myATM.checkBalance();
            } else if (answer.equals("B")) {
                myATM.insertCash();
            } else if (answer.equals("C")) {
                myATM.getCash();
            } else {
                System.out.println("Option " + answer + " doesn't exist.");
            }

            answer = myATM.acceptUserInput("Anything else?  A - Yes; B - No");

            if (answer.equals("B")) {
                System.out.println("Thank you for using our services!");
                break;
            }
        }

        System.out.println(myATM.getCard().getCardPrivateDetails());

    }

}
