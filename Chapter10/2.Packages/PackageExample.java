import edu.kaplan.Student;

public class PackageExample {



   public static void main(String args[]) {
     // This is edu.kaplan.Student
     Student kaplan_student = new Student();
     kaplan_student.name = "James Bond";
     kaplan_student.roll_number = "007";

     edu.mit.Student mit_student = new edu.mit.Student();
     mit_student.name = "John Doe";
     mit_student.dorm = "Baker House";

     System.out.println(kaplan_student);
     System.out.println(mit_student);
   }

}
