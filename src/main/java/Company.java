public class Company {

    private float tax;

    public float getTax(){
        return this.tax;
    }

    public void taxMag(float profit ){
        Government government = new Government(profit);
        this.tax = government.calculateTax(new TaxMG());
    }

    public void taxSP(float profit ){
        Government government = new Government(profit);
        this.tax = government.calculateTax(new TaxSP());
    }
}
