import java.util.Scanner;

enum Result {
   PASS, FAIL, ABSENT
}

class Student {
   String usn;
   String name;
   Integer marks;
   Result status;

   Student(String usn, String name, int marks) {
      this.usn = usn;
      this.name = name;
      this.marks = marks; 
   }

   void calculateResult() {
      int m = marks; 
   
      if (m == -1) {
         status = Result.ABSENT;
      } else if (m >= 40) {
         status = Result.PASS;
      } else {
         status = Result.FAIL;
      }
   }

   void display() {
      System.out.println("USN: " + usn);
      System.out.println("Name: " + name);
      System.out.println("Marks: " + marks);
      System.out.println("Result: " + status);
   }
}

public class ExamResult {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
   
      System.out.print("Enter USN: ");
      String usn = sc.nextLine();
   
      System.out.print("Enter Name: ");
      String name = sc.nextLine();
   
      System.out.print("Enter Marks (-1 for absent): ");
      int marks = sc.nextInt();
   
      Student s = new Student(usn, name, marks);
   
      s.calculateResult();
      s.display();
   
      sc.close();
   }
}

