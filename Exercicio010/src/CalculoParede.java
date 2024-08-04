import java.util.Scanner;

public class CalculoParede {
    Scanner leitura = new Scanner(System.in);
    public void tintaParede(){
        System.out.println("Digite a altura da parede: ");
        double altura = leitura.nextDouble();

        System.out.println("Digite a largura da parede: ");
        double largura = leitura.nextDouble();

        double area = altura * largura;
        double quantidadeTinta = area / 2;

        System.out.println("A área total corresponde a " + area);
        System.out.println("A quantidade de tinta necessaria é de " + quantidadeTinta + " litros");
    }
}
