package it.prova.provafile.test;

import java.io.File;
import java.io.IOException;

import it.prova.provafile.model.InputFile;
import it.prova.provafile.model.OutputFile;

public class TestFile {

	public static void main(String[] args) {
		InputFile file = new InputFile();
		file.writeFile();
		

		OutputFile of = new OutputFile();
		of.readFile();
		
	}

}
