package homework4.person.homework4.contractor;

import homework4.person.Person;

public class Contractor extends Person{

    private int rate;
    private boolean legalContract;
    private char category;
    private boolean accessToPrivateNetwork;

    protected Contractor(String fullName, int age, String gender) {
        super(fullName, age, gender);
    }

    public Contractor(String fullName, int age, String gender, String job) {
        super(fullName, age, gender, job);
    }

    //getters
    public int getRate(){
        return this.rate;
    }
    public boolean getIsLegalContract(){
        return this.legalContract;
    }
    public char getCategory() {
        return this.category;
    }
    public boolean getIsAccessToPrivateNetwork(){
        return this.accessToPrivateNetwork;
    }

    //setters
    public int setRate(int rating){
        return this.rate = rating;
    }
    public boolean setLegalContract(boolean isContractLegal) {
        return this.legalContract = isContractLegal;
    }
    public char setCategory (char categories) {
        return this.category = categories;

    }
    public boolean setAccessToThePrivateNet(boolean accessToTheNet) {
        return this.accessToPrivateNetwork = accessToTheNet;
    }

}
