/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class CityRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.CityRecord> {

	private static final long serialVersionUID = 969805918;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setCityId(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.City.CITY.CITY_ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Short getCityId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.City.CITY.CITY_ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.mysql.sakila.tables.records.AddressRecord> fetchAddressList() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS)
			.where(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.CITY_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.City.CITY.CITY_ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 */
	public void setCity(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.City.CITY.CITY_, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getCity() {
		return getValue(org.jooq.examples.mysql.sakila.tables.City.CITY.CITY_);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_city_country
	 * FOREIGN KEY (country_id)
	 * REFERENCES sakila.country (country_id)
	 * </pre></code>
	 */
	public void setCountryId(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.City.CITY.COUNTRY_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_city_country
	 * FOREIGN KEY (country_id)
	 * REFERENCES sakila.country (country_id)
	 * </pre></code>
	 */
	public java.lang.Short getCountryId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.City.CITY.COUNTRY_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_city_country
	 * FOREIGN KEY (country_id)
	 * REFERENCES sakila.country (country_id)
	 * </pre></code>
	 */
	public org.jooq.examples.mysql.sakila.tables.records.CountryRecord fetchCountry() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Country.COUNTRY)
			.where(org.jooq.examples.mysql.sakila.tables.Country.COUNTRY.COUNTRY_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.City.CITY.COUNTRY_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setLastUpdate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.mysql.sakila.tables.City.CITY.LAST_UPDATE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Timestamp getLastUpdate() {
		return getValue(org.jooq.examples.mysql.sakila.tables.City.CITY.LAST_UPDATE);
	}

	/**
	 * Create a detached CityRecord
	 */
	public CityRecord() {
		super(org.jooq.examples.mysql.sakila.tables.City.CITY);
	}
}
