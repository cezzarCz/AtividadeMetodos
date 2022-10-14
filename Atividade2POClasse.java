package com.mycompany.atividade2.p.o;

public class Produto {
    public String nome;
    public double preco;
    public double precoFinal;
    public double valorDesconto;
    public int qtd;
    public int qtdPedido;
    public double desconto;
    
    //Metodos construtores
    Produto(){
        nome = "Notebook";
        qtd = 5;
        preco = 3000;
    }
    Produto(String nome, double preco, int qtd){
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }
    //Metodos
    
    void mostrarProduto(){
        System.out.println("Nome: " + nome + " Estoque: " + qtd + " Valor total: " + preco);
    }
     void mostrarProduto2(){
        System.out.println("Nome: " + nome + " Valor final: " + precoFinal);
    }
    
    double desconto(){
        if(qtdPedido > 10 && qtdPedido < 21){
            desconto = 0.1;
        } else {
            if (qtdPedido > 20 && qtdPedido < 51){
                desconto = 0.2;
            } else {
                if (qtdPedido > 50) {
                    desconto = 0.25;
                } else {
                    desconto = 0;
                }
            }
        }
        return desconto;
    }
    
     double calculaValor(){
        valorDesconto = (qtdPedido * preco) * desconto; 
 
        precoFinal = (qtdPedido * preco) - valorDesconto;
        
        return precoFinal;
    }
}
