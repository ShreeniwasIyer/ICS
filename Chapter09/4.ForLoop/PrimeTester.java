import java.util.Scanner;

public class PrimeTester {

    public boolean is_prime(int number) {
      // This is called input testing
      // We are testing for inputs outside of the range of
      // function and returning an acceptable value up front
      if(number <= 1) {
        return false;
      }

      // All even numbers are non-primes
      if(number % 2 == 0) {
        return false;
      }

      /*
      * We are using Math.sqrt function to get the square root.
      * Since square-root may not be while numbers, this returns a Double
      * What we are doing is to take the ceiling of it - 13.3 -> 14.0 or 15.7 -> 16.0
      * And then convert the doubles to int using something called as Casting.
      * Casting converts one data type to another. Casting 14.0 to int would make it 14
      */
      int sqrt_number = (int) Math.ceil(Math.sqrt(number));
      
      for(int divisor = 3; divisor <= sqrt_number; divisor += 2) {
        if(number % divisor == 0) {
          return false;
        }
      }
      return true;
    }

   public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      PrimeTester pt = new PrimeTester();
      int number;
      System.out.print("Input a prime number: ");
      number = scanner.nextInt();
      if(pt.is_prime(number)) {
        System.out.println("Congratulations, Indeed this is a prime number");
      } else {
        System.out.println("Sorry, number is not prime");
      }

   }

}
