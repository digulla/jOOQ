/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class PurchaseorderheaderRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseorderheaderRecord> {

	private static final long serialVersionUID = -1925233357;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setPurchaseorderid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderheader.PURCHASEORDERHEADER.PURCHASEORDERID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getPurchaseorderid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderheader.PURCHASEORDERHEADER.PURCHASEORDERID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseorderdetailRecord> fetchPurchaseorderdetailList() {
		return create()
			.selectFrom(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderdetail.PURCHASEORDERDETAIL)
			.where(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderdetail.PURCHASEORDERDETAIL.PURCHASEORDERID.equal(getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderheader.PURCHASEORDERHEADER.PURCHASEORDERID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 */
	public void setRevisionnumber(java.lang.Byte value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderheader.PURCHASEORDERHEADER.REVISIONNUMBER, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Byte getRevisionnumber() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderheader.PURCHASEORDERHEADER.REVISIONNUMBER);
	}

	/**
	 * An uncommented item
	 */
	public void setStatus(java.lang.Byte value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderheader.PURCHASEORDERHEADER.STATUS, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Byte getStatus() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderheader.PURCHASEORDERHEADER.STATUS);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Purchasing.PurchaseOrderHeader.EmployeeID]
	 * REFERENCES Employee [HumanResources.Employee.EmployeeID]
	 * </pre></code>
	 */
	public void setEmployeeid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderheader.PURCHASEORDERHEADER.EMPLOYEEID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Purchasing.PurchaseOrderHeader.EmployeeID]
	 * REFERENCES Employee [HumanResources.Employee.EmployeeID]
	 * </pre></code>
	 */
	public java.lang.Integer getEmployeeid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderheader.PURCHASEORDERHEADER.EMPLOYEEID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Purchasing.PurchaseOrderHeader.EmployeeID]
	 * REFERENCES Employee [HumanResources.Employee.EmployeeID]
	 * </pre></code>
	 */
	public org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeRecord fetchEmployee() {
		return create()
			.selectFrom(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.EMPLOYEE)
			.where(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.EMPLOYEE.EMPLOYEEID.equal(getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderheader.PURCHASEORDERHEADER.EMPLOYEEID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Purchasing.PurchaseOrderHeader.VendorID]
	 * REFERENCES Vendor [Purchasing.Vendor.VendorID]
	 * </pre></code>
	 */
	public void setVendorid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderheader.PURCHASEORDERHEADER.VENDORID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Purchasing.PurchaseOrderHeader.VendorID]
	 * REFERENCES Vendor [Purchasing.Vendor.VendorID]
	 * </pre></code>
	 */
	public java.lang.Integer getVendorid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderheader.PURCHASEORDERHEADER.VENDORID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Purchasing.PurchaseOrderHeader.VendorID]
	 * REFERENCES Vendor [Purchasing.Vendor.VendorID]
	 * </pre></code>
	 */
	public org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorRecord fetchVendor() {
		return create()
			.selectFrom(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Vendor.VENDOR)
			.where(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Vendor.VENDOR.VENDORID.equal(getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderheader.PURCHASEORDERHEADER.VENDORID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Purchasing.PurchaseOrderHeader.ShipMethodID]
	 * REFERENCES ShipMethod [Purchasing.ShipMethod.ShipMethodID]
	 * </pre></code>
	 */
	public void setShipmethodid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderheader.PURCHASEORDERHEADER.SHIPMETHODID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Purchasing.PurchaseOrderHeader.ShipMethodID]
	 * REFERENCES ShipMethod [Purchasing.ShipMethod.ShipMethodID]
	 * </pre></code>
	 */
	public java.lang.Integer getShipmethodid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderheader.PURCHASEORDERHEADER.SHIPMETHODID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Purchasing.PurchaseOrderHeader.ShipMethodID]
	 * REFERENCES ShipMethod [Purchasing.ShipMethod.ShipMethodID]
	 * </pre></code>
	 */
	public org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ShipmethodRecord fetchShipmethod() {
		return create()
			.selectFrom(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Shipmethod.SHIPMETHOD)
			.where(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Shipmethod.SHIPMETHOD.SHIPMETHODID.equal(getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderheader.PURCHASEORDERHEADER.SHIPMETHODID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setOrderdate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderheader.PURCHASEORDERHEADER.ORDERDATE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Timestamp getOrderdate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderheader.PURCHASEORDERHEADER.ORDERDATE);
	}

	/**
	 * An uncommented item
	 */
	public void setShipdate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderheader.PURCHASEORDERHEADER.SHIPDATE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Timestamp getShipdate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderheader.PURCHASEORDERHEADER.SHIPDATE);
	}

	/**
	 * An uncommented item
	 */
	public void setSubtotal(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderheader.PURCHASEORDERHEADER.SUBTOTAL, value);
	}

	/**
	 * An uncommented item
	 */
	public java.math.BigDecimal getSubtotal() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderheader.PURCHASEORDERHEADER.SUBTOTAL);
	}

	/**
	 * An uncommented item
	 */
	public void setTaxamt(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderheader.PURCHASEORDERHEADER.TAXAMT, value);
	}

	/**
	 * An uncommented item
	 */
	public java.math.BigDecimal getTaxamt() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderheader.PURCHASEORDERHEADER.TAXAMT);
	}

	/**
	 * An uncommented item
	 */
	public void setFreight(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderheader.PURCHASEORDERHEADER.FREIGHT, value);
	}

	/**
	 * An uncommented item
	 */
	public java.math.BigDecimal getFreight() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderheader.PURCHASEORDERHEADER.FREIGHT);
	}

	/**
	 * An uncommented item
	 */
	public void setTotaldue(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderheader.PURCHASEORDERHEADER.TOTALDUE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.math.BigDecimal getTotaldue() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderheader.PURCHASEORDERHEADER.TOTALDUE);
	}

	/**
	 * An uncommented item
	 */
	public void setModifieddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderheader.PURCHASEORDERHEADER.MODIFIEDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Timestamp getModifieddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderheader.PURCHASEORDERHEADER.MODIFIEDDATE);
	}

	/**
	 * Create a detached PurchaseorderheaderRecord
	 */
	public PurchaseorderheaderRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderheader.PURCHASEORDERHEADER);
	}
}