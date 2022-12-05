public class HtmlStatement extends Statement {
  
  public String getHeader(Customer aCustomer) {
    return ("<H1>Rentals for <EM>" + aCustomer.getName() +
      "</EM></H1><P>\n" );
  }
  public String getText(Rental each) {
    return (each.getMovie().getTitle()+ ": " +
         String.valueOf(each.getCharge()) + "<BR>\n" );
  }
  public String getFooter(Customer aCustumer) {
    return ( "<P>You owe <EM>" +
      String.valueOf(aCustumer.getTotalCharge()) + "</EM><P>\n" +
      "On this rental you earned <EM>" + 
      String.valueOf(aCustumer.getTotalFrequentRenterPoints()) +
      "</EM> frequent renter points<P>");
  }
}