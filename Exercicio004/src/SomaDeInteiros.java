import java.util.Scanner;

public class SomaDeInteiros {
    Scanner entradaUsuario = new Scanner(System.in);

    public void calculo(){
        System.out.println("Digite um valor: ");
        int valor1 = entradaUsuario.nextInt();

        System.out.println("Digite outro valor: ");
        int valor2 = entradaUsuario.nextInt();

        int resultado = valor1 + valor2;
        System.out.println("A soma entre " + valor1 + " e " + valor2 + " resultou em " + resultado);
    }
}
