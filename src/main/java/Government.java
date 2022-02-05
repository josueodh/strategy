public class Government {

    private float profit;

    public Government(float profit){
        this.profit = profit;
    }

    public float calculateTax(Tax tax){
        return tax.calcular(this.profit);
    }
}
