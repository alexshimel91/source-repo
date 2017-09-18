public class Customer extends Person implements Working {

    @Override
    public String complain(boolean compl) {
        if (!compl) {
            System.out.println("do it!");
        }else{
            System.out.println("don't do it!"); }
        return null;
    }
    public void toWork(){
        System.out.println("work!");
    }
    @Override
    public void earn(int a, int b) {
        double c = Math.pow(a,b);
        System.out.println(c);
    }

    @Override
    public void setupMeeting() {
        super.setupMeeting();
    }
}
