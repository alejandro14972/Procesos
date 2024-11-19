package test_Project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class EjemploInputStream {

	public static void main(String[] args) throws IOException {
		
		
		Process procesohijo = new ProcessBuilder("recursos/Textos.exe").start();
		InputStreamReader IS = new InputStreamReader(procesohijo.getInputStream());
		BufferedReader myBR = new BufferedReader(IS);
			
		String line;
		
		System.out.println("salida proceso hijo: ");	
		
		while ((line = myBR.readLine())!=null) {
			System.out.println(line);
		}
	}
}
