/*
Crie um programa que leia o preço de um produto, calcule e mostre o seu
PREÇO PROMOCIONAL, com 5% de desconto.
 */
public class PromocaoDesconto {
    public static void main(String[] args) {
        Desconto preco1 = new Desconto();
        preco1.setProduto("Leite");
        preco1.setPrecoFinal(10.50);
        preco1.setDesconto(5);
        preco1.getProduto();
        preco1.getPrecoFinal();
        preco1.getDesconto();
        preco1.precoComDesconto();
    }
}
