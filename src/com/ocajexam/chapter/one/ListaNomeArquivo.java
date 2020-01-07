package com.ocajexam.chapter.one;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ListaNomeArquivo {
	
	private static final Logger LOGGER = Logger.getLogger("com.acaj.example.chapter.one.ListaNomeArquivo");

	public static void main(String[] args) {	
		findNamesFiles().stream().forEach(System.out::println);
	}

	private static List<String> findNamesFiles() {
		List<String> namesFiles = new ArrayList<>();
		try {
			Files.walk(Paths.get("C:\\Users\\willian.marques\\Desktop")).forEach(file -> {
				if (file.getFileName().toString().endsWith(".txt")) {
					namesFiles.add(file.getFileName().toString());
				}
			});
		} catch (IOException ex) {
			LOGGER.severe(ex.getMessage());
		}
		return namesFiles;
	}
}
