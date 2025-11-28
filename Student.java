public class Student {

    private String name;
    private int studentId;
    private double[] grades;
    private double average;

    public Student(String name, int studentId, double[] grades) {
        this.name = name;
        this.studentId = studentId;
        this.grades = grades;
        this.average = calculateAverage();
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public double[] getGrades() {
        return grades;
    }

    public double getAverage() {
        return average;
    }

    public double calculateAverage() {
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum / grades.length;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.print("Grades: ");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + " ");
        }
        System.out.println("\nAverage: " + average);
        System.out.println("----------------------------------");
    }
}
