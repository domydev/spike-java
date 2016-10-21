package ch.ne.ceg.infoplus.spike.java.core.utils;

import java.text.SimpleDateFormat;
import java.util.List;

import ch.ne.ceg.infoplus.spike.java.core.model.Student;

//Classe à importer afin d'utiliser les methodes utilitaires

public class StudentUtils {

	public final static SimpleDateFormat YEAR_FORMAT = new SimpleDateFormat("yyyy"); // formato della data in Anni



	/**
	 * Compute the grade of the student.
	 * 
	 * @param aYear
	 *            Year of the birthday of the student.
	 * @return The grade of the ScClass
	 * @throws Exception
	 *             Throw Exception if invalide year.
	 */
	public static int computeGrade(int aYear) throws Exception {  // calcolo del grado della classe 
		if (aYear < 1992)			// se e minore di 1992 tira fuori un eccezione
			throw new Exception();  
		if (aYear > 2000)			// se e minore di 2000 tira fuori un eccezione 
			throw new Exception(); 
		return 2001 - aYear;
	}
	
	/**
	 * Print the entire list to console.
	 * 
	 * @param aStudents
	 *            The list of students.
	 */
	public static void printSchool(List<Student> aStudents) {
		if (aStudents == null || aStudents.size() == 0) {   // se lo studente e vuoto mi dira che la scuola e vuona non ha studenti
			System.out.println("The school is empty");
		} else {

			
			// Presa dei valori di ogni studente 
			for (Student aStudent : aStudents) {
				System.out.println(aStudent.getFristname() + " "  // presa del Fristname dal modello ad oggetti
						+ aStudent.getLastname() + " "			// presa del Lastname dal modello ad ogetti
						+ YEAR_FORMAT.format(aStudent.getBirthday()) + " "  // presa del Birthday dal modello ad oggetti con formattazione della data
						+ aStudent.getScClass().getGrade());  // calcolo del Grade da ScClass modello ad oggetto 

			}

		}
	}
	
	

}
