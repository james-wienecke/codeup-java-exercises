package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, Character> attendance;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }
    public ArrayList<Integer> getGrades() {
        return this.grades;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        return (double) this.grades.stream().mapToInt(grade -> grade).sum() / this.grades.size();
    }
    public boolean recordAttendance(String date, char value) {
        if (value == 'A' || value == 'P') {
            this.attendance.put(date, value);
            return true;
        } else {
            return false;
        }
    }

    public double attendancePercentage() {
        int absences = 0;
        for (char val : this.attendance.values()) {
            absences += (val == 'A' ? 1 : 0);
        }
        return ((double) (this.attendance.size() - absences) / this.attendance.size()) * 100;
    }

    public static void main(String[] args) {
        Student jimmy = new Student("Jimmy");
        jimmy.addGrade(75);
        jimmy.addGrade(80);
        System.out.println(jimmy.getGradeAverage());
    }
}
