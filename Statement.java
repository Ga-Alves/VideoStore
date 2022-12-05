import java.util.Enumeration;

public abstract class Statement {
  abstract String getHeader(Customer aCustomer);
  abstract String getText(Rental each);
  abstract String getFooter(Customer aCustomer);
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
}