public class TaxSP implements Tax{
    @Override
    public float calcular(float value) {
        return value * 1.15f;
    }
}
