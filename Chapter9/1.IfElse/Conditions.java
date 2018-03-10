public class Conditions {

  /**
  * Function to return the next calendar month, given the current month
  * @author  Bruce Li
  * @version 1.0
  */
  public int next_month(int month) {
    // Check for outside of the range
    if(month < 1 || month > 12) {
      return 1;
    }

    if(month == 12) {
      return 1;
    }
    return month + 1;
  }

  /**
  Function
  */
  public String type_of_number_tertiary(int integer) {
    if(integer > 0) {
      return "Positive";
    } else if (integer == 0) {
      return "Zero";
    } else {
      return "Negative";
    }
  }

  public char get_currency_prefix(String currency_short_form) {
    if(
      "USD".equalsIgnoreCase(currency_short_form) ||
      "SGD".equalsIgnoreCase(currency_short_form) ||
      "HKD".equalsIgnoreCase(currency_short_form) ) {
      return '$';
    } else if ("JPY".equalsIgnoreCase(currency_short_form)) {
      return '¥';
    } else if ("EUR".equalsIgnoreCase(currency_short_form)) {
      return '€';
    }

    return '-';
  }
}
