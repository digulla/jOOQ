/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.daos;

/**
 * This class is generated by jOOQ.
 *
 * A book store
 */
public class TBookStoreDao extends org.jooq.impl.DAOImpl<org.jooq.test.h2.generatedclasses.tables.records.TBookStoreRecord, org.jooq.test.h2.generatedclasses.tables.pojos.TBookStore, java.lang.String> {

	/**
	 * Create a new TBookStoreDao without any factory
	 */
	public TBookStoreDao() {
		super(org.jooq.test.h2.generatedclasses.tables.TBookStore.T_BOOK_STORE, org.jooq.test.h2.generatedclasses.tables.pojos.TBookStore.class);
	}

	/**
	 * Create a new TBookStoreDao with an attached factory
	 */
	public TBookStoreDao(org.jooq.impl.Factory factory) {
		super(org.jooq.test.h2.generatedclasses.tables.TBookStore.T_BOOK_STORE, org.jooq.test.h2.generatedclasses.tables.pojos.TBookStore.class, factory);
	}

	@Override
	protected java.lang.String getId(org.jooq.test.h2.generatedclasses.tables.pojos.TBookStore object) {
		return object.getName();
	}
}
