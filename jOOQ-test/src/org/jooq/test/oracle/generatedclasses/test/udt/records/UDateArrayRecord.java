/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.udt.records;

/**
 * This class is generated by jOOQ.
 */
public class UDateArrayRecord extends org.jooq.impl.ArrayRecordImpl<java.sql.Date> {

	private static final long serialVersionUID = 1034385286;

	public UDateArrayRecord(org.jooq.Configuration configuration) {
		super(org.jooq.test.oracle.generatedclasses.test.Test.TEST, "U_DATE_ARRAY", org.jooq.impl.SQLDataType.DATE, configuration);
	}

	public UDateArrayRecord(org.jooq.Configuration configuration, java.sql.Date... array) {
		this(configuration);
		set(array);
	}

	public UDateArrayRecord(org.jooq.Configuration configuration, java.util.List<? extends java.sql.Date> list) {
		this(configuration);
		setList(list);
	}
}
