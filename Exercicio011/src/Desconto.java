public class Desconto {
    private String produto;
    private double precoFinal;
    private double desconto;

    public void setProduto(String produto){
        this.produto = produto;
    }
    public void setPrecoFinal(double precoFinal){
        this.precoFinal = precoFinal;
    }
    public void setDesconto(double desconto){
        this.desconto = desconto;
    }
    public String getProduto(){
        return produto;
    }
    public double getPrecoFinal(){
     return precoFinal;
    }
    public double getDesconto(){
        return desconto;
    }
    public void precoComDesconto(){
        double descontoProduto =  desconto / 100;
        double resultado = precoFinal - descontoProduto;
        System.out.println("Produto: " + produto + "\nPreço original: " + precoFinal);
        System.out.println("Preço com desconto de " + desconto + "% = " + resultado);
    }
}
