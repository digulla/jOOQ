/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.daos;

/**
 * This class is generated by jOOQ.
 */
public class TBooleansDao extends org.jooq.impl.DAOImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TBooleansRecord, org.jooq.test.oracle.generatedclasses.test.tables.pojos.TBooleans, java.lang.Integer> {

	/**
	 * Create a new TBooleansDao without any factory
	 */
	public TBooleansDao() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS, org.jooq.test.oracle.generatedclasses.test.tables.pojos.TBooleans.class);
	}

	/**
	 * Create a new TBooleansDao with an attached factory
	 */
	public TBooleansDao(org.jooq.impl.Factory factory) {
		super(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS, org.jooq.test.oracle.generatedclasses.test.tables.pojos.TBooleans.class, factory);
	}

	@Override
	protected java.lang.Integer getId(org.jooq.test.oracle.generatedclasses.test.tables.pojos.TBooleans object) {
		return object.getId();
	}
}
