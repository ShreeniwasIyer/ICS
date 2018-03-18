public class Casting
{
    public static void main(String[] args)
    {
      short classrooms          = 50                    ;
      int speciesOnEarth        = 8700000               ;
      long peopleOnEarth        = 7600000000L           ;
      float  lowPrecision       = 12.6664287277627762f  ;
      double highPrecision      = 12.6664287277627762   ;

      // Implicit cast - no need for to specify the conversion

      // Assigning a short to an int
      int classrooms_i          = classrooms            ;
      // Assigning an int to a long
      long speciesOnEarth_l     = speciesOnEarth        ;
      // Assigning a long to a float
      float peopleOnEarth_f     = peopleOnEarth         ;
      // Assigning a float to a double
      double lowPrecision_d     = lowPrecision          ;


      System.out.println("\n\n");
      System.out.println("Kaplan has " + classrooms_i + " classrooms");
      System.out.println("Singapore hosts some of the " + speciesOnEarth_l + " species on earth");
      System.out.println("Singapore hosts some of the " + peopleOnEarth_f + " humans on earth");
      System.out.println("Low Precision to double casted Output " + lowPrecision_d);
      System.out.println("\n\n");

      // Widening Casts - need to specify the conversion specifically
      float highPrecision_f     = (float) highPrecision ;
      long lowPrecision_l       = (long) lowPrecision   ;
      int peopleOnEarth_i       = (int) peopleOnEarth   ;
      short speciesOnEarth_s    = (short) speciesOnEarth;

      System.out.println("Singapore hosts some of the " + speciesOnEarth_s + " species on earth");
      System.out.println("Singapore hosts some of the " + peopleOnEarth_i + " humans on earth");
      System.out.println("Float Low Precision to long casted Output " + lowPrecision_l);
      System.out.println("Double High Precision to float casted Output " + highPrecision_f);
      System.out.println("\n\n");



    }

}
