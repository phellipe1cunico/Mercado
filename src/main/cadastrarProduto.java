package main;

import modelo.Produto;
import utilis.Utilis;
import java.util.ArrayList;
import java.util.Scanner;

public class CadastrarProduto {

    private ArrayList<Produto> listaProdutos = new ArrayList<>();


    public void cadastrar(){

        Scanner inputCadastro = new Scanner(System.in);

        System.out.println("Informe o nome do produto: ");
        String nome = inputCadastro.nextLine();

        System.out.println("Informe o preço do produto(virgúla): ");
        Double preco = inputCadastro.nextDouble();


        System.out.println("Informe a quantidade: ");
        int quantidade = inputCadastro.nextInt();

        Produto novoProduto = new Produto(nome, preco, quantidade);
        listaProdutos.add(novoProduto);

        System.out.println("Produto cadastrado com sucesso!");
        System.out.println("Produto cadastrado: " + nome + "\nPreço: R$" + preco +
                "\nQuantidade: " + quantidade + "\nValor total em estoque: R$" + (preco*quantidade)
        );
        inputCadastro.close();


    }
}
