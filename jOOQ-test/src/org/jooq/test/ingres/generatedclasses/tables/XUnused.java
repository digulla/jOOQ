/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ingres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
public class XUnused extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord> {

	private static final long serialVersionUID = -972226528;

	/**
	 * The singleton instance of test.x_unused
	 */
	public static final org.jooq.test.ingres.generatedclasses.tables.XUnused X_UNUSED = new org.jooq.test.ingres.generatedclasses.tables.XUnused();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord> getRecordType() {
		return org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord.class;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.math.BigInteger> BIG_INTEGER = createField("big_integer", org.jooq.impl.SQLDataType.DECIMAL_INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_x_unused_self
	 * FOREIGN KEY (id_ref, name_ref)
	 * REFERENCES test.x_unused (id, name)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> ID_REF = createField("id_ref", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> CLASS = createField("class", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> FIELDS = createField("fields", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> CONFIGURATION = createField("configuration", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> U_D_T = createField("u_d_t", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> META_DATA = createField("meta_data", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> TYPE0 = createField("type0", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> PRIMARY_KEY = createField("primary_key", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> PRIMARYKEY = createField("primarykey", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_x_unused_self
	 * FOREIGN KEY (id_ref, name_ref)
	 * REFERENCES test.x_unused (id, name)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.String> NAME_REF = createField("name_ref", org.jooq.impl.SQLDataType.VARCHAR, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.math.BigDecimal> FIELD_737 = createField("field 737", org.jooq.impl.SQLDataType.DECIMAL, X_UNUSED);

	/**
	 * No further instances allowed
	 */
	private XUnused() {
		super("x_unused", org.jooq.test.ingres.generatedclasses.Test.TEST);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord> getMainKey() {
		return org.jooq.test.ingres.generatedclasses.Keys.PK_X_UNUSED;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord>>asList(org.jooq.test.ingres.generatedclasses.Keys.PK_X_UNUSED, org.jooq.test.ingres.generatedclasses.Keys.UK_X_UNUSED_ID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, ?>>asList(org.jooq.test.ingres.generatedclasses.Keys.FK_X_UNUSED_SELF);
	}
}
