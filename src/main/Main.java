package main;

import controle.ControleProdutos;
import produtos.Eletronico;
import produtos.Livro;

public class Main {
    public static void main(String[] args) {
        ControleProdutos controleProdutos = new ControleProdutos();

        Eletronico eletronico = new Eletronico(1, "Smartphone", 3500.00, 0.3);
        Livro livro = new Livro(2,"Livro Histórico", 80, "FAI");
        controleProdutos.adicionarProduto(eletronico);
        controleProdutos.adicionarProduto(livro);

        controleProdutos.listarProdutos();
    }
}
