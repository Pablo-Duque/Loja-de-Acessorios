package lojaAcessorios;

import java.util.ArrayList;
import java.util.Scanner;

public class Loja {
 public static void main(String[] args) {
	 ArrayList<Produto> listaProduto = new ArrayList<>();
	 Scanner obj = new Scanner(System.in);
 
	 listaProduto.add(new Produto("Bolsa", 50.00, "Louis Vuitton"));
	 listaProduto.add(new Produto("Óculos de sol", 100.00, "Ray-Ban"));
	 listaProduto.add(new Produto("Relógio", 200.00, "Casio"));
	 listaProduto.add(new Produto("Boné", 20.00, "New Era"));
	 listaProduto.add(new Produto("Colar", 30.00, "Pandora"));
	 listaProduto.add(new Produto("Bracelete", 25.00, "Swatch"));
	 listaProduto.add(new Produto("Cinto", 40.00, "Gucci"));
	 listaProduto.add(new Produto("Mochila", 80.00, "Adidas"));
	 listaProduto.add(new Produto("Chapéu", 35.00, "Billabong"));
	 listaProduto.add(new Produto("Carteira", 15.00, "Tommy Hilfiger"));

	 System.out.println("ID  Produto               Marca           Valor\n");
	 int i = 0;
	 for (Produto produto : listaProduto) {
	     System.out.printf("[%d] %-20s| %-15s| %.2f\n", i, produto.getDescricao(), produto.getMarca(), produto.getValor());
	     i++;
	 }
	 	NotaFiscal nf = new NotaFiscal();
	 	int fim = 0;
	 	
	 	while(fim != 1) {
	 	System.out.println("\nNumero do item a ser comprado: ");
	 	int item = obj.nextInt();
	 	
	 	System.out.println("\nQuantidade: ");
	 	int qtd = obj.nextInt();
	 	
	 	nf.adicionarProduto(listaProduto.get(item), qtd);
	 	
	 	System.out.println("Continuar comprando?\n[1] Sim\n[2] Nao");
	 	
	 	fim = obj.nextInt();
	 }
	 nf.imprimir();
	 obj.close();
 }
}
