package ch.ne.ceg.infoplus.spike.java.core.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


import org.junit.Test;


import ch.ne.ceg.infoplus.spike.java.core.model.Student;


public class FileUtilsTest {

	private final static SimpleDateFormat DATEFORMAT = new SimpleDateFormat(
			"yyyy");  // Diciamo che DATEFORMAT sara la data solo in Anni 

	private final static SimpleDateFormat YEARFORMAT = new SimpleDateFormat(
			"dd.MM.yyyy"); // Diciamo che YEARFORMAT sara la data completa 



	@Test
	public void testNbStudent() { // controlla numero di studenti
		try {
			List<Student> vListstudent = FileUtils.read("//ListStudent.csv");

			assertEquals(3, vListstudent.size());   // controlliamo bene che gli studenti siano 3 con assertEquals
		} catch (Exception aException) {
			fail(aException.getMessage());
		}
	}

	@Test
	public void testCheckValueStudent() { // test per leggere un file

		try {
			List<Student> vListStudent = FileUtils.read("//ListStudent.csv");

			System.out.println(vListStudent);

			assertEquals("Roselli", vListStudent.get(0).getLastname());  //controlliamo nel file che leggi Roselli in vListStudent nel arry posizione numero 0 
			assertEquals("Domenico", vListStudent.get(0).getFristname()); //controlliamo nel file che leggi Domenico in vListStudent posizione numero 0 

			String vbday = DATEFORMAT.format(vListStudent.get(0).getBirthday()); //formatiamo la data in Anni per vListStudent posizione numero 0
			assertEquals("1998", vbday);  //controlliamo nel file che leggi  la data 1998 in  variabile vbday

			assertEquals("Roselli", vListStudent.get(1).getLastname());
			assertEquals("Pino", vListStudent.get(1).getFristname());

			vbday = DATEFORMAT.format(vListStudent.get(1).getBirthday());
			assertEquals("1998", vbday);

			assertEquals("Costa", vListStudent.get(2).getLastname());
			assertEquals("Stephane", vListStudent.get(2).getFristname());

			vbday = DATEFORMAT.format(vListStudent.get(2).getBirthday());
			assertEquals("1996", vbday);

		} catch (Exception aException) {
			fail(aException.getMessage());
		}
	}

	@Test
	public void testWrite()  {  // test per scrivere un file
		
		try {
			List<Student> vList = new ArrayList<Student>();  // cramo ogetto lista Student e lo mettiamo in un arry

			// Bastien
			Student vStudent = new Student("Bastien", "Hug",  // cramo il primo stuidente con i relativi valori  setLastname setFristname setBirthday
					YEARFORMAT.parse("04.07.1998"));  // Passiamo la data allo studente 
			vList.add(vStudent);  // aggiungiamo lo studente nella variabile vStudent e lo mettiamo in una lista

			// Domenico
			vStudent = new Student("Domenico", "Roselli",
					YEARFORMAT.parse("04.07.1998"));
			vList.add(vStudent);

			// Stephane
			vStudent = new Student("Stephane", "Costa",
					YEARFORMAT.parse("04.07.1996"));
			vList.add(vStudent);

			// Pino
			vStudent = new Student("Pino", "Roselli",
					YEARFORMAT.parse("04.07.1996"));
			vList.add(vStudent);
			
			FileUtils.write(vList);   // scriviamo intera lista in un file

		} catch (Exception aException) {
			fail(aException.getMessage());
		}

	}


}
