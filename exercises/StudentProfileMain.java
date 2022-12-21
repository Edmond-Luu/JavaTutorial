public class StudentProfileMain {
    public static void main(String[] args) {
        StudentProfile jane = new StudentProfile("Jane", "Doe", 2022, 3.7, "Computer Engineering");
        StudentProfile john = new StudentProfile("John", "Doe", 2022, 3.5, "Computer Science");
        john.addYear();
        System.out.println(john.gradYear);
        System.out.println(jane.gpa);
    }
}
