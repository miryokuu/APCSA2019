
public class Student {
    public static int studentID = 0;
    public String firstName, lastName;
    public int gradeLevel;
    public double GPA;
    
    Student()
    {
        this.firstName = "None";
        this.lastName = "None";
        this.gradeLevel = 0;
        this.GPA = 0d;
        Student.studentID++;
    }
    
    Student(String firstName, String lastName, int gradeLevel, double gpa)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel >= 0 && gradeLevel <= 12 ? gradeLevel : 0;
        this.GPA = gpa >= 0.0 && gpa <= 4.5 ? gpa : 0d;
        Student.studentID++;
    }
    
    @Override
    public String toString() 
    {
        return String.format("%s, %s\nGPA: %.1f\nGrade Level: %d id # %d", this.lastName, this.firstName, this.GPA, this.gradeLevel, Student.studentID);
    }

}
