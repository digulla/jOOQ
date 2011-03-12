/**
 * Copyright (c) 2009-2011, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
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
 * . Neither the name of the "jOOQ" nor the names of its contributors may be
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

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.jooq.Configuration;
import org.jooq.EnumType;
import org.jooq.MasterDataType;

/**
 * @author Lukas Eder
 */
class Constant<T> extends AbstractField<T> {

    private static final long serialVersionUID = 6807729087019209084L;
    private final T           value;

    @SuppressWarnings("unchecked")
    Constant(Configuration configuration, T value) {
        super(configuration, value.toString(),
            FieldTypeHelper.getDataType(configuration.getDialect(), (Class<? extends T>) value.getClass()));

        this.value = value;
    }

    @Override
    public final String toSQLReference(Configuration configuration, boolean inlineParameters) {

        // Casting is only done when parameters are NOT inlined
        if (!inlineParameters) {

            // Generated enums should not be cast...
            // The exception's exception
            if (!(value instanceof EnumType) && !(value instanceof MasterDataType)) {
                switch (getDialect()) {

                    // These dialects cannot detect the type of a bound constant.
                    case HSQLDB:
                    case H2:
                    case DERBY:
                    case DB2:
                        return "cast(? as " + getDataType().getCastTypeName() + ")";
                }
            }
        }

        // Most RDBMS can handle constants as typeless literals
        return FieldTypeHelper.toSQL(getDialect(), value, inlineParameters, this);
    }

    @Override
    public int bind(Configuration configuration, PreparedStatement stmt, int initialIndex) throws SQLException {
        JooqUtil.bind(getDialect(), stmt, initialIndex, this, value);
        return initialIndex + 1;
    }

    @Override
    public final boolean isNullLiteral() {
        return value == null;
    }
}