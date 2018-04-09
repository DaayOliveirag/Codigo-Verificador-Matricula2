package Programa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import Projeto.CalculoeVerifica;

public class Programa {
	public static void main(String[] args) throws IOException {
		try {

			File verificadas = new File("src/Arquivos/matriculasVerificadas.txt");
			File com = new File("src/Arquivos/matriculasComDV.txt");
			verificadas.createNewFile();
			com.createNewFile();

			BufferedReader ler = new BufferedReader(new FileReader("src/Arquivos/matriculasParaVerificar.txt"));
			String linha;
			BufferedWriter esc = new BufferedWriter(new FileWriter(verificadas));
			while ((linha = ler.readLine()) != null) {

				if (CalculoeVerifica.verifica(linha)) {
					esc.write(linha + " verdadeiro\n");
				} else {
					esc.write(linha + " falso\n");
				}

			}
			esc.close();
			ler.close();

			BufferedReader lercodigo = new BufferedReader(new FileReader("src/Arquivos/matriculasSemDV.txt"));
			BufferedWriter esccodigo = new BufferedWriter(new FileWriter(com));
			while ((linha = lercodigo.readLine()) != null) {
				linha = CalculoeVerifica.CalcularD(linha);
				esccodigo.write(linha + "\n");

			}

			lercodigo.close();
			esccodigo.close();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
