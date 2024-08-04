import java.util.Scanner;

public class Notas {
    Scanner teclado = new Scanner(System.in);
    public void calculo (){
        System.out.println("Digite a disciplina que deseja calcular a média:  ");
        String materia = teclado.nextLine();

        System.out.println("Digite sua primeira nota: ");
        double nota1 = teclado.nextDouble();

        System.out.println("Digite sua segunta nota: ");
        double nota2 = teclado.nextDouble();

        double resultado = (nota1 + nota2) / 2;
        System.out.println("A média das notas da disciplina de " + materia + " foi de " + resultado);

        if (resultado < 6){
            System.out.println("Você ficou abaixo da média! ");
        }
        if(resultado > 6){
            System.out.println("Você ficou acima da média! ");
        }
        if(resultado == 6){
            System.out.println("Você esta na média! ");
        }
    }
}
