import java.util.Scanner;

public class Converter {

  public static String decimal_to_binary(int num){
     String binary_representation = "";
     while(num > 0){
       binary_representation = "" + (num%2) + binary_representation;
       num = num/2;
     }
     return binary_representation;
   }

   public static void main(String args[]) {
     Scanner reader = new Scanner(System.in);
     int decimal;

     System.out.print("Enter input in Decimal form: ");
     decimal = reader.nextInt();

     System.out.println("The number in binary form is " + Converter.decimal_to_binary(decimal));
   }

}
