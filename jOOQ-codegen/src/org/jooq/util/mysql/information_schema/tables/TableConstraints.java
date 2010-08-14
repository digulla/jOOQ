/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.information_schema.tables;

import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.mysql.information_schema.InformationSchema;


/**
 * This class is generated by jOOQ.
 */
public class TableConstraints extends TableImpl {

	private static final long serialVersionUID = 3496419122513268683L;

	/**
	 * The singleton instance of TABLE_CONSTRAINTS
	 */
	public static final TableConstraints TABLE_CONSTRAINTS = new TableConstraints();

	/**
	 * An uncommented item
	 */
	public static final TableField<String> CONSTRAINT_CATALOG = new TableFieldImpl<String>("CONSTRAINT_CATALOG", String.class, TABLE_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> CONSTRAINT_SCHEMA = new TableFieldImpl<String>("CONSTRAINT_SCHEMA", String.class, TABLE_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> CONSTRAINT_NAME = new TableFieldImpl<String>("CONSTRAINT_NAME", String.class, TABLE_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> TABLE_SCHEMA = new TableFieldImpl<String>("TABLE_SCHEMA", String.class, TABLE_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> TABLE_NAME = new TableFieldImpl<String>("TABLE_NAME", String.class, TABLE_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> CONSTRAINT_TYPE = new TableFieldImpl<String>("CONSTRAINT_TYPE", String.class, TABLE_CONSTRAINTS);

	/**
	 * No further instances allowed
	 */
	private TableConstraints() {
		super("TABLE_CONSTRAINTS", InformationSchema.INFORMATION_SCHEMA);
	}
}