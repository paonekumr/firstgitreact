
import java.util.Scanner;

public class Students {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream.
        System.out.print("How many students are there?");
        int noOfStudents = sc.nextInt();
        StudentDatabase studentDatabase = new StudentDatabase();
        for (int i = 0; i < noOfStudents; i++) {
            System.out.println(
                    "Enter the name of student " + (i + 1) + " :" + "Enter Marks of the student  " + (i + 1) + " :");
            String Name = sc.next();
            Integer Marks = sc.nextInt();
            studentDatabase.add(new Student(Name, Marks));
        }
        System.out.printf("There are %d Students\n", studentDatabase.size());
        System.out.printf("The average mark is %.2f\n", studentDatabase.averageMark());
        System.out.printf("The best student name is %s with a mark of %d\n", studentDatabase.getBestStudent().getName(),
                studentDatabase.getBestStudent().getTotalMarks());
        System.out.printf("The worst student name is %s with a mark of %d\n",
                studentDatabase.getLastStudent().getName(),
                studentDatabase.getLastStudent().getTotalMarks());
        sc.close();

    }

}
