package homework4.person;

public class Person {
    protected String fullName;
    protected int age;
    protected String gender;
    protected String job;
    protected double salary;

    protected Person(String fullName, int age, String gender) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    public Person (String fullName, int age, String gender, String job) {
        this(fullName, age, gender);
        this.job = job;
    }

    public String printInfo (String fullName, int age, String gender, String job, double salary) {
        StringBuilder info = new StringBuilder();
        String information;
        information = info.append(fullName).append(age).append(gender).append(job).append(salary).toString();
        return information;
    }


}
