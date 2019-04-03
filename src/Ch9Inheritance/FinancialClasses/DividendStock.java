//represents a stock purchased that also pays dividends

package Ch9Inheritance.FinancialClasses;

public class DividendStock extends Stock {
    private double dividends; //amount of dividends paid
    //constructs a new dividend stock with the given symbol
    //and no shares purchased
    public DividendStock(String symbol, double currentPrice){
        super(symbol,currentPrice);
        dividends = 0.0;
    }

    //returns the dividensstocks market value which is nromal stocks market value + any dividends
    public double getMarketValue(){
        return super.getMarketValue() + dividends;
    }
    //records a dividends of the given amount per share
    public void payDividend(double amountPerShare){
        dividends += amountPerShare * getTotalShares();
    }
}
