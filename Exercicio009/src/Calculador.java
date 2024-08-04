import java.util.Scanner;

public class Calculador {
    Scanner teclado = new Scanner(System.in);

    public void conversor(){
        System.out.println("Para converter para dolar (digite 1) \nPara converter para real (digite 2)");
        System.out.println("Para sair (digite 3)");
        int escolha = teclado.nextInt();

        while (escolha != 3) {
            if (escolha == 1) {
                System.out.println("Digite quantos reais quer converter: ");
                double real = teclado.nextDouble();
                double convertidoParaDolar = real / 5.73;
                System.out.println("Você tem " + convertidoParaDolar + " dolares");
            }
            if (escolha == 2) {
                System.out.println("Digite quantos dolares quer converter: ");
                double dolar = teclado.nextDouble();
                double convertidoParaReal = dolar * 5.73;
                System.out.println("Você tem " + convertidoParaReal + " reais");
            }
            System.out.println("Quer continuar? ");
            System.out.println("Para converter para dolar (digite 1) \nPara converter para real (digite 2)");
            System.out.println("Para sair (digite 3)");

            escolha = teclado.nextInt();
        }
        if(escolha == 3){
            System.out.println("Fim! ");
        }
    }

}
