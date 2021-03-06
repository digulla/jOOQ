/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class XTestCase_71 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_71Record> {

	private static final long serialVersionUID = -1594324074;

	/**
	 * The singleton instance of x_test_case_71
	 */
	public static final org.jooq.test.sqlite.generatedclasses.tables.XTestCase_71 X_TEST_CASE_71 = new org.jooq.test.sqlite.generatedclasses.tables.XTestCase_71();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_71Record> getRecordType() {
		return org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_71Record.class;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_71Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_71);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_x_test_case_71_X_TEST_CASE_64_69_1
	 * FOREIGN KEY (TEST_CASE_64_69_ID)
	 * REFERENCES x_test_case_64_69 (ID)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_71Record, java.lang.Short> TEST_CASE_64_69_ID = createField("TEST_CASE_64_69_ID", org.jooq.impl.SQLDataType.SMALLINT, X_TEST_CASE_71);

	/**
	 * No further instances allowed
	 */
	private XTestCase_71() {
		super("x_test_case_71");
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_71Record> getMainKey() {
		return org.jooq.test.sqlite.generatedclasses.Keys.PK_X_TEST_CASE_71_ID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_71Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_71Record>>asList(org.jooq.test.sqlite.generatedclasses.Keys.PK_X_TEST_CASE_71_ID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_71Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_71Record, ?>>asList(org.jooq.test.sqlite.generatedclasses.Keys.FK_X_TEST_CASE_71_X_TEST_CASE_64_69_1);
	}
}
