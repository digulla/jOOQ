/**
 * This class is generated by jOOQ
 */
package org.jooq.util.derby.sys.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.6"},
                            comments = "This class is generated by jOOQ")
public class Sysconstraints extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -1611327913;

	/**
	 * The singleton instance of SYS.SYSCONSTRAINTS
	 */
	public static final org.jooq.util.derby.sys.tables.Sysconstraints SYSCONSTRAINTS = new org.jooq.util.derby.sys.tables.Sysconstraints();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.Record> __RECORD_TYPE = org.jooq.Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINTID = createField("CONSTRAINTID", org.jooq.impl.SQLDataType.CHAR, SYSCONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLEID = createField("TABLEID", org.jooq.impl.SQLDataType.CHAR, SYSCONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINTNAME = createField("CONSTRAINTNAME", org.jooq.impl.SQLDataType.VARCHAR, SYSCONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPE = createField("TYPE", org.jooq.impl.SQLDataType.CHAR, SYSCONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SCHEMAID = createField("SCHEMAID", org.jooq.impl.SQLDataType.CHAR, SYSCONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> STATE = createField("STATE", org.jooq.impl.SQLDataType.CHAR, SYSCONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> REFERENCECOUNT = createField("REFERENCECOUNT", org.jooq.impl.SQLDataType.INTEGER, SYSCONSTRAINTS);

	/**
	 * No further instances allowed
	 */
	private Sysconstraints() {
		super("SYSCONSTRAINTS", org.jooq.util.derby.sys.Sys.SYS);
	}
}
