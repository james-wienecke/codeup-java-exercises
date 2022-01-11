package grades;

import util.Input;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        String[] names = {"Jimmy", "Chantelle", "Isaac", "Kath", "Natalie"};
        String[] ghnames = {"jimcantswim", "minecraftgod", "iou a new sandwich", "grepgrepper", "DROP TABLES Students"};

        for (int i = 0; i < names.length; i++) {
            students.put(ghnames[i], makeUpStudent(names[i]));
        }

        appLoop(students);
    }

    public static Student makeUpStudent(String name) {
        Student student = new Student(name);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            if (random.nextBoolean()) {
                student.addGrade(random.nextInt(100 - 50) + 50);
            } else {

                student.addGrade(random.nextInt(100 - 85) + 85);
            }
        }
        for (int i = 1; i < 30; i++) {
            String date = String.format("2022-01-%02d", i);
            int present = random.nextInt(17) + 3;
            student.recordAttendance(date, (present > 3 ? 'P' : 'A'));
        }
        return student;
    }

    public static void printClassAverage(HashMap<String, Student> students) {
        System.out.println("Class average:");
        LinkedList<Double> avgs = new LinkedList<>();
        students.forEach((ghName, student) -> avgs.add(student.getGradeAverage()));
        double sum = avgs.stream().mapToDouble(avg -> avg).sum();
        System.out.println(sum / avgs.size());
    }

    public static void printStudentInfo(Student student) {
        System.out.println("Student name: " + student.getName());
        StringBuffer sb = new StringBuffer("Grades:");
        student.getGrades().forEach(grade -> sb.append(' ').append(grade));
        System.out.println(sb.toString());
        System.out.println("Grade average: " + student.getGradeAverage());
        System.out.println("Attendance rate: " + String.format("%.2f", student.attendancePercentage()) + "%");
    }

    public static void printStudentsCSV(HashMap<String, Student> students) {
        System.out.println("CSV Report:\nTemplate: name,github username,average");
        students.forEach(GradesApplication::printCSV);
    }

    private static void printCSV(String username, Student student) {
        System.out.println(String.format("%s,%s,%.1f", student.getName(), username, student.getGradeAverage()));
    }

    public static void appLoop(HashMap<String, Student> students) {
        Input in = new Input();
        boolean cont = true;
        do {
            // menu options
            System.out.println("Student GitHub Usernames:");
            students.forEach((ghName, student) -> {
                System.out.println(ghName);
            });

            // take input
            String resp = in.getString("Enter the username of the student you wish to see more information about.");
            // react to input
            if (students.containsKey(resp)) {
                // name lookup success
                System.out.println("Showing data for " + resp);
                printStudentInfo(students.get(resp));
                // pause screen on the output and allow user to choose to go back to the menu or exit application
                cont = in.yesNo("Do you want to return to the main menu?");
            } else if (!students.containsKey(resp) && resp.equalsIgnoreCase("class average")) {
                printClassAverage(students);
                cont = in.yesNo("Do you want to return to the main menu?");
            } else if (!students.containsKey(resp) && resp.equalsIgnoreCase("csv")) {
                printStudentsCSV(students);
                cont = in.yesNo("Do you want to return to the main menu?");
            } else {
                // name lookup failure
                System.out.println("Cannot find student: " + resp);
            }
        } while (cont);
    }
}
