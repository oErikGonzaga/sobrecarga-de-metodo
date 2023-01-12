import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe os Lados: ");
        int lados = scanner.nextInt();

        double base = scanner.nextDouble();
        double altura = scanner.nextDouble();
        double baseMenor = scanner.nextDouble();
        double baseMaior = scanner.nextDouble();

        CalculadoraArea calculadoraArea = null;
        calculadoraArea = new CalculadoraAreaImpl();

        if (lados == 3){
            System.out.println("Informe a base: " + base);
            System.out.println("Informe a altura: " + altura);

            double result = calculadoraArea.calcular(base, altura);
            System.out.println(result);
        }

        if (lados == 4){
            System.out.println("Informe a base Maior: " + baseMaior);
            System.out.println("Informe a base Menor: " + baseMenor);
            System.out.println("Informe a altura: " + altura);

            double result = calculadoraArea.calcular(baseMaior, baseMenor, altura);
            System.out.println(result);
        }


    }
}
