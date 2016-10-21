package ch.ne.ceg.infoplus.spike.java.core.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
//Packages à importer afin d'utiliser les objets
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import ch.ne.ceg.infoplus.spike.java.core.model.Student;

public class FileUtils {
	
	private final static SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

	private static final boolean[] String = null;

		
	// Lettura del File in Formato Csv - Programmazione ad ogetto riferimento al modello Student
	
	public static List<Student> read(String aFilePath) throws ParseException, Exception { // Lista Studenti con ritorno eccezione ed vList 
																						  // che corisponde alla lista studenti
		String currentDirectory;
		File file = new File(".");
		currentDirectory = file.getAbsolutePath();  // prendo la cartella di lavoro corrente 
		List<Student> vList = new ArrayList<Student>(); // creo una lista studente mettendo in una arrylist
		

		System.out.println("Current working directory : " + currentDirectory); // stampo la cartella di lavoro 
		BufferedReader br = new BufferedReader(new FileReader(currentDirectory+aFilePath));
	//	java.lang.String vStudent = null;
		Student vStudent; // dichiaro la variabile vStudent 
		String ligne;  // dichiaro la linea e una stringa 
		
		while ((ligne = br.readLine()) != null) {
			// Retourner la ligne dans un tableau
			
			String[] data = ligne.split(";");
			
			vStudent = new Student(data[0], data[1], dateFormat.parse(data[2])); // creo lo studente recuperando da data che e una tabella
			vList.add(vStudent); // aggiungo lo studente nella lista
			
		}
		br.close();
		

	      
		//System.out.println(vList + " ");
		return vList; // Ritorno la lista degli studenti
	}
	public static void write(List<Student> aList)  {

		String vFileContent = "";
		for(Student vStudent : aList){  // Creao Ogni Sudente e creo una nuona linea a ogni nuovo studente 
			
			// un metodo per concatenare vStudent tutto su una stessa linea
			//vLine = vStudent.getFristname()+";"+vStudent.getFristname()+";"+vStudent.getFristname();
			
			// Secondo Metodo per Concatenare e renderlo piu leggibile 
			vFileContent += vStudent.getFristname()+";";
			vFileContent += vStudent.getLastname()+";";
			vFileContent += dateFormat.format(vStudent.getBirthday())+";";
			
			vFileContent +="\n";
		}
		
		System.out.println(vFileContent);  // Riporto Virtualmente la scrittura del file completo dalla memoria 
		
	}
	

}
