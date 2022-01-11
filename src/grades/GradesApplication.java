package grades;

import util.Input;

import java.util.HashMap;
import java.util.Random;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        String[] names = {"Jimmy", "Chantelle", "Isaac", "Kath", "Natalie"};
        String[] ghnames = {"jm-920", "gilmoregirl", "iounewsandwich", "grepgrepper", "DROP TABLES Students"};

        for (int i = 0; i < names.length; i++) {
            students.put(ghnames[i], makeUpStudent(names[i]));
        }

        students.forEach((name, student) -> {
            System.out.println(name);
        });
        Input in = new Input();
    }

    public static Student makeUpStudent(String name) {
        Student student = new Student(name);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            student.addGrade(random.nextInt(100 - 60) + 60);
        }
        return student;
    }
}
