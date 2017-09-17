public class Launcher {

    public static String init = "Alex Shymel";

    public static void main(String[] args) {
        System.out.println(init);
        Customer customer = new Customer();
        System.out.println(customer.resume("Shaven", 69, "shaurmen"));
        customer.complain(true);
        customer.earn(12,6);
        customer.pahat();
    }
}
