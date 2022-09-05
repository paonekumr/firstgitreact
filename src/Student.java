public class Student {
  private  String Name;
    private Integer totalMarks;
    
    public Student() {
        this(" ", 0);
    }
    public Student(String name, Integer totalMarks) {
        this.Name = name;
        this.totalMarks = totalMarks;
    }

    public Integer getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(Integer totalMarks) {
        this.totalMarks = totalMarks;
    }

    

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
