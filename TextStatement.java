import java.util.Enumeration;

public class TextStatement extends Statement {

   public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = getHeader(aCustomer);
     
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for this rental
         result += getText(each);
      }
      //add footer lines
      result += getFooter(aCustomer);
      return result;
   }

  private String getHeader(Customer aCustomer) {
    return ("Rental Record for " + aCustomer.getName() +
      "\n");
  }
  private String getText(Rental each) {
    return ("\t" + each.getMovie().getTitle()+ "\t" +
         String.valueOf(each.getCharge()) + "\n" );
  }
  private String getFooter(Customer aCustumer) {
    return ( "Amount owed is " +
      String.valueOf(aCustumer.getTotalCharge()) + "\n" +
       "You earned " +
      String.valueOf(aCustumer.getTotalFrequentRenterPoints()) +
      " frequent renter points");
  }
}