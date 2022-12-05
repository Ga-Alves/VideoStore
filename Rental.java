public class Rental {

   private Movie _movie;
   private int _daysRented;

   public Rental(Movie movie, int daysRented) {
      _movie = movie;
      _daysRented = daysRented;
   }

   public int getDaysRented() {
      return _daysRented;
   }

   public Movie getMovie() {
      return _movie;
   }

  public double getCharge() {
    double thisAmt = 0;
    //determine amounts for aRental
    switch (this.getMovie().getPriceCode()) {
       case Movie.REGULAR:
          thisAmt += 2;
          if (this.getDaysRented() > 2)
             thisAmt += (this.getDaysRented() - 2) * 1.5;
          break;
       case Movie.NEW_RELEASE:
          thisAmt += this.getDaysRented() * 3;
          break;
       case Movie.CHILDRENS:
          thisAmt += 1.5;
          if (this.getDaysRented() > 3)
             thisAmt += (this.getDaysRented() - 3) * 1.5;
           break;
    }
    return thisAmt;
  }

  public int getFrequentRenterPoints() {
    int frequentRenterPoints = 0;
           // add frequent renter points
        frequentRenterPoints ++;
        // add bonus for a two day new release rental
        if ((this.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
            this.getDaysRented() > 1) frequentRenterPoints ++;
  return frequentRenterPoints;
  }
  
}