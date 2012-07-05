/**
 * Copyright (c) 2009-2012, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * This software is licensed to you under the Apache License, Version 2.0
 * (the "License"); You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.jooq.impl;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXB;

import org.jooq.Configuration;
import org.jooq.ConnectionProvider;
import org.jooq.SQLDialect;
import org.jooq.conf.Settings;

/**
 * The default configuration, if no other configuration is supplied
 *
 * @author Lukas Eder
 */
public class DefaultConfiguration implements Configuration {

    /**
     * Generated UID
     */
    private static final long  serialVersionUID      = -5746537675969065088L;

    static final Configuration DEFAULT_CONFIGURATION = new DefaultConfiguration();

    public DefaultConfiguration() {
        this((SQLDialect)null);
    }

    public DefaultConfiguration(Configuration template) {
        if(null != template.getDialect()) {
            dialect = template.getDialect();
        }
        connectionProvider = template.getConnectionProvider();
        settings = template.getSettings(); // TODO clone?
        if(null == settings) {
            settings = new Settings();
        }
        data = template.getData(); // TODO clone?
    }

    public DefaultConfiguration(Configuration template, SQLDialect dialect) {
        this(template);
        if(null != dialect) {
            this.dialect = dialect;
        }
    }

    public DefaultConfiguration(SQLDialect dialect) {
        if(null != dialect) {
            this.dialect = dialect;
        }
        this.settings = new Settings();
    }

    @SuppressWarnings("deprecation")
    private SQLDialect dialect = SQLDialect.SQL99;

    public void setDialect(SQLDialect dialect) {
        this.dialect = dialect;
    }

    @Override
    public final SQLDialect getDialect() {
        return dialect;
    }

    private ConnectionProvider connectionProvider;

    @Override
    public void setConnectionProvider(ConnectionProvider connectionProvider) {
        this.connectionProvider = connectionProvider;
    }

    @Override
    public ConnectionProvider getConnectionProvider() {
        return connectionProvider;
    }

    @Override
    @Deprecated
    public final org.jooq.SchemaMapping getSchemaMapping() {
        return org.jooq.SchemaMapping.NO_MAPPING;
    }

    private Settings settings;

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    @Override
    public final Settings getSettings() {
        return settings;
    }

    private Map<String, Object> data = new HashMap<String, Object>();

    @Override
    public final Map<String, Object> getData() {
        return data;
    }

    @Override
    public final Object getData(String key) {
        return data.get(key);
    }

    @Override
    public final Object setData(String key, Object value) {
        return data.put(key, value);
    }

    @Override
    public Factory getNewFactory() {
        return new Factory(this);
    }


    // -------------------------------------------------------------------------
    // XXX The Object API
    // -------------------------------------------------------------------------

    @Override
    public String toString() {
        StringWriter writer = new StringWriter();
        JAXB.marshal(settings, writer);

        return getClass().getSimpleName() + " [\n\tconnected=" + connectionProvider.isConnected() +
            ",\n\tdialect=" + dialect +
            ",\n\tdata=" + data +
            ",\n\tsettings=\n\t\t" + writer.toString().trim().replace("\n", "\n\t\t") +
            "\n]";
    }
}
