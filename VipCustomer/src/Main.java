public class Main {
    public static void main (String[] args) {
        VipCustomerClass MaxsAccount = new VipCustomerClass();
        System.out.println(MaxsAccount.getName());

        VipCustomerClass Marina = new VipCustomerClass(2000, "marina@test.com");
        System.out.println(Marina.getName());
    }
}
