package lojaAcessorios;

import java.util.ArrayList;

public class NotaFiscal {
	private ArrayList <String> desc = new ArrayList<>();	
	private ArrayList <Double> vlItem = new ArrayList<>();	
	private ArrayList <Double> unid = new ArrayList<>();	
	private ArrayList <Integer> qtdl = new ArrayList<>();	
	private double soma = 0;
	 
	public void adicionarProduto(Produto p, int qtd){
		 desc.add(p.getDescricao());
		 unid.add(p.getValor());
		 qtdl.add(qtd);
		 vlItem.add(p.getValor() * qtd);
	 }
	public void imprimir() {
		System.out.println("Produto               Qtd  UN   Vl Unit  Vl Item\n");
		for (int i = 0; i < desc.size(); i++) {
		    System.out.printf("%-20s| %1dx | UN | %6.2f | %3.2f\n", desc.get(i), qtdl.get(i), unid.get(i), vlItem.get(i));
		    soma += vlItem.get(i);
		}
		System.out.println("------------------------------------------------");
		System.out.printf("%-40s %.2f\n", "TOTAL", soma);

	}
}
