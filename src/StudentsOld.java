
import java.util.Scanner;


public  class StudentsOld
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

int BestMarks=0;
int worsMarks=0;
String BestName= "";
String WorstName= "";
for(int j=0;j<noOfStudents;j++)
{
    int thisStudentMarks=Integer.parseInt(students[j][1]);
    if(BestMarks==0) 
    { BestMarks=thisStudentMarks;
        BestName=(String)students[j][0];
    }
        if(BestMarks<thisStudentMarks)
        {
            BestMarks=thisStudentMarks;
            BestName=(String)students[j][0];
        }
       // int thisStudentMarks=Integer.parseInt(students[k][1]);
        if(worsMarks==0) { worsMarks=thisStudentMarks;WorstName=(String)students[j][0];}
        
            if(worsMarks>thisStudentMarks)
            {
                worsMarks=thisStudentMarks;
                WorstName=(String)students[j][0];
            }
        
   
}
System.out.println("The best student is "+ BestName +" " );


System.out.println("The worst student is "+ WorstName +" " );

sc.close();

}

public String getBestOrWorstStudent(String[][] Students,boolean isBest)
{
    int StudentMarks=0;
int worsMarks=0;
String Name= "";
String WorstName= "";
    
        for(int j=0;j<Students.length;j++)
        {
            int thisStudentMarks=Integer.parseInt(Students[j][1]);
            if(StudentMarks==0) 
            { StudentMarks=thisStudentMarks;
                Name=(String)Students[j][0];
            }
            if(isBest && StudentMarks<thisStudentMarks)
            {
                StudentMarks=thisStudentMarks;
                Name=(String)Students[j][0];
            }
            if(!isBest && StudentMarks>thisStudentMarks){
                StudentMarks=thisStudentMarks;
                Name=(String)Students[j][0];
            }
    
        
        }
return Name;
}

}

