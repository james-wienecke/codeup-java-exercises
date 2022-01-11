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
        int sum = 0;
//        for (int grade : grades) {
//            sum += grade;
//        }
        return (double) sum / grades.size();
    }
}
