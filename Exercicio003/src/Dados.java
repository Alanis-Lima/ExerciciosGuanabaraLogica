import java.util.Scanner;

public class Dados {
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
