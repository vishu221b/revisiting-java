package com.java.revision.Inheritance;

public class Hooman extends LivingOrganisms{

//    private LivingOrganisms livingOrganisms = new LivingOrganisms();
    private String firstName;
    private String lastName;
    private String race;

    Hooman(String firstName, String lastName, String race){
        this.firstName = firstName;
        this.lastName = lastName;
        this.race = race;
        super.setType("Human");
    }

    @Override
    public String toString() {
        return "Hooman{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", race='" + race + '\'' +
                ", type='" + this.getType() + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRace() {
        return race;
    }
}
