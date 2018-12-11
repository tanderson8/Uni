public class InheritanceDemo {
  public static void main(String[] args) {
    /* Person class example */
    Person teacher = new Person();
    teacher.setName("Helen");
    System.out.println(teacher);
   
    /* Student class example */
    Student student = new Student();
    student.setName("Alice");
    System.out.println(student);
  }
}