public class TaxMG implements Tax{


    @Override
    public float calcular(float value) {
        return value * 1.1f;
    }
}
