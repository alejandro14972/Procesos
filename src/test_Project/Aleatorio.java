package test_Project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Aleatorio {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			String texto = "";
			
			do {
				Process ph = new ProcessBuilder("recursos/AleatorioRandom.exe").start();
				BufferedReader myBr = new BufferedReader(new InputStreamReader(ph.getInputStream()));
				System.out.println("Si quiere terminar escriba fin");
				texto = sc.nextLine();
				
				String linea;
				while ((linea = myBr.readLine()) != null) {
					System.out.println(linea);
				}
				
			} while (!texto.equals("fin"));
			
			System.out.println("se termino");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
