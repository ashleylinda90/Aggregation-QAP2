package CreditCardClass;

public class CreditCardDemo {

    public static void main(String[] args) {

        // new Money objects
        final Money LIMIT = new Money(1000);
        final Money FIRST_AMOUNT = new Money(200);
        final Money SECOND_AMOUNT = new Money(10.02);
        final Money THIRD_AMOUNT = new Money(25);
        final Money FOURTH_AMOUNT = new Money(990);

        // new Person object
        Person owner = new Person("Christie", "Diane", new Address("237J Harvey Hall", "Menomonie", "WI", "54751"));

        // new CreditCard object
        CreditCard visa = new CreditCard(owner, LIMIT);

        // Print Person paramters
        System.out.println(visa.getPersonals());
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Credit Limit: " + visa.getCreditLimit());
        System.out.println("Attempt to charge " + FIRST_AMOUNT);

        // Charge credit card $200
        visa.charge(FIRST_AMOUNT);
        System.out.println("Balance : " + visa.getBalance());
        System.out.println("Attempt to charge " + SECOND_AMOUNT);

        // Charge credit card $10.02
        visa.charge(SECOND_AMOUNT);
        System.out.println("Balance : " + visa.getBalance());
        System.out.println("Attempt to pay " + THIRD_AMOUNT);

        // Pay on credit card $25
        visa.payment(THIRD_AMOUNT);

        System.out.println("Balance : " + visa.getBalance());
        System.out.println("Attempt to charge " + FOURTH_AMOUNT);

        // Attempt to charge credit card $990
        visa.charge(FOURTH_AMOUNT);
        System.out.println("Balance : " + visa.getBalance());

    }
}
