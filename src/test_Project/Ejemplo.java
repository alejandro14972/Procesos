package test_Project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Ejemplo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Process procesoHijo = new ProcessBuilder("recursos\\dadosRandom.exe").start();
		BufferedReader mybr = new BufferedReader(new InputStreamReader(procesoHijo.getInputStream()));
		
		PrintStream myps = new PrintStream(procesoHijo.getOutputStream());
		Scanner reader = new Scanner(System.in);
		int numero=0;
		numero = reader.nextInt();
		
		myps.println(numero);
		myps.flush();
		
		String line;
		System.out.println("Salida del proceso: ");
		while ((line = mybr.readLine()) != null) {
			System.out.println(line);
		}
		
	}

}
