/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.3.0"},
                            comments = "This class is generated by jOOQ")
public class Schemata extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 1562782707;

	/**
	 * The singleton instance of information_schema.schemata
	 */
	public static final org.jooq.util.postgres.information_schema.tables.Schemata SCHEMATA = new org.jooq.util.postgres.information_schema.tables.Schemata();

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
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CATALOG_NAME = createField("catalog_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SCHEMA_NAME = createField("schema_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SCHEMA_OWNER = createField("schema_owner", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DEFAULT_CHARACTER_SET_CATALOG = createField("default_character_set_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DEFAULT_CHARACTER_SET_SCHEMA = createField("default_character_set_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DEFAULT_CHARACTER_SET_NAME = createField("default_character_set_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SQL_PATH = createField("sql_path", org.jooq.impl.SQLDataType.VARCHAR, this);

	public Schemata() {
		super("schemata", org.jooq.util.postgres.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	public Schemata(java.lang.String alias) {
		super(alias, org.jooq.util.postgres.information_schema.InformationSchema.INFORMATION_SCHEMA, org.jooq.util.postgres.information_schema.tables.Schemata.SCHEMATA);
	}

	@Override
	public org.jooq.util.postgres.information_schema.tables.Schemata as(java.lang.String alias) {
		return new org.jooq.util.postgres.information_schema.tables.Schemata(alias);
	}
}