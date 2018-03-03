public class LogicalAndAssignment {

  public static void main(String args[]) {


    boolean a = true;
    boolean b = false;

    System.out.println("Variable values...");
    System.out.println("    a = " + a);
    System.out.println("    b = " + b);

    System.out.println("a && b = " + (a&&b));
    System.out.println("a || b = " + (a||b) );
    System.out.println("!a = " + (!a) );
    System.out.println("!b = " + (!b) );
    System.out.println("!(a && b) = " + !(a && b));

    //a few numbers
    int i = 37;
    int j = 42;
    System.out.println("Variable values...");
    System.out.println("    i = " + i);
    System.out.println("    j = " + j);
    System.out.println("    x = " + x);
    System.out.println("    y = " + y);

    i += j;
    System.out.println("After (i += j)...");
    System.out.println("    i = " + i);
    System.out.println("    j = " + j);

    i -= j;
    System.out.println("After (i -= j)...");
    System.out.println("    i = " + i);
    System.out.println("    j = " + j);


  }
}
