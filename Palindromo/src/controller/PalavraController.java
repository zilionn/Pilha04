package controller;

import model.PilhaString;

public class PalavraController {

	public PalavraController() {
		super();
	}
	
	public String inverte(String palavra) throws Exception {
			PilhaString p = new PilhaString();
			StringBuilder invertida = new StringBuilder();
			
			for (int i = 0 ; i < palavra.length() ; i++) {
				p.push(String.valueOf(palavra.charAt(i)));
			}
			
			while(!p.isEmpty()) {
				invertida.append(p.pop());
			}
			
			return invertida.toString();
	}
	
	public boolean isPalindromo(String original, String invertida) {
		return original.equals(invertida);
	}

}
