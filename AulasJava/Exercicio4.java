package AulasJava;
/* Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este 
 * n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for 
 * �mpar exiba o n�mero elevado ao quadrado.*/

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
		   System.out.printf("O numero digitado � %.2f par e sua raiz quadrada �  %.2f",numero,raiz);	 
		 }
		 
		 else
		 {
			quadrado = Math.pow(numero,2);
			System.out.printf("O n�mero digitado � %.2f impar e elevado ao quadrado fica %.2f ",numero,quadrado) ;
		 }
		
		
		
		
		 ler.close();
		
		
		
	}
}
