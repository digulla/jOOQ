/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.daos;

/**
 * This class is generated by jOOQ.
 */
public class TArraysDao extends org.jooq.impl.DAOImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TArraysRecord, org.jooq.test.oracle.generatedclasses.test.tables.pojos.TArrays, java.lang.Integer> {

	/**
	 * Create a new TArraysDao without any factory
	 */
	public TArraysDao() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS, org.jooq.test.oracle.generatedclasses.test.tables.pojos.TArrays.class);
	}

	/**
	 * Create a new TArraysDao with an attached factory
	 */
	public TArraysDao(org.jooq.impl.Factory factory) {
		super(org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS, org.jooq.test.oracle.generatedclasses.test.tables.pojos.TArrays.class, factory);
	}

	@Override
	protected java.lang.Integer getId(org.jooq.test.oracle.generatedclasses.test.tables.pojos.TArrays object) {
		return object.getId();
	}
}
