public class DataTypes {

  public static void main(String args[]) {
    boolean singaporeIsGreat  = true                  ;

    // Character can only hold one character at a time

    char defaultCurrency      = '$'                   ;

    short classrooms          = 50                    ;

    int speciesOnEarth        = 8700000               ;

    // To not confuse numbers meant to be int and those meant to be long,
    // Java needs you to add an "L" at the end
    long peopleOnEarth        = 7600000000L           ;


    // To not confuse numbers meant to be float and those meant to be double,
    // Java needs you to add an "f" at the end of float literals
    float  lowPrecision       = 12.6664287277627762f  ;


    double highPrecision      = 12.6664287277627762   ;

    // The following line just adds two empty lines to output, to make it look cleaner
    System.out.println("\n\n");
    System.out.println("Is Singapore Great? " + singaporeIsGreat);
    System.out.println("Singapore trades in " + defaultCurrency);
    System.out.println("Singapore hosts some of the " + speciesOnEarth + " species on earth");
    System.out.println("Singapore hosts some of the " + peopleOnEarth + " humans on earth");
    System.out.println("Low Precision Output " + lowPrecision);
    System.out.println("High Precision Output " + highPrecision);
    // The following line just adds two empty lines to output, to make it look cleaner
    System.out.println("\n\n");
  }
}
