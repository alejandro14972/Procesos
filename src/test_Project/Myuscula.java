package test_Project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Myuscula {

	public static void main(String[] args) throws IOException {
		
		
		Process procesohijo = new ProcessBuilder("recursos/MAYUSCULO.exe").start();
		BufferedReader myBr = new BufferedReader(new InputStreamReader(procesohijo.getInputStream()));
		PrintStream myPs = new PrintStream(procesohijo.getOutputStream());

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe palabras");
		String palabra = sc.nextLine();
		
		myPs.println(palabra);
		myPs.flush();
		System.out.println(myBr.readLine());
		
	}

}
