public class Customer extends Person implements Employee {

    private String name;
    private int age;
    private String work;

    public String resume (String name, int age, String work){
        return name+" "+age+" "+" "+work;
    }

    @Override
    public void pahat() {
        System.out.println("Hard working or working hard?");
    }

    @Override
    public String complain(boolean compl) {
        String complPhrase;
        if (compl) {
            System.out.println("one complain");
            complPhrase = "I need more money, boss";
        }
        else {
            System.out.println("no complains");
            complPhrase = "I'm happy, boss";
        }
        System.out.println(complPhrase);
        return complPhrase;
    }

    @Override
    public void earn(int a, int b) {
        int sum = a+b;
        System.out.println(sum);
        int modulo = Math.round(a/b);
        System.out.println(modulo);
    }
}
