import java.util.Enumeration;

public class HtmlStatement extends Statement {
   public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = getHeader(aCustomer);
     
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for each rental
         result += getText(each);
      }
      //add footer lines
      result += getFooter(aCustomer);
      return result;
   }
  private String getHeader(Customer aCustomer) {
    return ("<H1>Rentals for <EM>" + aCustomer.getName() +
      "</EM></H1><P>\n" );
  }
  private String getText(Rental each) {
    return (each.getMovie().getTitle()+ ": " +
         String.valueOf(each.getCharge()) + "<BR>\n" );
  }
  private String getFooter(Customer aCustumer) {
    return ( "<P>You owe <EM>" +
      String.valueOf(aCustumer.getTotalCharge()) + "</EM><P>\n" +
      "On this rental you earned <EM>" + 
      String.valueOf(aCustumer.getTotalFrequentRenterPoints()) +
      "</EM> frequent renter points<P>");
  }
}