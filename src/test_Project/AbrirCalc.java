package test_Project;

import java.io.IOException;

public class AbrirCalc {

	public static void main(String[] args) {
		
		ProcessBuilder pb = new ProcessBuilder("../recursos/datosRandom.exe");
		try {
			pb.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
