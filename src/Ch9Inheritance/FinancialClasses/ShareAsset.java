//a general asset that has a symbol and holds shares.
package Ch9Inheritance.FinancialClasses;

public abstract class ShareAsset implements Asset {
    private String symbol;
    private double totalCost, currentPrice;

    //constructs a new share asset with the given symbol
    //and current price


    public ShareAsset(String symbol, double currentPrice) {
        this.symbol = symbol;
        this.currentPrice = currentPrice;
        totalCost = 0.0;
    }
    //return the current market value of this asset
    //the children of shareAsset MUST implement the
    //getMarketValue() method, unless the child itself
    //is an abstract class.
    public abstract double getMarketValue();
    //returns the profit earned on shares of this asset
    public double getProfit(){
        return getMarketValue()-totalCost;
    }

    //return the price per share of this asset

    public double getCurrentPrice() {
        return currentPrice;
    }

    //getter: returns htis asset's total cost spent on all the shares
    public double getTotalCost() {
        return totalCost;
    }
    //returns a symbol of a specific ShareAsset
    public String getSymbol() {
        return symbol;
    }
    //setter:
    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    //setter: adds a cost of the given ammount to this asset

    public void addCost(double Cost) {
        totalCost += Cost;
    }
}

