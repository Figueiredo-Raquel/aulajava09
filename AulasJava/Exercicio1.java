package AulasJava;
/*Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/

import java.util.*;

public class Exercicio1 {
	
    public static void main (String args[]){

	  Scanner ler = new Scanner (System.in);
	
	  
	  int valor1,valor2,valor3;

	  System.out.println("Digite o primeiro valor: ");
	  valor1 = ler.nextInt();
	  System.out.println("Digite o primeiro valor: ");
	  valor2 = ler.nextInt();
	  System.out.println("Digite o primeiro valor: ");
	  valor3 = ler.nextInt();

	  if(valor1 >= valor2 && valor1 >= valor3)
	  {
		  System.out.printf("O maior valor � : %d",valor1);
	  }
	  
	  else if(valor2 > valor1 && valor2 > valor3)
	  {
	      System.out.printf("O maior valor � : %d",valor2);
	  } 
	  
	  else if(valor3 > valor1 && valor3 > valor2 )
	  {
		 System.out.printf("O maior valor � : %d",valor3);
	  }
	
	
	  ler.close();
}	
	
}
