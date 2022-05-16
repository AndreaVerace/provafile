package it.prova.provafile.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class InputFile {

	public void writeFile() {
		String pathScrittura = "C:\\prova_file\\provafile2.txt";
		try {
			File file = new File(pathScrittura);
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Questo è il nostro primo file");
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
