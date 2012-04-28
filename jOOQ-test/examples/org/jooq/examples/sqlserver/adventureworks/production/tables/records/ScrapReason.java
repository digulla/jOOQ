/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "ScrapReason", schema = "Production")
public class ScrapReason extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ScrapReason> {

	private static final long serialVersionUID = 326815798;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setScrapReasonID(java.lang.Short value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ScrapReason.ScrapReason.ScrapReasonID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ScrapReasonID", unique = true, nullable = false, precision = 5)
	public java.lang.Short getScrapReasonID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ScrapReason.ScrapReason.ScrapReasonID);
	}

	/**
	 * An uncommented item
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ScrapReason.ScrapReason.Name, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Name", nullable = false, length = 50)
	public java.lang.String getName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ScrapReason.ScrapReason.Name);
	}

	/**
	 * An uncommented item
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ScrapReason.ScrapReason.ModifiedDate, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ScrapReason.ScrapReason.ModifiedDate);
	}

	/**
	 * Create a detached ScrapReason
	 */
	public ScrapReason() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.ScrapReason.ScrapReason);
	}
}