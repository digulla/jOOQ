/**
 * This class is generated by jOOQ
 */
package org.jooq.util.derby.sys.tables;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.derby.DerbyDataType;
import org.jooq.util.derby.sys.Sys;
import org.jooq.util.derby.sys.tables.records.SysschemasRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class Sysschemas extends TableImpl<SysschemasRecord> {

	private static final long serialVersionUID = 1948582814;

	/**
	 * The singleton instance of SYSSCHEMAS
	 */
	public static final Sysschemas SYSSCHEMAS = new Sysschemas();

	/**
	 * The class holding records for this type
	 */
	private static final Class<SysschemasRecord> __RECORD_TYPE = SysschemasRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<SysschemasRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<SysschemasRecord, String> SCHEMAID = new TableFieldImpl<SysschemasRecord, String>(SQLDialect.DERBY, "SCHEMAID", DerbyDataType.CHAR, SYSSCHEMAS);

	/**
	 * An uncommented item
	 */
	public static final TableField<SysschemasRecord, String> SCHEMANAME = new TableFieldImpl<SysschemasRecord, String>(SQLDialect.DERBY, "SCHEMANAME", DerbyDataType.VARCHAR, SYSSCHEMAS);

	/**
	 * An uncommented item
	 */
	public static final TableField<SysschemasRecord, String> AUTHORIZATIONID = new TableFieldImpl<SysschemasRecord, String>(SQLDialect.DERBY, "AUTHORIZATIONID", DerbyDataType.VARCHAR, SYSSCHEMAS);

	/**
	 * No further instances allowed
	 */
	private Sysschemas() {
		super(SQLDialect.DERBY, "SYSSCHEMAS", Sys.SYS);
	}
}