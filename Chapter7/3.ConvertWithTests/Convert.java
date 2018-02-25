import java.util.Scanner;

public class Convert {

  public static double fahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32.0) * 5.0 / 9.0;
  }

  public static void main(String args[]) {
    Scanner reader = new Scanner(System.in);
    double fahrenheit;
    double celsius;

    System.out.print("Enter temperature in fahrenheit: ");
    fahrenheit = reader.nextDouble();

    celsius = Convert.fahrenheitToCelsius(fahrenheit);

    System.out.print("Temperature in celsius is ");
    System.out.println(celsius);
  }
}
