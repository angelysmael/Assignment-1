public class TA extends Person {

    public TA(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public int getParticipatingHours(int courseHours) {
        if (courseHours > 4) {
            return 2;
        }

        return 1;
    }

    @Override
    public String getTitle() {
        return "TA";
    }
}
