package com.mycompany.atividade2.p.o;
import java.util.Scanner;


public class Atividade2PO {

    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.mostrarProduto();
        Produto p2 = new Produto("Carro", 50000, 10);
        p2.mostrarProduto();
        Produto p3 = new Produto();
        Scanner receber = new Scanner(System.in);
        System.out.println("Nome do produto: ");
        p3.nome = receber.nextLine();
        System.out.println("Preco do produto: ");
        p3.preco = receber.nextDouble();
        System.out.println("Quantidade do pedido: ");
        p3.qtdPedido = receber.nextInt();
        p3.desconto();
        p3.calculaValor();
        p3.mostrarProduto2();
    }
}
