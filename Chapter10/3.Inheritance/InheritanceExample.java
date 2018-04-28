public class InheritanceExample {

   public static void main(String args[]) {
       // Declaring a Species and initializing the variable as a Species
       Species species1 = new Species();

       // Since Species class contains does_breath method, you can call it here
       System.out.println("Breathes : " + species1.does_breath());

       // Declaring a Species and initializing the variable as a Dog
       Species species2 = new Dog();

       // Since Species class contains does_breath method, you can call it
       // even if the method is from the parent class
       System.out.println("Breathes : " + species1.does_breath());

       // Declaring a variable as Dog and initializing the variable as a Dog
       Dog dog1 = new Dog();

       // The following line would cause an error
       // Dog dog1 = new Species();



   }

}
