import java.util.Scanner;

public class EmailOperations {
   public static void main(String[] args) {
   
      Scanner sc = new Scanner(System.in);
   
      System.out.print("Enter email address: ");
      String email = sc.nextLine();
   
      System.out.println("Length: " + email.length());
   
      int at = email.indexOf("@");
      String username = email.substring(0, at);
      System.out.println("Username: " + username);
   
      String domain = email.substring(at + 1);
      System.out.println("Domain: " + domain);
   
      if (domain.equalsIgnoreCase("bmsce.ac.in")) {
         System.out.println("Valid BMSCE email domain");
      } else {
         System.out.println("Not a BMSCE email domain");
      }
   
      String lower = email.toLowerCase();
      System.out.println("Lowercase: " + lower);
   
      System.out.print("Enter prefix: ");
      String prefix = sc.nextLine();
   
      if (email.startsWith(prefix)) {
         System.out.println("Email starts with given prefix");
      } else {
         System.out.println("Email does not start with given prefix");
      }
   
      if (email.toLowerCase().endsWith("bmsce.ac.in")) {
         System.out.println("Email ends with valid domain");
      } else {
         System.out.println("Email does not end with valid domain");
      }
   
      String updated = email.replace("bmsce.ac.in", "cse.bmsce.ac.in");
      System.out.println("Updated email: " + updated);
   
      System.out.print("Enter sequence to search: ");
      String sequence = sc.nextLine();
   
      if (email.contains(sequence)) {
         System.out.println("Email contains the sequence");
      } else {
         System.out.println("Email does not contain the sequence");
      }
   
      String trimmed = email.trim();
      System.out.println("Trimmed email: " + trimmed);
   
      System.out.print("Enter another email: ");
      String email2 = sc.nextLine();
   
      if (email.equalsIgnoreCase(email2)) {
         System.out.println("Both email addresses are identical");
      } else {
         System.out.println("Email addresses are different");
      }
   
      sc.close();
   }
}
