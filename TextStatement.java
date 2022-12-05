public class TextStatement extends Statement {

  public String getHeader(Customer aCustomer) {
    return ("Rental Record for " + aCustomer.getName() +
      "\n");
  }
  public String getText(Rental each) {
    return ("\t" + each.getMovie().getTitle()+ "\t" +
         String.valueOf(each.getCharge()) + "\n" );
  }
  public String getFooter(Customer aCustumer) {
    return ( "Amount owed is " +
      String.valueOf(aCustumer.getTotalCharge()) + "\n" +
       "You earned " +
      String.valueOf(aCustumer.getTotalFrequentRenterPoints()) +
      " frequent renter points");
  }
}