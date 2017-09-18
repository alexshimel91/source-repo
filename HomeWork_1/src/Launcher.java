public class Launcher {

    public static String init = "Alex Shymel";

    public static void main(String[] args) {
        System.out.println(init);
        Employee employee = new Employee();
        Customer customer = new Customer();

        employee.name="Shaven";
        employee.age=66;
        employee.work="shaurmen";

        System.out.println(employee.resume("Shaven", 69, "shaurmen"));
        employee.complain(true);
        employee.earn(12,6);
        employee.toWork();

        customer.name="Gurgen";
        customer.age=90;
        customer.work="customer";

        customer.complain(false);
        customer.earn(2,8);
        customer.setupMeeting();
        customer.toWork();
    }
}
