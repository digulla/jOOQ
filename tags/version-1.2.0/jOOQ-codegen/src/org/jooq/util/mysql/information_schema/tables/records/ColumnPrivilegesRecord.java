/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.information_schema.tables.records;

import org.jooq.Result;
import org.jooq.impl.RecordImpl;
import org.jooq.util.mysql.information_schema.tables.ColumnPrivileges;


/**
 * This class is generated by jOOQ.
 */
public class ColumnPrivilegesRecord extends RecordImpl {

	private static final long serialVersionUID = 1L;

	/**
	 * An uncommented item
	 */
	public void setGrantee(String value) {
		setValue(ColumnPrivileges.GRANTEE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getGrantee() {
		return getValue(ColumnPrivileges.GRANTEE);
	}

	/**
	 * An uncommented item
	 */
	public void setTableCatalog(String value) {
		setValue(ColumnPrivileges.TABLE_CATALOG, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTableCatalog() {
		return getValue(ColumnPrivileges.TABLE_CATALOG);
	}

	/**
	 * An uncommented item
	 */
	public void setTableSchema(String value) {
		setValue(ColumnPrivileges.TABLE_SCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTableSchema() {
		return getValue(ColumnPrivileges.TABLE_SCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setTableName(String value) {
		setValue(ColumnPrivileges.TABLE_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTableName() {
		return getValue(ColumnPrivileges.TABLE_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setColumnName(String value) {
		setValue(ColumnPrivileges.COLUMN_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getColumnName() {
		return getValue(ColumnPrivileges.COLUMN_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setPrivilegeType(String value) {
		setValue(ColumnPrivileges.PRIVILEGE_TYPE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getPrivilegeType() {
		return getValue(ColumnPrivileges.PRIVILEGE_TYPE);
	}

	/**
	 * An uncommented item
	 */
	public void setIsGrantable(String value) {
		setValue(ColumnPrivileges.IS_GRANTABLE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getIsGrantable() {
		return getValue(ColumnPrivileges.IS_GRANTABLE);
	}

	public ColumnPrivilegesRecord(Result result) {
		super(result);
	}
}