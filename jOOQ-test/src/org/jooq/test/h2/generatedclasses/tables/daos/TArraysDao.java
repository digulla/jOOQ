/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.daos;

/**
 * This class is generated by jOOQ.
 */
public class TArraysDao extends org.jooq.impl.DAOImpl<org.jooq.test.h2.generatedclasses.tables.records.TArraysRecord, org.jooq.test.h2.generatedclasses.tables.pojos.TArrays, java.lang.Integer> {

	/**
	 * Create a new TArraysDao without any factory
	 */
	public TArraysDao() {
		super(org.jooq.test.h2.generatedclasses.tables.TArrays.T_ARRAYS, org.jooq.test.h2.generatedclasses.tables.pojos.TArrays.class);
	}

	/**
	 * Create a new TArraysDao with an attached factory
	 */
	public TArraysDao(org.jooq.impl.Factory factory) {
		super(org.jooq.test.h2.generatedclasses.tables.TArrays.T_ARRAYS, org.jooq.test.h2.generatedclasses.tables.pojos.TArrays.class, factory);
	}

	@Override
	protected java.lang.Integer getId(org.jooq.test.h2.generatedclasses.tables.pojos.TArrays object) {
		return object.getId();
	}
}
