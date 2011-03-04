/**
 * This class is generated by jOOQ
 */
package org.jooq.util.db2.syscat.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.db2.DB2DataType;
import org.jooq.util.db2.syscat.Syscat;
import org.jooq.util.db2.syscat.tables.records.SequencesRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class Sequences extends TableImpl<SequencesRecord> {

	private static final long serialVersionUID = -34438240;

	/**
	 * The singleton instance of SEQUENCES
	 */
	public static final Sequences SEQUENCES = new Sequences();

	/**
	 * The class holding records for this type
	 */
	private static final Class<SequencesRecord> __RECORD_TYPE = SequencesRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<SequencesRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, String> SEQSCHEMA = new TableFieldImpl<SequencesRecord, String>(SQLDialect.DB2, "SEQSCHEMA", DB2DataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, String> SEQNAME = new TableFieldImpl<SequencesRecord, String>(SQLDialect.DB2, "SEQNAME", DB2DataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, String> DEFINER = new TableFieldImpl<SequencesRecord, String>(SQLDialect.DB2, "DEFINER", DB2DataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, String> DEFINERTYPE = new TableFieldImpl<SequencesRecord, String>(SQLDialect.DB2, "DEFINERTYPE", DB2DataType.CHARACTER, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, String> OWNER = new TableFieldImpl<SequencesRecord, String>(SQLDialect.DB2, "OWNER", DB2DataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, String> OWNERTYPE = new TableFieldImpl<SequencesRecord, String>(SQLDialect.DB2, "OWNERTYPE", DB2DataType.CHARACTER, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, Integer> SEQID = new TableFieldImpl<SequencesRecord, Integer>(SQLDialect.DB2, "SEQID", DB2DataType.INTEGER, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, String> SEQTYPE = new TableFieldImpl<SequencesRecord, String>(SQLDialect.DB2, "SEQTYPE", DB2DataType.CHARACTER, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, String> BASE_SEQSCHEMA = new TableFieldImpl<SequencesRecord, String>(SQLDialect.DB2, "BASE_SEQSCHEMA", DB2DataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, String> BASE_SEQNAME = new TableFieldImpl<SequencesRecord, String>(SQLDialect.DB2, "BASE_SEQNAME", DB2DataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, BigDecimal> INCREMENT = new TableFieldImpl<SequencesRecord, BigDecimal>(SQLDialect.DB2, "INCREMENT", DB2DataType.DECIMAL, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, BigDecimal> START = new TableFieldImpl<SequencesRecord, BigDecimal>(SQLDialect.DB2, "START", DB2DataType.DECIMAL, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, BigDecimal> MAXVALUE = new TableFieldImpl<SequencesRecord, BigDecimal>(SQLDialect.DB2, "MAXVALUE", DB2DataType.DECIMAL, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, BigDecimal> MINVALUE = new TableFieldImpl<SequencesRecord, BigDecimal>(SQLDialect.DB2, "MINVALUE", DB2DataType.DECIMAL, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, BigDecimal> NEXTCACHEFIRSTVALUE = new TableFieldImpl<SequencesRecord, BigDecimal>(SQLDialect.DB2, "NEXTCACHEFIRSTVALUE", DB2DataType.DECIMAL, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, String> CYCLE = new TableFieldImpl<SequencesRecord, String>(SQLDialect.DB2, "CYCLE", DB2DataType.CHARACTER, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, Integer> CACHE = new TableFieldImpl<SequencesRecord, Integer>(SQLDialect.DB2, "CACHE", DB2DataType.INTEGER, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, String> ORDER = new TableFieldImpl<SequencesRecord, String>(SQLDialect.DB2, "ORDER", DB2DataType.CHARACTER, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, Integer> DATATYPEID = new TableFieldImpl<SequencesRecord, Integer>(SQLDialect.DB2, "DATATYPEID", DB2DataType.INTEGER, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, Integer> SOURCETYPEID = new TableFieldImpl<SequencesRecord, Integer>(SQLDialect.DB2, "SOURCETYPEID", DB2DataType.INTEGER, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, Timestamp> CREATE_TIME = new TableFieldImpl<SequencesRecord, Timestamp>(SQLDialect.DB2, "CREATE_TIME", DB2DataType.TIMESTAMP, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, Timestamp> ALTER_TIME = new TableFieldImpl<SequencesRecord, Timestamp>(SQLDialect.DB2, "ALTER_TIME", DB2DataType.TIMESTAMP, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, Short> PRECISION = new TableFieldImpl<SequencesRecord, Short>(SQLDialect.DB2, "PRECISION", DB2DataType.SMALLINT, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, String> ORIGIN = new TableFieldImpl<SequencesRecord, String>(SQLDialect.DB2, "ORIGIN", DB2DataType.CHARACTER, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, String> REMARKS = new TableFieldImpl<SequencesRecord, String>(SQLDialect.DB2, "REMARKS", DB2DataType.VARCHAR, SEQUENCES);

	/**
	 * No further instances allowed
	 */
	private Sequences() {
		super(SQLDialect.DB2, "SEQUENCES", Syscat.SYSCAT);
	}
}