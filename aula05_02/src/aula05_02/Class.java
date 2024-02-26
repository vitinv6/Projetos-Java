package aula05_02;

import java.util.Scanner;

public class Class {

	public static void main(String[] args) {
		System.out.println("Olá, qual é o seu nome?");
		
		Scanner objeto = new Scanner(System.in);
		String nome = objeto.nextLine();
		System.out.printf("Meu nome é %s \n",nome);

	}

}
