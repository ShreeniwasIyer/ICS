public char get_currency_prefix(String currency_short_form) {
  char symbol;
  switch(currency_short_form) {
    case "USD":
    case "SGD":
    case "HKD":
      symbol = '$';
      break;
    case "JPY":
      symbol = '¥';
    case "EUR":
      symbol = '€';
      break;
    default:
      symbol = '-';

  }
  return symbol;
}
