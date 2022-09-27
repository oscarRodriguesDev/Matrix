package com.aed.soft.matrix;

import java.util.ArrayList;
import java.util.Random;

/**Essa classe será responsavel por gerar todo codigo que roda ma matrix*/
public class Codigo {	
	/**Esse metodo gera apenas uma letra que vai compor a sequencia de x dgitos para o codigo
	 * da matrix*/
	private String char_generator() {
		Codex codex =  new Codex();
		Random r = new Random();
		String str = codex.getCode();
		char caractere = str.charAt(r.nextInt(str.length()));
		return String.valueOf(caractere);

	}
	
	public String lineCodeGeneration() {
	    int[] tamanhos = {10,20,30,40,55,68,78,92,125}; 
		Random r = new Random();
		ArrayList<String>novo =  new ArrayList<>();
		novo.clear();
	  int max = tamanhos[r.nextInt(tamanhos.length)];
	   
	    for(int i = 0;i<=max;i++) {
	    	novo.add(char_generator());
	    	
	    }
	    String word =  novo.toString();
	    word =  word.substring(1,word.length()-1);
	    word = word.replace(",","");
	    return word;
	}

}
