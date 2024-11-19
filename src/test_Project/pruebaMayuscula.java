package test_Project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class pruebaMayuscula {

	public static void main(String[] args) throws IOException {

		Process procesoHijo = new ProcessBuilder("recursos/MAYUSCULO.exe").start();
		InputStreamReader IS = new InputStreamReader(procesoHijo.getInputStream());
		BufferedReader br = new BufferedReader(IS);
		PrintStream ps = new PrintStream(procesoHijo.getOutputStream());

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el texto para convertir en mayúsculas");
		String texto = sc.nextLine();

		ps.println(texto);
		ps.flush();

		// Leemos lo que nos mande la clase hijo

		String linea;

		System.out.println("Salida del proceso hijo");

		while ((linea = br.readLine()) != null) {
			System.out.println(linea);
		}

		sc.close();
		ps.close();
		br.close();
	}

}