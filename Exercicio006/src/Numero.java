import java.util.Scanner;

public class Numero {
    Scanner leitura = new Scanner(System.in);

    public void antecessorSucessor(){
        System.out.println("Digite um numero inteiro: ");
        int valor1 = leitura.nextInt();
        int antecessor = valor1 - 1;
        int sucessor = valor1 + 1;
        System.out.println(" O antecessor de " + valor1 + " é " + antecessor + " \n o sucessor é " + sucessor);
    }
}
