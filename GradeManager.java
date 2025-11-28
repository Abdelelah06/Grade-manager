public class GradeManager {

    public static void main(String[] args) {
        Student[] allStudents = createStudents();
        showAllStudents(allStudents);
        Student best = findBestStudent(allStudents);
        System.out.println("Best Student: " + best.getName());
        System.out.println("Best Average: " + best.getAverage());
    }

    public static Student[] createStudents() {
        double[] grades1 = {90, 85, 88};
        double[] grades2 = {78, 82, 80};
        double[] grades3 = {95, 93, 97};

        Student s1 = new Student("Ali", 101, grades1);
        Student s2 = new Student("Sara", 102, grades2);
        Student s3 = new Student("Omar", 103, grades3);

        Student[] students = {s1, s2, s3};
        return students;
    }

    public static void showAllStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            students[i].displayStudentInfo();
        }
    }

    public static Student findBestStudent(Student[] students) {
        Student best = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getAverage() > best.getAverage()) {
                best = students[i];
            }
        }
        return best;
    }
}
