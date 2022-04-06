package atmsimulator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Some day it will be an ATM simulator.");

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
            System.out.println("Choose your next step: A - check balance; B - Insert cash; C - get cash");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();

            if (answer.equals("A")) {
                myATM.checkBalance();
            } else if (answer.equals("B")) {
                myATM.insertCash();
            } else if (answer.equals("C")) {
                myATM.getCash();
            }
            System.out.println("Anything else?  A - Yes; B - No");
            Scanner scanner2 = new Scanner(System.in);
            String answer2 = scanner.nextLine();

            if (answer2.equals("B")) {
                System.out.println("Thank you for using our services!");
                break;
            }
        }
        System.out.println(myATM.getCard().getCardPrivateDetails());
        
    }

}
