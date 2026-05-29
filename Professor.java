public class Professor extends Person {

    public Professor(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public int getParticipatingHours(int courseHours) {
        int labHours;

        if (courseHours > 4) {
            labHours = 2;
        } else {
            labHours = 1;
        }

        return courseHours - labHours;
    }

    @Override
    public String getTitle() {
        return "Professor";
    }
}
