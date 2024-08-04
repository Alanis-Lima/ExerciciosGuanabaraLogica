import java.util.Scanner;

public class Mensagem {
    Scanner interacaoUsuario = new Scanner(System.in);
    public void mensagemBoasVindas(){
        System.out.println("Qual é o seu nome? ");
        String nomeUsuario = interacaoUsuario.nextLine();
        System.out.println("Olá " + nomeUsuario + ", é um prazer te conhecer! ");
    }
    /*
2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
    Ex:
    Qual é o seu nome? João da Silva
    Olá João da Silva, é um prazer te conhecer!

     */

}
