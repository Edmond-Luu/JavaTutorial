public class StudentProfileMain {
    public static void main(String[] args) {
        StudentProfile john = new StudentProfile("John", "Doe", 2022, 3.5, "Computer Science");
        john.addYear();
        System.out.println(john.gradYear);
    }
}
