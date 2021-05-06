public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student1 = new Student(1,"Gaye","Yılmaz","dfjdfj@gmail.com","123");
        Instructor instructor1 =  new Instructor(2,"Elif","Yılmaz","jhkdsj@gmail.com","Professor");

        UserManager userManager = new UserManager();
        userManager.add(student1);
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor1);
        instructorManager.delete(instructor1);
        StudentManager studentManager = new StudentManager();
        studentManager.add(student1);
        studentManager.delete(student1);

    }
}

