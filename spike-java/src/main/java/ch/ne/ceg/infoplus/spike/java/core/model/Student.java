package ch.ne.ceg.infoplus.spike.java.core.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import ch.ne.ceg.infoplus.spike.java.core.utils.StudentUtils;

/**
 * Classe used to manage students.
 * 
 * @author droselli
 * @version 1.0
 * 
 */
public class Student {

	/**
	 * The firstname of the student.
	 */
	private String fristname;

	/**
	 * The lasname of the student.
	 */
	private String lastname;

	/**
	 * The birthday of the student.
	 */
	private Date birthday;

	/**
	 * The Sclass of student
	 */
	private ScClass scClass;

	/**
	 * Constructor.
	 */
	public Student() {
		super();
	}

	/**
	 * Constructor.
	 * 
	 * @param aFristname
	 *            Le prénom
	 * @param aLastname
	 *            Le nom de famille
	 * @param aBirthday
	 *            La date de naissance
	 * @throws Exception 
	 */
	public Student(String aFristname, String aLastname, Date aBirthday) throws Exception {
		super();
		fristname = aFristname;
		lastname = aLastname;
		birthday = aBirthday;
		
		
		String vYear = StudentUtils.YEAR_FORMAT.format(getBirthday());
		int vYearIntegeter = new Integer(vYear);

		ScClass vclass = new ScClass();
		vclass.setGrade(StudentUtils.computeGrade(vYearIntegeter));
		setScClass(vclass);
	}

	/**
	 * @return the fristname
	 */
	public String getFristname() {
		return fristname;
	}

	/**
	 * @param aFristname
	 *            the fristname to set
	 */
	public void setFristname(String aFristname) {
		fristname = aFristname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param aLastname
	 *            the lastname to set
	 */
	public void setLastname(String aLastname) {
		lastname = aLastname;
	}

	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * @param aBirthday
	 *            the birthday to set
	 */
	public void setBirthday(Date aBirthday) {
		birthday = aBirthday;
	}

	/**
	 * @return the scClass
	 */
	public ScClass getScClass() {
		return scClass;
	}

	/**
	 * @param aScClass
	 *            the scClass to set
	 */
	public void setScClass(ScClass aScClass) {
		scClass = aScClass;
	}
	
	
}
