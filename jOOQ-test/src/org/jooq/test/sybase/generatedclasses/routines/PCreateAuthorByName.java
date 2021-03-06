/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class PCreateAuthorByName extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -372932978;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> P_FIRST_NAME = createParameter("p_first_name", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> P_LAST_NAME = createParameter("p_last_name", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * Create a new routine call instance
	 */
	public PCreateAuthorByName() {
		super("p_create_author_by_name", org.jooq.test.sybase.generatedclasses.Dba.DBA);

		addInParameter(P_FIRST_NAME);
		addInParameter(P_LAST_NAME);
	}

	/**
	 * Set the <code>p_first_name</code> parameter to the routine
	 */
	public void setPFirstName(java.lang.String value) {
		setValue(P_FIRST_NAME, value);
	}

	/**
	 * Set the <code>p_last_name</code> parameter to the routine
	 */
	public void setPLastName(java.lang.String value) {
		setValue(P_LAST_NAME, value);
	}
}
