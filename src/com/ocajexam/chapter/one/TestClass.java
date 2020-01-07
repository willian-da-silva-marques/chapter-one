package com.ocajexam.chapter.one;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


/**
 * 
 * @author willian.marques
 * EXERCÍCIO 1-1: 
 * Substituindo importações implícitas por importações explícitas
 */
public class TestClass {

	public static void main(String[] args) throws IOException {
		/* Assegura que o diretório seja criado */
		Files.createDirectories(Paths.get("logs"));

		/* Obtém a data a ser usada no nome do arquivo */
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMdd_hhmm");
		LocalDateTime now = LocalDateTime.now();
		String date = now.format(df);

		/* Define o nome do arquivo no diretório logs */
		String logFileName = "logs\\testlog-" + date + ".txt";

		/* Define Logger */
		FileHandler myFileHandler = new FileHandler(logFileName);
		myFileHandler.setFormatter(new SimpleFormatter());
		Logger ocajLogger = Logger.getLogger("OCAJ Logger");
		ocajLogger.setLevel(Level.ALL);
		ocajLogger.addHandler(myFileHandler);

		/* Mensagem de log */
		ocajLogger.info("\nThis is a logged information message.");

		/* Fecha o arquivo */
		myFileHandler.close();
	}
}