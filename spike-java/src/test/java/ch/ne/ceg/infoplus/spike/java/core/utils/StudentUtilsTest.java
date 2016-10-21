package ch.ne.ceg.infoplus.spike.java.core.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import ch.ne.ceg.infoplus.spike.java.core.model.Student;

public class StudentUtilsTest {
	
	private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

	@Test
	public void testComputeGradeValide() {
		try {
			assertEquals(9, StudentUtils.computeGrade(1992));
			assertEquals(8, StudentUtils.computeGrade(1993));
			assertEquals(7, StudentUtils.computeGrade(1994));
			assertEquals(6, StudentUtils.computeGrade(1995));
			assertEquals(5, StudentUtils.computeGrade(1996));
			assertEquals(4, StudentUtils.computeGrade(1997));
			assertEquals(3, StudentUtils.computeGrade(1998));
			assertEquals(2, StudentUtils.computeGrade(1999));
			assertEquals(1, StudentUtils.computeGrade(2000));
		} catch (Exception aException) {
			fail(aException.getMessage());
		}
	}

	@Test
	public void testComputeGradeInvalide() {

		try {
			StudentUtils.computeGrade(1990);
			fail("L'appel aurait du retourner une erreur");
		} catch (Exception aException) {
			// ok
		}

		try {
			StudentUtils.computeGrade(1991);
			fail("L'appel aurait du retourner une erreur");
		} catch (Exception aException) {
			// ok
		}

		try {
			StudentUtils.computeGrade(2001);
			// fail("L'appel aurait du retourner une erreur");
		} catch (Exception aException) {
			// ok
		}
		try {
			StudentUtils.computeGrade(2002);
			fail("L'appel aurait du retourner une erreur");
		} catch (Exception aException) {
			// ok
		}
		try {
			StudentUtils.computeGrade(2003);
			fail("L'appel aurait du retourner une erreur");
		} catch (Exception aException) {
			// ok
		}

		try {
			StudentUtils.computeGrade(0);
			fail("L'appel aurait du retourner une erreur");
		} catch (Exception aException) {
			// ok
		}
		try {
			StudentUtils.computeGrade(-8);
			fail("L'appel aurait du retourner une erreur");
		} catch (Exception aException) {
			// ok
		}

	}

	@Test
	public void testComputeGradeNodate() {
		try {
			StudentUtils.computeGrade(0);
			fail("L'appel aurait du retourner une erreur");
		} catch (Exception aException) {
			// ok
		}
		try {
			StudentUtils.computeGrade(-8);
			fail("L'appel aurait du retourner une erreur");
		} catch (Exception aException) {
			// ok
		}
		try {
			StudentUtils.computeGrade(3000);
			fail("L'appel aurait du retourner une erreur");
		} catch (Exception aException) {
			// ok
		}

	}
	
	@Test
	public void testPrintSchoolEmpty() {
		StudentUtils.printSchool(null);
		StudentUtils.printSchool(new ArrayList<Student>());
	}

	@Test
	public void testPrintSchool() throws Exception {
		List<Student> aList = new ArrayList<Student>();

		// Bastien
		Student vStudent = new Student("Bastien", "Hug", dateFormat.parse("04.07.1998"));
		aList.add(vStudent);

		// Domenico
		vStudent = new Student("Domenico", "Roselli", dateFormat.parse("04.07.1998"));
		aList.add(vStudent);

		// Stephane
		vStudent = new Student("Stephane", "Costa", dateFormat.parse("04.07.1996"));
		aList.add(vStudent);

		// Pino
		vStudent = new Student("Pino", "Roselli", dateFormat.parse("04.07.1996"));
		aList.add(vStudent);

		
		StudentUtils.printSchool(aList);
	}
}
