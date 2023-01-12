public class CalculadoraAreaImpl implements CalculadoraArea{


    @Override
    public double calcular(double base, double altura) {
        return (base * altura) / 2;
    }

    @Override
    public double calcular(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura) / 2 ;
    }
}
