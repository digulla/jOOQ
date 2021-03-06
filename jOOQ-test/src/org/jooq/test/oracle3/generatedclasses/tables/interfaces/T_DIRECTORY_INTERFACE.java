/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_DIRECTORY", schema = "TEST")
public interface T_DIRECTORY_INTERFACE extends java.lang.Cloneable {

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setID(java.lang.Integer value);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getID();

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT PK_T_DIRECTORY_SELF
	 * FOREIGN KEY (PARENT_ID)
	 * REFERENCES TEST.T_DIRECTORY (ID)
	 * </pre></code>
	 */
	public void setPARENT_ID(java.lang.Integer value);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT PK_T_DIRECTORY_SELF
	 * FOREIGN KEY (PARENT_ID)
	 * REFERENCES TEST.T_DIRECTORY (ID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "PARENT_ID", precision = 7)
	public java.lang.Integer getPARENT_ID();

	/**
	 * An uncommented item
	 */
	public void setIS_DIRECTORY(java.lang.Integer value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "IS_DIRECTORY", precision = 7)
	public java.lang.Integer getIS_DIRECTORY();

	/**
	 * An uncommented item
	 */
	public void setname(java.lang.String value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "name", length = 50)
	public java.lang.String getname();
}
