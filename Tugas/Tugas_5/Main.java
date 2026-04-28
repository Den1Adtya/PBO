package Tugas_5;

public class Main {
    public static void main(String[] args) {
        // Test Student
        Student s = new Student("Budi", "Jakarta");
        s.addCourseGrade("Math", 80);
        s.addCourseGrade("English", 90);

        System.out.println(s);
        s.printGrades();
        System.out.println("Average: " + s.getAverageGrade());

        System.out.println();

        // Test Teacher
        Teacher t = new Teacher("Pak Andi", "Bandung");
        System.out.println(t.addCourse("Math"));     // true
        System.out.println(t.addCourse("Math"));     // false
        System.out.println(t.removeCourse("Math"));  // true
        System.out.println(t.removeCourse("Math"));  // false

        System.out.println(t);
    }
}
