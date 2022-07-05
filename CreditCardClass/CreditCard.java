package CreditCardClass;

public class CreditCard {

    // instance variables
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // Constructor with owner info and credit limit
    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.creditLimit = creditLimit;
        this.balance = new Money(0);
    }

    // GETTERS

    public Money getBalance() {
        return this.balance;
    }

    public Money getCreditLimit() {
        return this.creditLimit;
    }

    // toString
    public String getPersonals() {
        return owner.toString();
    }

    // Charge credit card
    public void charge(Money amount) {
        if (balance.add(amount).compareTo(creditLimit) < 0) {
            System.out.println("Charge : " + amount);
            balance = balance.add(amount);
        } else
            System.out.println("Exceeds Credit Limit");
    }

    // Pay on credit card
    public void payment(Money amount) {
        if (balance.subtract(amount).compareTo(new Money(0)) >= 0) {
            System.out.println("Payment: " + amount);
            balance = balance.subtract(amount);
        } else {
            System.out.println("Insufficient Funds");
        }
    }
}
