public class Student {
    public static void main(String[] args) {
        // Primitive types: int, boolean, double, char
        int studentAge = 20;
        double studentGPA = 3.45;
        char studentFirstInitial = 'E';
        // char (single letters) MUST use single quotes: ' '
        char studentLastInitial = 'L';
        boolean hasPerfectAttendance = true;

        
        // Reference type: string
        // String MUST use double quotes:" "
        String studentFirstName = "Edmond";
        String studentLastName = "Luu";


        // Using indexes for string: use charAt
        char firstInitial = studentFirstName.charAt(0);
        char lastInitial = studentLastName.charAt(0);


        System.out.println(studentAge);
        System.out.println(studentGPA);
        // System.out.println(studentFirstInitial);
        // System.out.println(studentLastInitial);
        System.out.println(hasPerfectAttendance);
        System.out.println(studentFirstName);
        System.out.println(studentLastName);
        System.out.println(firstInitial);
        System.out.println(lastInitial);
    }
}
