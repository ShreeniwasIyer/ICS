import java.util.Scanner;

public class ExceptionExample {

  public int throwing_function(int a, int b) {
    return a/b;
  }

  public void catching_function() {
    try {
      System.out.println("Trying to divide 13 by 0 ");
      this.throwing_function(13, 0);
      System.out.println("This message will not be printed as exception generation will lead flow to go to catch");
    } catch (Exception e) {
      System.out.println("We caught the exception here. " + e.getMessage());

    }
  }

  public int function_letting_exception_pass(int p, int q) {
    return throwing_function(p*p, q*q);
  }

   public static void main(String args[]) {
     ExceptionExample e = new ExceptionExample();
     System.out.println("Dividing 10 by 5 " + e.throwing_function(10, 5));
     System.out.println("Calling catching_function");
     e.catching_function();
     System.out.println("Calling function_letting_exception_go with 10, 5 " + e.function_letting_exception_pass(10, 5));
     System.out.println("Calling function_letting_exception_go with 10, 0 " + e.function_letting_exception_pass(10, 0));
   }

}
