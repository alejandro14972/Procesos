package test_Project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Saludo {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Process procesohijo = new ProcessBuilder("recursos/MAYUSCULO.exe").start();
		BufferedReader myBr = new BufferedReader(new InputStreamReader(procesohijo.getInputStream()));
		PrintStream myPs = new PrintStream(procesohijo.getOutputStream());
		
		
		System.out.println("Escribe nombre");
		String palabra = sc.nextLine();
		
		
		System.out.println("Escribe edad");
		int edad = sc.nextInt();
		
		
		System.out.println("Escribe altura");
		double altura = sc.nextDouble();
		
	
		System.out.println("Escribe genero");
		String genero = sc.next();

	}

}
