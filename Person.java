public abstract class Person implements ParticipateHours {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract String getTitle();

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
