public class StudentProfile {
    String firstName;
    String lastName;
    int gradYear;
    double gpa;
    String major;

    public StudentProfile(String firstName, String lastName, int gradYear, double gpa, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
        this.gpa = gpa;
        this.major = major;
    }

    public void addYear() {
        this.gradYear = this.gradYear + 1;
    }
}
