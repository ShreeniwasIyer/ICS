public class Strings {

  public static void main(String args[]) {
    //creating a string by java string literal
    String greeting = "Hello World!";

    // creating a string by java string by converting an array of char
    char spanishGreetingCharacters[]={'H','o','l','a',' ','A','m','i','g','o','s','!'};
    String spanishGreeting = new String(spanishGreetingCharacters);

    //creating another java string by using new keyword
	  String malayGreeting = new String("Salamat Datang!");

    // The following line just adds two empty lines to output, to make it look cleaner
    System.out.println("\n\n");
    System.out.println(greeting);
    System.out.println(spanishGreeting);
    System.out.println(malayGreeting);

    // You can create new Strings by adding them up - but assign to a new variable
    String allGreetings = greeting + spanishGreeting + malayGreeting;
    System.out.println("\n\n");
    System.out.println(allGreetings);

    // The following text will cause a compilation error.
    // This is because Strings are immutable
    // Comment it out to compile the code.
    String allGreetings = "Something New";
  }
}
