import java.util.Scanner;

public class Dados {
   //3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no
    //final uma mensagem.
    //Ex:
    //Nome do Funcionário: Maria do Carmo
    //Salário: 1850,45
    //O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.
    Scanner leituraUsuario = new Scanner(System.in);

    public void dadosFuncionario(){
        System.out.println("Qual o seu nome: ");
        String nome = leituraUsuario.nextLine();

        System.out.println("Digite o mês atual: ");
        String mes = leituraUsuario.nextLine();

        System.out.println("Digite o seu salário atual: ");
        double salario = leituraUsuario.nextDouble();

        System.out.println( nome + " tem um salário de R$" + salario + " no mês de " + mes );
    }
}
