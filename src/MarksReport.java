public class MarksReport {


public static void main(String[] args) {
    StudentDatabase studentDatabase=new StudentDatabase(StudentDatabase.readStudentFromFile(args[0]));
    System.out.printf("There are %d Students\n", studentDatabase.size());
    System.out.printf("The average mark is %.2f\n", studentDatabase.averageMark());
    System.out.printf("The best student name is %s with a mark of %d\n", studentDatabase.getBestStudent().getName(),
            studentDatabase.getBestStudent().getTotalMarks());
    System.out.printf("The worst student name is %s with a mark of %d\n",
            studentDatabase.getLastStudent().getName(),
            studentDatabase.getLastStudent().getTotalMarks());
}
}
