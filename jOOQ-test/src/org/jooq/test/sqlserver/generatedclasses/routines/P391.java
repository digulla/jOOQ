/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class P391 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1681766898;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> I1 = createParameter("i1", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> IO1 = createParameter("io1", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> O1 = createParameter("o1", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> O2 = createParameter("o2", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> IO2 = createParameter("io2", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> I2 = createParameter("i2", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public P391() {
		super("p391", org.jooq.test.sqlserver.generatedclasses.Dbo.DBO);

		addInParameter(I1);
		addInOutParameter(IO1);
		addInOutParameter(O1);
		addInOutParameter(O2);
		addInOutParameter(IO2);
		addInParameter(I2);
	}

	/**
	 * Set the <code>i1</code> parameter to the routine
	 */
	public void setI1(java.lang.Integer value) {
		setValue(I1, value);
	}

	/**
	 * Set the <code>io1</code> parameter to the routine
	 */
	public void setIo1(java.lang.Integer value) {
		setValue(IO1, value);
	}

	/**
	 * Set the <code>o1</code> parameter to the routine
	 */
	public void setO1(java.lang.Integer value) {
		setValue(O1, value);
	}

	/**
	 * Set the <code>o2</code> parameter to the routine
	 */
	public void setO2(java.lang.Integer value) {
		setValue(O2, value);
	}

	/**
	 * Set the <code>io2</code> parameter to the routine
	 */
	public void setIo2(java.lang.Integer value) {
		setValue(IO2, value);
	}

	/**
	 * Set the <code>i2</code> parameter to the routine
	 */
	public void setI2(java.lang.Integer value) {
		setValue(I2, value);
	}

	public java.lang.Integer getIo1() {
		return getValue(IO1);
	}

	public java.lang.Integer getO1() {
		return getValue(O1);
	}

	public java.lang.Integer getO2() {
		return getValue(O2);
	}

	public java.lang.Integer getIo2() {
		return getValue(IO2);
	}
}
