package Ch9Inheritance.FinancialClasses;

public class Cash implements Asset {
    private double amount;

    //constructs a cash investment of the given amount
    public Cash(double amount){
        this.amount=amount;
    }

    public double getMarketValue() {
        return amount;
    }
    public double getProfit(){
        return 0.0;
    }
    public void setAmount(double cash){
        amount+=cash;
    }

}
