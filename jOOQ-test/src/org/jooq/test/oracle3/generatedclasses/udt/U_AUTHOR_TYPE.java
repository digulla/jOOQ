/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt;

/**
 * This class is generated by jOOQ.
 */
public class U_AUTHOR_TYPE extends org.jooq.impl.UDTImpl<org.jooq.test.oracle3.generatedclasses.udt.records.U_AUTHOR_TYPE> implements java.lang.Cloneable, org.jooq.Package {

	private static final long serialVersionUID = 1184813142;

	/**
	 * The singleton instance of TEST.U_AUTHOR_TYPE
	 */
	public static final org.jooq.test.oracle3.generatedclasses.udt.U_AUTHOR_TYPE U_AUTHOR_TYPE = new org.jooq.test.oracle3.generatedclasses.udt.U_AUTHOR_TYPE();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle3.generatedclasses.udt.records.U_AUTHOR_TYPE> getRecordType() {
		return org.jooq.test.oracle3.generatedclasses.udt.records.U_AUTHOR_TYPE.class;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_AUTHOR_TYPE, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, U_AUTHOR_TYPE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_AUTHOR_TYPE, java.lang.String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR, U_AUTHOR_TYPE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_AUTHOR_TYPE, java.lang.String> LAST_NAME = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR, U_AUTHOR_TYPE);

	/**
	 * Call TEST.U_AUTHOR_TYPE.COUNT_BOOKS
	 *
	 * @param SELF
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.math.BigDecimal call_COUNT_BOOKS(org.jooq.Configuration configuration, org.jooq.test.oracle3.generatedclasses.udt.records.U_AUTHOR_TYPE SELF) {
		org.jooq.test.oracle3.generatedclasses.udt.u_author_type.COUNT_BOOKS f = new org.jooq.test.oracle3.generatedclasses.udt.u_author_type.COUNT_BOOKS();
		f.setSELF(SELF);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get TEST.U_AUTHOR_TYPE.COUNT_BOOKS as a field
	 *
	 * @param SELF
	 */
	public static org.jooq.Field<java.math.BigDecimal> call_COUNT_BOOKS(org.jooq.test.oracle3.generatedclasses.udt.records.U_AUTHOR_TYPE SELF) {
		org.jooq.test.oracle3.generatedclasses.udt.u_author_type.COUNT_BOOKS f = new org.jooq.test.oracle3.generatedclasses.udt.u_author_type.COUNT_BOOKS();
		f.setSELF(SELF);

		return f.asField();
	}

	/**
	 * Get TEST.U_AUTHOR_TYPE.COUNT_BOOKS as a field
	 *
	 * @param SELF
	 */
	public static org.jooq.Field<java.math.BigDecimal> call_COUNT_BOOKS(org.jooq.Field<org.jooq.test.oracle3.generatedclasses.udt.records.U_AUTHOR_TYPE> SELF) {
		org.jooq.test.oracle3.generatedclasses.udt.u_author_type.COUNT_BOOKS f = new org.jooq.test.oracle3.generatedclasses.udt.u_author_type.COUNT_BOOKS();
		f.setSELF(SELF);

		return f.asField();
	}

	/**
	 * Call TEST.U_AUTHOR_TYPE.GET_BOOKS
	 *
	 * @param SELF IN OUT parameter
	 * @param BOOK1 OUT parameter
	 * @param BOOK2 OUT parameter
	 * @param BOOKS OUT parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static org.jooq.test.oracle3.generatedclasses.udt.u_author_type.GET_BOOKS call_GET_BOOKS(org.jooq.Configuration configuration, org.jooq.test.oracle3.generatedclasses.udt.records.U_AUTHOR_TYPE SELF) {
		org.jooq.test.oracle3.generatedclasses.udt.u_author_type.GET_BOOKS p = new org.jooq.test.oracle3.generatedclasses.udt.u_author_type.GET_BOOKS();
		p.setSELF(SELF);

		p.execute(configuration);
		return p;
	}

	/**
	 * Call TEST.U_AUTHOR_TYPE.LOAD
	 *
	 * @param SELF IN OUT parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static org.jooq.test.oracle3.generatedclasses.udt.records.U_AUTHOR_TYPE call_LOAD(org.jooq.Configuration configuration, org.jooq.test.oracle3.generatedclasses.udt.records.U_AUTHOR_TYPE SELF) {
		org.jooq.test.oracle3.generatedclasses.udt.u_author_type.LOAD p = new org.jooq.test.oracle3.generatedclasses.udt.u_author_type.LOAD();
		p.setSELF(SELF);

		p.execute(configuration);
		return p.getSELF();
	}

	/**
	 * No further instances allowed
	 */
	private U_AUTHOR_TYPE() {
		super("U_AUTHOR_TYPE", org.jooq.test.oracle3.generatedclasses.TEST.TEST);

		// Initialise data type
		getDataType();
	}
}
