import java.util.Scanner;

public class Calculo {
    //7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
    //sua terça parte.
    //Ex:
    //Digite um número: 3.5
    //O dobro de 3.5 é 7.0
    //A terça parte de 3.5 é 1.16666
    Scanner leituraTeclado = new Scanner(System.in);
    public void funcao(){
        System.out.println("Digite um numero real: ");
        double numeroDigitado = leituraTeclado.nextDouble();
        double dobro = numeroDigitado * 2;
        double tercaParte = numeroDigitado / 3;
        System.out.println("O dobro de " + numeroDigitado + " é " + dobro + "; a terça parte é " + tercaParte);
    }
}
