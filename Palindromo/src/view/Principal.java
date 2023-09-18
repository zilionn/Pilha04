package view;

import java.util.Scanner;

import controller.PalavraController;

public class Principal {

	public static void main(String[] args) throws Exception {
		 Scanner sc = new Scanner(System.in);
	        PalavraController cont = new PalavraController();

	        System.out.println("Digite uma palavra: ");
	        String palavra = sc.nextLine();

	        String invertida = cont.inverte(palavra);

	        boolean isPalindromo = cont.isPalindromo(palavra, invertida);

	        if (isPalindromo) {
	            System.out.println("A palavra é um palíndromo!");
	        } else {
	            System.out.println("A palavra não é um palíndromo!");
	        }
	    sc.close();
		}
	
	}


