public class VipCustomerClass {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomerClass () {
        this("Maxim Golubev", 1000, "max@ebi.ai");
        System.out.println("Empty Constructor");
    }

    public VipCustomerClass (double creditLimit, String emailAddress) {
        this("Marina", creditLimit, emailAddress);
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        System.out.println("Half Empty Constructor");
    }

    public VipCustomerClass (String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
