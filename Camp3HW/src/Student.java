/**
 * @author gaye3
 * @since 1.05.2021
 */
public class Student extends User{
    private String studentNumber;

    public Student(int id,String name, String surname,  String email, String studentNumber) {
        super(id,name, surname,  email);
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
}
