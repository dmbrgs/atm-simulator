package atmsimulator;

public class Card {

    private String cardHolderName;
    private String cardPAN;
    private String cardExpiryDate;
    private String cardSecurityCode;
    private String PINCode;
    private double accountBalance;

    public Card(String cardHolderName, String cardPAN, String cardExpiryDate, String cardSecurityCode, String PINCode, double accountBalance) {
        this.cardHolderName = cardHolderName;
        this.cardPAN = cardPAN;
        this.cardExpiryDate = cardExpiryDate;
        this.cardSecurityCode = cardSecurityCode;
        this.PINCode = PINCode;
        this.accountBalance = accountBalance;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getCardPAN() {
        return cardPAN;
    }

    public String getCardExpiryDate() {
        return cardExpiryDate;
    }

    public String getCardSecurityCode() {
        return cardSecurityCode;
    }

    public String getPINCode() {
        return PINCode;
    }

    public void setPINCode(String PINCode) {
        this.PINCode = PINCode;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Card{" + "cardHolderName=" + cardHolderName + ", cardPAN=" + cardPAN + '}';
    }

    public String getCardPrivateDetails() {
        return "Card{" + "cardHolderName=" + cardHolderName + ", cardPAN=" + cardPAN + ", cardExpiryDate=" + cardExpiryDate + ", cardSecurityCode=" + cardSecurityCode + ", PINCode=" + PINCode + ", accountBalance=" + accountBalance + '}';
    }

}
