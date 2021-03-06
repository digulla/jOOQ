/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.cubrid.demodb.tables;

/**
 * This class is generated by jOOQ.
 */
public class Code extends org.jooq.impl.TableImpl<org.jooq.examples.cubrid.demodb.tables.records.CodeRecord> {

	private static final long serialVersionUID = 662791648;

	/**
	 * The singleton instance of PUBLIC.code
	 */
	public static final org.jooq.examples.cubrid.demodb.tables.Code CODE = new org.jooq.examples.cubrid.demodb.tables.Code();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.cubrid.demodb.tables.records.CodeRecord> __RECORD_TYPE = org.jooq.examples.cubrid.demodb.tables.records.CodeRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.cubrid.demodb.tables.records.CodeRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.cubrid.demodb.tables.records.CodeRecord, java.lang.String> S_NAME = createField("s_name", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.cubrid.demodb.tables.records.CodeRecord, java.lang.String> F_NAME = createField("f_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	public Code() {
		super("code", org.jooq.examples.cubrid.demodb.Public.PUBLIC);
	}

	public Code(java.lang.String alias) {
		super(alias, org.jooq.examples.cubrid.demodb.Public.PUBLIC, org.jooq.examples.cubrid.demodb.tables.Code.CODE);
	}

	@Override
	public org.jooq.examples.cubrid.demodb.tables.Code as(java.lang.String alias) {
		return new org.jooq.examples.cubrid.demodb.tables.Code(alias);
	}
}
