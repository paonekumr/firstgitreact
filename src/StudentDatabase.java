import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class StudentDatabase {
     ArrayList<Student> students ;

    public StudentDatabase() {
        this.students=new ArrayList<Student>();
    }
    public StudentDatabase(List<String[]> studentsList) {
        this.students=new ArrayList<Student>();
        for(int i=0;i<studentsList.size();i++){
            String[] student=studentsList.get(i);
            this.students.add(new Student(student[0],Integer.parseInt(student[1])));
        }
    }
    public boolean add(Student student) {
        return this.students.add(student);
    }

    public void add(int index, Student student) {
        this.students.add(index, student);
    }

    public Student remove(int index) {
        return this.students.remove(index);
    }

    public boolean remove(Object o) {
        return this.students.remove(o);
    }

   public Student getBestStudent(){
    Student bestStudent=new Student();
    int maxScore=0;

    for(int i=0;i<students.size();i++){
        if(i==0) 
        {
            maxScore=students.get(i).getTotalMarks();
            bestStudent=students.get(i);
        }
      if(maxScore<students.get(i).getTotalMarks()){
        maxScore=students.get(i).getTotalMarks();
        bestStudent=students.get(i);
      }
    }
    return bestStudent;
}

public int size(){
    return this.students.size();
}
public Double averageMark(){
    Double totalmarks=0.0;
    for(int i=0;i<students.size();i++){
        totalmarks=totalmarks+students.get(i).getTotalMarks();
      }
      return totalmarks/students.size();
}
    
   public Student getLastStudent(){
    Student LastStudent=new Student();
    int minScore=0;
    
    for(int i=0;i<students.size();i++){
        if(i==0) 
        {
            minScore=students.get(i).getTotalMarks();
            LastStudent=students.get(i);
        }
      if(minScore>=students.get(i).getTotalMarks()){
        minScore=students.get(i).getTotalMarks();
        LastStudent=students.get(i);
      }
    }
return LastStudent;

   }
   public static List<String[]> readStudentFromFile(String fileName){
    List<String[]> students= new ArrayList<String[]>();
    try {
        File myObj = new File(fileName);
        Scanner myReader = new Scanner(myObj);
        
        while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
        String[] values=  data.split(",");
          students.add(values);
         
        }
        myReader.close();
      } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }finally{
       
      }
      return students;
    }
   
  
}
