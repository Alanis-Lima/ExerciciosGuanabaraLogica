import java.util.Scanner;

public class Calculo {
    Scanner leituraTeclado = new Scanner(System.in);
    
    public void funcao(){
        System.out.println("Digite um numero real: ");
        double numeroDigitado = leituraTeclado.nextDouble();
        double dobro = numeroDigitado * 2;
        double tercaParte = numeroDigitado / 3;
        System.out.println("O dobro de " + numeroDigitado + " é " + dobro + "; a terça parte é " + tercaParte);
    }
}
