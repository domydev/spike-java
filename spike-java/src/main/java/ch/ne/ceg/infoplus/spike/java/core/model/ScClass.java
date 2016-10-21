package ch.ne.ceg.infoplus.spike.java.core.model;

/**
 * 
 * @author droselli
 * @version 1.0
 * 
 */

public class ScClass {

	/**
	 * The grade of student class
	 */
	private int grade;

	/**
	 * The name of student
	 */
	private String name;

	/**
	 * Constructor.
	 */
	public ScClass() {
		super();
	}

	/**
	 * Constructor.
	 * 
	 * @param aGrade
	 * @param aName
	 */
	public ScClass(int aGrade, String aName) {
		super();
		grade = aGrade;
		name = aName;
	}

	/**
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * @param aGrade
	 *            the grade to set
	 */
	public void setGrade(int aGrade) {
		grade = aGrade;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param aName
	 *            the name to set
	 */
	public void setName(String aName) {
		name = aName;
	}
	
	


}
