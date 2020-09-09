package AulasJava;
/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
·                     10-14 infantil
·                     15-17 juvenil
·                     18-25 adulto*/

 import java.util.*;

public class Exercicio3 {

	public static void main (String args[]) {
		

	    Scanner ler = new Scanner (System.in);
		
		int idade;

		 System.out.println("Digite sua idade: ");
         idade = ler.nextInt();

         
        if(idade <= 14)
        {
        	System.out.printf("Infantil");
        }
        else if(idade >= 15 && idade <= 17)
        {
        	System.out.printf("Juvenil");
        }
        else if(idade >= 18 && idade <= 25)
        {
        	System.out.printf("Adulto");
        }
        else 
        {
        	System.out.printf("Insira uma idade válida!! ");
        }
		
        ler.close();
		
	}
}
