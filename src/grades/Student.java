package grades;

import java.util.ArrayList;
import java.util.Optional;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        return (double) grades.stream().mapToInt(grade -> grade).sum() / grades.size();
    }

    public static void main(String[] args) {
        Student jimmy = new Student("Jimmy");
        jimmy.addGrade(75);
        jimmy.addGrade(80);
        System.out.println(jimmy.getGradeAverage());
    }
}
