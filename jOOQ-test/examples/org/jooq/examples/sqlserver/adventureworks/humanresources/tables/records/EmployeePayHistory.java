/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "EmployeePayHistory", schema = "HumanResources", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"EmployeeID", "RateChangeDate"})
})
public class EmployeePayHistory extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeePayHistory> {

	private static final long serialVersionUID = 1550485133;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_EmployeePayHistory_Employee_EmployeeID
	 * FOREIGN KEY (EmployeeID)
	 * REFERENCES HumanResources.Employee (EmployeeID)
	 * </pre></code>
	 */
	public void setEmployeeID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory.EmployeePayHistory.EmployeeID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_EmployeePayHistory_Employee_EmployeeID
	 * FOREIGN KEY (EmployeeID)
	 * REFERENCES HumanResources.Employee (EmployeeID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "EmployeeID", nullable = false, precision = 10)
	public java.lang.Integer getEmployeeID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory.EmployeePayHistory.EmployeeID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setRateChangeDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory.EmployeePayHistory.RateChangeDate, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Column(name = "RateChangeDate", nullable = false)
	public java.sql.Timestamp getRateChangeDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory.EmployeePayHistory.RateChangeDate);
	}

	/**
	 * An uncommented item
	 */
	public void setRate(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory.EmployeePayHistory.Rate, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Rate", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getRate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory.EmployeePayHistory.Rate);
	}

	/**
	 * An uncommented item
	 */
	public void setPayFrequency(java.lang.Byte value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory.EmployeePayHistory.PayFrequency, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "PayFrequency", nullable = false, precision = 3)
	public java.lang.Byte getPayFrequency() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory.EmployeePayHistory.PayFrequency);
	}

	/**
	 * An uncommented item
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory.EmployeePayHistory.ModifiedDate, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory.EmployeePayHistory.ModifiedDate);
	}

	/**
	 * Create a detached EmployeePayHistory
	 */
	public EmployeePayHistory() {
		super(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory.EmployeePayHistory);
	}
}
