package com.algaworks.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Exemplo1 {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Jose");
		nomes.add("Maria");
		nomes.add("Joao");
		
		nomes.forEach(System.out::println);
		
//		nomes.forEach(nome -> System.out.println(nome));

		
//		nomes.forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//		});
		
		
//		for (String nome : nomes) {
//			
//			System.out.println("Nome: " + nome);
//			
//		}
		
//		for (int i = 0; i < nomes.size(); i++) {
//			
//			System.out.println("Nome: " + nomes.get(i));
//			
//		}
		
		//nomes.remove(0);
		//nomes.remove("Joao");
		
		//System.out.println(nomes);
		
	}	
	
}
