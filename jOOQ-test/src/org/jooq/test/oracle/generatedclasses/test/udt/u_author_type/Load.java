/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.udt.u_author_type;

/**
 * This class is generated by jOOQ.
 */
public class Load extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 126306547;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.test.udt.records.UAuthorTypeRecord> SELF = createParameter("SELF", org.jooq.test.oracle.generatedclasses.test.udt.UAuthorType.U_AUTHOR_TYPE.getDataType());

	/**
	 * Create a new routine call instance
	 */
	public Load() {
		super("LOAD", org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.test.oracle.generatedclasses.test.udt.UAuthorType.U_AUTHOR_TYPE);

		addInOutParameter(SELF);
	}

	/**
	 * Set the <code>SELF</code> parameter to the routine
	 */
	public void setSelf(org.jooq.test.oracle.generatedclasses.test.udt.records.UAuthorTypeRecord value) {
		setValue(SELF, value);
	}

	public org.jooq.test.oracle.generatedclasses.test.udt.records.UAuthorTypeRecord getSelf() {
		return getValue(SELF);
	}
}
