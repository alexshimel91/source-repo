public class Launcher {

    public static String INIT = "Alex Shymel";

    public static void main(String[] args) {
        System.out.println(INIT);
        Person person = new Employee("Gurgen", 49,"shaurmen");
        Person person1 = new Customer("Shaven", 70, "master-shaurmen");
        Arithmetic arif = new Arithmetic();

        System.out.println(person.printInfo());
        System.out.println(person1.printInfo());
        arif.arithmetic(3,12);
    }
}
