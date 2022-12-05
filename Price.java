public abstract class Price {
  public static final int  CHILDRENS = 2;
	public static final int  REGULAR = 0;
	public static final int  NEW_RELEASE = 1;
  
   public abstract int getPriceCode();

  public double getCharge(int daysRented){
     double thisAmt = 0;
    //determine amounts for aRental
    switch (getPriceCode()) {
       case REGULAR:
          thisAmt += 2;
          if (daysRented > 2)
             thisAmt += (daysRented - 2) * 1.5;
          break;
       case NEW_RELEASE:
          thisAmt += daysRented * 3;
          break;
       case CHILDRENS:
          thisAmt += 1.5;
          if (daysRented > 3)
             thisAmt += (daysRented - 3) * 1.5;
           break;
    }
    return thisAmt;
  }
}