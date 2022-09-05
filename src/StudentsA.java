
import java.util.Scanner;

public  class StudentsA
{
 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
        System.out.print("How many students are there?");
        int noOfStudents= sc.nextInt();  
        String[][]  students=new String[noOfStudents][2];
        int TotalMarks=0;
        for(int i=0;i<noOfStudents;i++)
        {
            System.out.println("Enter the name of student "+(i+1)+" :");
            String Name= sc.next();  
            System.out.println("Enter Marks of the student  "+(i+1)+" :");  
            String Marks= sc.next();  
            TotalMarks=TotalMarks+Integer.parseInt( Marks);
        
            students[i][0]=Name;
            students[i][1]=Marks;
        }
       

        System.out.println("Average mark is"+ (TotalMarks/noOfStudents) );
        System.out.println("The best student is "+ getBestOrWorstStudent(students,true) +" " );
        System.out.println("The worst student is "+ getBestOrWorstStudent(students,false) +" " );

       
        sc.close();
    }

public static String getBestOrWorstStudent(String[][] Students,boolean isBest){
    int StudentMarks=0;
    String Name= "";
    for(int j=0;j<Students.length;j++)
    {
        String thisStudentName=Students[j][0];
        int thisStudentMarks=Integer.parseInt(Students[j][1]);
    
        if(j==0) {StudentMarks=thisStudentMarks; Name=thisStudentName;}
        else
        {
        
            if(isBest && StudentMarks<=thisStudentMarks)
            {
                 
                if(StudentMarks==thisStudentMarks && Name!="" && Name!=thisStudentName)
                Name=Name+" , "+thisStudentName;
                else
                Name=thisStudentName;

                StudentMarks=thisStudentMarks;  
            }
            if(!isBest && StudentMarks>=thisStudentMarks){
                
                if(StudentMarks==thisStudentMarks && Name!="" && Name!=thisStudentName)
                Name=Name+" , "+thisStudentName;
                else
                Name=thisStudentName;

                StudentMarks=thisStudentMarks;
            }
        }
    }
    return Name;
}

}

