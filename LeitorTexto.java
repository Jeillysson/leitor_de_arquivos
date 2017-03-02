package br.com.ufal.falibras.leitor;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class LeitorTexto {
	
	
	public static void main(String args[]) throws FileNotFoundException{
		
		// Escolher o arquivo
		JFileChooser fc = new JFileChooser();
    	fc.showOpenDialog(null);
    	String local=fc.getSelectedFile().getAbsolutePath();
		
		// Ler o arquivo
		Scanner entrada = new Scanner(new File(local));
		while (entrada.hasNextLine()){
			String linha = entrada.nextLine();
			System.out.println(linha);
		}
	}
}
