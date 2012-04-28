/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources;

/**
 * This class is generated by jOOQ.
 */
public class HumanResourcesFactory extends org.jooq.util.sqlserver.SQLServerFactory {

	private static final long serialVersionUID = 1985623770;

	/**
	 * Create a factory with a connection
	 *
	 * @param connection The connection to use with objects created from this factory
	 */
	public HumanResourcesFactory(java.sql.Connection connection) {
		super(connection);

		initDefaultSchema();
	}

	/**
	 * Create a factory with a connection and a schema mapping
	 * 
	 * @deprecated - 2.0.5 - Use {@link #HumanResourcesFactory(java.sql.Connection, org.jooq.conf.Settings)} instead
	 */
	@Deprecated
	public HumanResourcesFactory(java.sql.Connection connection, org.jooq.SchemaMapping mapping) {
		super(connection, mapping);

		initDefaultSchema();
	}

	/**
	 * Create a factory with a connection and some settings
	 *
	 * @param connection The connection to use with objects created from this factory
	 * @param settings The settings to apply to objects created from this factory
	 */
	public HumanResourcesFactory(java.sql.Connection connection, org.jooq.conf.Settings settings) {
		super(connection, settings);

		initDefaultSchema();
	}

	/**
	 * Initialise the render mapping's default schema.
	 * <p>
	 * For convenience, this schema-specific factory should override any pre-existing setting
	 */
	private final void initDefaultSchema() {
		org.jooq.conf.SettingsTools.getRenderMapping(getSettings()).setDefaultSchema(org.jooq.examples.sqlserver.adventureworks.humanresources.HumanResources.HumanResources.getName());
	}
}