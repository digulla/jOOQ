/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "Contact", schema = "Person")
public class ContactRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactRecord> {

	private static final long serialVersionUID = 1081748288;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setContactid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT.CONTACTID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ContactID", unique = true)
	public java.lang.Integer getContactid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT.CONTACTID);
	}

	/**
	 * An uncommented item
	 */
	public void setNamestyle(java.lang.Boolean value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT.NAMESTYLE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "NameStyle")
	public java.lang.Boolean getNamestyle() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT.NAMESTYLE);
	}

	/**
	 * An uncommented item
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT.TITLE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Title")
	public java.lang.String getTitle() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT.TITLE);
	}

	/**
	 * An uncommented item
	 */
	public void setFirstname(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT.FIRSTNAME, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "FirstName")
	public java.lang.String getFirstname() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT.FIRSTNAME);
	}

	/**
	 * An uncommented item
	 */
	public void setMiddlename(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT.MIDDLENAME, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "MiddleName")
	public java.lang.String getMiddlename() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT.MIDDLENAME);
	}

	/**
	 * An uncommented item
	 */
	public void setLastname(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT.LASTNAME, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "LastName")
	public java.lang.String getLastname() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT.LASTNAME);
	}

	/**
	 * An uncommented item
	 */
	public void setSuffix(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT.SUFFIX, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Suffix")
	public java.lang.String getSuffix() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT.SUFFIX);
	}

	/**
	 * An uncommented item
	 */
	public void setEmailaddress(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT.EMAILADDRESS, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "EmailAddress")
	public java.lang.String getEmailaddress() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT.EMAILADDRESS);
	}

	/**
	 * An uncommented item
	 */
	public void setEmailpromotion(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT.EMAILPROMOTION, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "EmailPromotion")
	public java.lang.Integer getEmailpromotion() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT.EMAILPROMOTION);
	}

	/**
	 * An uncommented item
	 */
	public void setPhone(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT.PHONE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Phone")
	public java.lang.String getPhone() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT.PHONE);
	}

	/**
	 * An uncommented item
	 */
	public void setPasswordhash(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT.PASSWORDHASH, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "PasswordHash")
	public java.lang.String getPasswordhash() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT.PASSWORDHASH);
	}

	/**
	 * An uncommented item
	 */
	public void setPasswordsalt(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT.PASSWORDSALT, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "PasswordSalt")
	public java.lang.String getPasswordsalt() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT.PASSWORDSALT);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (xml, ) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public void setAdditionalcontactinfo(java.lang.Object value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT.ADDITIONALCONTACTINFO, value);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (xml, ) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	@javax.persistence.Column(name = "AdditionalContactInfo")
	public java.lang.Object getAdditionalcontactinfo() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT.ADDITIONALCONTACTINFO);
	}

	/**
	 * An uncommented item
	 */
	public void setRowguid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT.ROWGUID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "rowguid")
	public java.lang.String getRowguid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT.ROWGUID);
	}

	/**
	 * An uncommented item
	 */
	public void setModifieddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT.MODIFIEDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT.MODIFIEDDATE);
	}

	/**
	 * Create a detached ContactRecord
	 */
	public ContactRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT);
	}
}