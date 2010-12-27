/**
 * Copyright (c) 2010, Lukas Eder, lukas.eder@gmail.com
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

import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.SQLOutput;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.UDT;
import org.jooq.UDTRecord;

/**
 * A record implementation for a record originating from a single UDT
 *
 * @author Lukas Eder
 */
public class UDTRecordImpl<R extends Record> extends TypeRecord<UDT<R>> implements UDTRecord<R> {

    public UDTRecordImpl(UDT<R> udt) {
        super(udt);
    }

    @Override
    public final UDT<R> getUDT() {
        return getType0();
    }

    @Override
    public final String getSQLTypeName() throws SQLException {
        return getUDT().getName();
    }

    @Override
    public final void readSQL(SQLInput stream, String typeName) throws SQLException {
        for (Field<?> field : getUDT().getFields()) {
            setValue(stream, field);
        }
    }

    @SuppressWarnings("deprecation")
    private final <T> void setValue(SQLInput stream, Field<T> field) throws SQLException {
        setValue(field, FieldTypeHelper.getFromSQLInput(getUDT().getQueryPart().getDialect(), stream, field));
    }

    @Override
    public final void writeSQL(SQLOutput stream) throws SQLException {
        throw new UnsupportedOperationException("Streaming of UDTs to SQLOutput is not yet supported.");
    }
}