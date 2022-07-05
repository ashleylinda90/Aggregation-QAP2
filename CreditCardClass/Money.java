package CreditCardClass;

public class Money {

    // instance variables
    private long dollars;
    private long cents;

    // Default constructor
    public Money() {
        this.dollars = 0;
        this.cents = 0;
    }

    // Constructor with dollars and cents
    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = (long) ((amount - this.dollars) * 100);
    }

    // Copy constructor
    public Money(Money otherObject) {
        dollars = otherObject.dollars;
        cents = otherObject.cents;
    }

    // Add money
    public Money add(Money otherAmount) {
        Money addMoney = new Money(0);
        addMoney.cents = this.cents + otherAmount.cents;
        long carryDollars = addMoney.cents / 100;
        addMoney.cents = addMoney.cents % 100;
        addMoney.dollars = this.dollars + otherAmount.dollars + carryDollars;

        return addMoney;
    }

    // Subtract money
    public Money subtract(Money otherAmount) {
        Money subMoney = new Money(0);
        subMoney.cents = this.cents - otherAmount.cents;
        long borrowDollars = subMoney.cents / 100;
        subMoney.cents = subMoney.cents % 100;
        subMoney.dollars = this.dollars - otherAmount.dollars - borrowDollars;

        return subMoney;
    }

    // Compare to other money object
    public int compareTo(Money otherObject) {
        if (this.dollars > otherObject.dollars) {
            return 1;
        } else if (this.dollars < otherObject.dollars) {
            return -1;
        } else {
            if (this.cents > otherObject.cents) {
                return 1;
            } else if (this.cents < otherObject.cents) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    // toString
    public String toString() {
        return ("$" + this.dollars + "." + this.cents);
    }
}
