package AulasJava;
/* Faça um programa em que permita a entrada de um número qualquer e exiba se este 
 * número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for 
 * ímpar exiba o número elevado ao quadrado.*/

import java.util.*;

public class Exercicio4 {

	
	public static void main (String args[]) {
		
		
		 Scanner ler = new Scanner (System.in);
		 
		
		 double numero, raiz , quadrado;
		 
		 System.out.println("Digite um numero: ");	
		 numero = ler.nextDouble();
		 
		 if(numero% 2 == 0)
		 {	 
		   raiz = Math.sqrt(numero);
		   System.out.printf("O numero digitado é %.2f par e sua raiz quadrada é  %.2f",numero,raiz);	 
		 }
		 
		 else
		 {
			quadrado = Math.pow(numero,2);
			System.out.printf("O número digitado é %.2f impar e elevado ao quadrado fica %.2f ",numero,quadrado) ;
		 }
		
		
		
		
		 ler.close();
		
		
		
	}
}
