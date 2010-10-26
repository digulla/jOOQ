/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.information_schema.tables;


import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.mysql.information_schema.InformationSchema;
import org.jooq.util.mysql.information_schema.tables.records.ColumnsRecord;


/**
 * This class is generated by jOOQ.
 */
public class Columns extends TableImpl<ColumnsRecord> {

	private static final long serialVersionUID = 1L;

	/**
	 * The singleton instance of COLUMNS
	 */
	public static final Columns COLUMNS = new Columns();

	/**
	 * The class holding records for this table
	 */
	private static final Class<ColumnsRecord> RECORD_TYPE = ColumnsRecord.class;

	/**
	 * The class holding records for this table
	 */
	@Override
	public Class<ColumnsRecord> getRecordType() {
		return RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> TABLE_CATALOG = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.MYSQL, "TABLE_CATALOG", String.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> TABLE_SCHEMA = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.MYSQL, "TABLE_SCHEMA", String.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> TABLE_NAME = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.MYSQL, "TABLE_NAME", String.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> COLUMN_NAME = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.MYSQL, "COLUMN_NAME", String.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Integer> ORDINAL_POSITION = new TableFieldImpl<ColumnsRecord, Integer>(SQLDialect.MYSQL, "ORDINAL_POSITION", Integer.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> COLUMN_DEFAULT = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.MYSQL, "COLUMN_DEFAULT", String.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> IS_NULLABLE = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.MYSQL, "IS_NULLABLE", String.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> DATA_TYPE = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.MYSQL, "DATA_TYPE", String.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Integer> CHARACTER_MAXIMUM_LENGTH = new TableFieldImpl<ColumnsRecord, Integer>(SQLDialect.MYSQL, "CHARACTER_MAXIMUM_LENGTH", Integer.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Integer> CHARACTER_OCTET_LENGTH = new TableFieldImpl<ColumnsRecord, Integer>(SQLDialect.MYSQL, "CHARACTER_OCTET_LENGTH", Integer.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Integer> NUMERIC_PRECISION = new TableFieldImpl<ColumnsRecord, Integer>(SQLDialect.MYSQL, "NUMERIC_PRECISION", Integer.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Integer> NUMERIC_SCALE = new TableFieldImpl<ColumnsRecord, Integer>(SQLDialect.MYSQL, "NUMERIC_SCALE", Integer.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> CHARACTER_SET_NAME = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.MYSQL, "CHARACTER_SET_NAME", String.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> COLLATION_NAME = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.MYSQL, "COLLATION_NAME", String.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> COLUMN_TYPE = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.MYSQL, "COLUMN_TYPE", String.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> COLUMN_KEY = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.MYSQL, "COLUMN_KEY", String.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> EXTRA = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.MYSQL, "EXTRA", String.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> PRIVILEGES = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.MYSQL, "PRIVILEGES", String.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> COLUMN_COMMENT = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.MYSQL, "COLUMN_COMMENT", String.class, COLUMNS);

	/**
	 * No further instances allowed
	 */
	private Columns() {
		super(SQLDialect.MYSQL, "COLUMNS", InformationSchema.INFORMATION_SCHEMA);
	}

}