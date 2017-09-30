package homework4.person.homework4.employee;

import homework4.person.Person;

import java.util.Arrays;

public class Employee extends Person {

    private int rate;
    private boolean socialPackage;
    private char[] driverCategory;
    private int amountOfBonuses;

    public Employee(String fullName, int age, String gender) {
        super(fullName, age, gender);
    }

    public int getRate() {
        return rate;
    }

    public boolean isSocialPackage() {
        return socialPackage;
    }

    public char [] getCategory() {
        return driverCategory;
    }

    public int getAmountOfBonuses() {
        return amountOfBonuses;
    }

    public void setRate(int rate) {
        rateValidation(rate);
        this.rate = rate;
    }

    public void setSocialPackage(boolean socialPackage) {
        this.socialPackage = socialPackage;
    }

    public void setCategory(char[] category) {
        setCategoryValidation(category);
        this.driverCategory = category;
    }
    public void setCategory(String category) {
        if (setCategoryValidation(category)){
            this.driverCategory = category.toCharArray();
        } else {
            System.out.println("invalid category");
        }


    }

    public void setAmountOfBonuses(int amountOfBonuses) {
        if (amountOfBonuses < 0) {
            System.out.println("set bonusses bigger than 0");
        }
        this.amountOfBonuses = amountOfBonuses;
    }

    @Override
    public String printInfo (String fullName, int age, String gender, String job, double salary) {
        StringBuilder info = new StringBuilder();
        String information;
        information = info.append(fullName).append(age).append(gender).append(job).append(salary).append(driverCategory).append(rate).toString();
        return information;
    }

    // helpers
    private void rateValidation(int rate) {
        if (rate == 0 || rate < 0 || rate > 100) {
            System.out.println("rate should be from 1 to 100");
        }

    }
    private void setCategoryValidation(char[] category) {
        char[] validCategory = {'A', 'B', 'C', 'D', 'M'};
        for (int i = 0; i < category.length; i++) {
            for (int j = 0; j < validCategory.length; j++)
                if (validCategory[j] == category[i]) {
                    return;
                } else {
                    System.out.println("type a valid driver category");
                }
        }
    }
    private boolean setCategoryValidation(String category) {
        char[] validCategory = {'A', 'B', 'C', 'D', 'M'};
        if (category == null) {
            System.out.println("enter category");
            return false;
        }
        for (int i = 0; i < validCategory.length; i++) {
            if ((String.valueOf(validCategory[i]).equals(category))) {
                return true;
            }
        } return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Arrays.equals(driverCategory, employee.driverCategory);
    }
}
