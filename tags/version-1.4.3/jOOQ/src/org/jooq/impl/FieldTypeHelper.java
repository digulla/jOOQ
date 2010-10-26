/**
 * Copyright (c) 2009, Lukas Eder, lukas.eder@gmail.com
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

import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.sql.Types;
import java.text.SimpleDateFormat;

import org.jooq.NamedTypeProviderQueryPart;
import org.jooq.SQLDialect;
import org.jooq.SQLDialectNotSupportedException;
import org.jooq.util.hsqldb.HSQLDBDataType;
import org.jooq.util.mysql.MySQLDataType;
import org.jooq.util.oracle.OracleDataType;
import org.jooq.util.postgres.PostgresDataType;

/**
 * @author Lukas Eder
 */
final class FieldTypeHelper {

    public static String toSQL(Object value, boolean inlineParameters) {
        return toSQL(value, inlineParameters, value.getClass());
    }

    public static String toSQL(Object value, boolean inlineParameters, NamedTypeProviderQueryPart<?> field) {
        return toSQL(value, inlineParameters, field.getType());
    }

    public static String toSQL(Object value, boolean inlineParameters, Class<?> type) {
        if (inlineParameters) {
            if (type == Blob.class) {
                // Not supported
            }
            else if (type == Boolean.class) {
                return value.toString();
            }
            else if (type == BigDecimal.class) {
                return value.toString();
            }
            else if (type == Byte.class) {
                return value.toString();
            }
            else if (type == byte[].class) {
                // Not supported
            }
            else if (type == Clob.class) {
                // Not supported
            }
            else if (type == Date.class) {
                if (value instanceof Date) {
                    SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
                    return "'" + f.format((Date) value) + "'";
                }
            }
            else if (type == Double.class) {
                return value.toString();
            }
            else if (type == Float.class) {
                return value.toString();
            }
            else if (type == Integer.class) {
                return value.toString();
            }
            else if (type == Long.class) {
                return value.toString();
            }
            else if (type == Short.class) {
                return value.toString();
            }
            else if (type == String.class) {
                return "'" + value.toString().replace("'", "''") + "'";
            }
            else if (type == Time.class) {
                if (value instanceof Date) {
                    SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");
                    return "'" + f.format((Time) value) + "'";
                }
            }
            else if (type == Timestamp.class) {
                if (value instanceof Timestamp) {
                    SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    return "'" + f.format((Timestamp) value) + "'";
                }
            }
            else {
                // Not supported
            }

            throw new UnsupportedOperationException("Class " + type + " is not supported");
        }

        return "?";
    }

    @SuppressWarnings("unchecked")
    public static <T> T getFromResultSet(ResultSet rs, Class<? extends T> type, int index) throws SQLException {
        if (type == Blob.class) {
            return (T) rs.getBlob(index);
        }
        else if (type == Boolean.class) {
            return (T) Boolean.valueOf(rs.getBoolean(index));
        }
        else if (type == BigDecimal.class) {
            return (T) rs.getBigDecimal(index);
        }
        else if (type == Byte.class) {
            return (T) Byte.valueOf(rs.getByte(index));
        }
        else if (type == byte[].class) {
            return (T) rs.getBytes(index);
        }
        else if (type == Clob.class) {
            return (T) rs.getClob(index);
        }
        else if (type == Date.class) {
            return (T) rs.getDate(index);
        }
        else if (type == Double.class) {
            return (T) Double.valueOf(rs.getDouble(index));
        }
        else if (type == Float.class) {
            return (T) Float.valueOf(rs.getFloat(index));
        }
        else if (type == Integer.class) {
            return (T) Integer.valueOf(rs.getInt(index));
        }
        else if (type == Long.class) {
            return (T) Long.valueOf(rs.getLong(index));
        }
        else if (type == Short.class) {
            return (T) Short.valueOf(rs.getShort(index));
        }
        else if (type == String.class) {
            return (T) rs.getString(index);
        }
        else if (type == Time.class) {
            return (T) rs.getTime(index);
        }
        else if (type == Timestamp.class) {
            return (T) rs.getTimestamp(index);
        }
        else {
            return (T) rs.getObject(index);
        }
    }

    public static <T> T getFromStatement(CallableStatement statement, NamedTypeProviderQueryPart<T> field)
        throws SQLException {
        return getFromStatement(statement, field.getType(), field.getName());
    }

    @SuppressWarnings("unchecked")
    public static <T> T getFromStatement(CallableStatement statement, Class<? extends T> type, String fieldName)
        throws SQLException {
        if (type == Blob.class) {
            return (T) statement.getBlob(fieldName);
        }
        else if (type == Boolean.class) {
            return (T) Boolean.valueOf(statement.getBoolean(fieldName));
        }
        else if (type == BigDecimal.class) {
            return (T) statement.getBigDecimal(fieldName);
        }
        else if (type == Byte.class) {
            return (T) Byte.valueOf(statement.getByte(fieldName));
        }
        else if (type == byte[].class) {
            return (T) statement.getBytes(fieldName);
        }
        else if (type == Clob.class) {
            return (T) statement.getClob(fieldName);
        }
        else if (type == Date.class) {
            return (T) statement.getDate(fieldName);
        }
        else if (type == Double.class) {
            return (T) Double.valueOf(statement.getDouble(fieldName));
        }
        else if (type == Float.class) {
            return (T) Float.valueOf(statement.getFloat(fieldName));
        }
        else if (type == Integer.class) {
            return (T) Integer.valueOf(statement.getInt(fieldName));
        }
        else if (type == Long.class) {
            return (T) Long.valueOf(statement.getLong(fieldName));
        }
        else if (type == Short.class) {
            return (T) Short.valueOf(statement.getShort(fieldName));
        }
        else if (type == String.class) {
            return (T) statement.getString(fieldName);
        }
        else if (type == Time.class) {
            return (T) statement.getTime(fieldName);
        }
        else if (type == Timestamp.class) {
            return (T) statement.getTimestamp(fieldName);
        }
        else {
            return (T) statement.getObject(fieldName);
        }
    }

    public static int getSQLType(NamedTypeProviderQueryPart<?> field) {
        return getSQLType(field.getType());
    }

    public static int getSQLType(Class<?> type) {
        if (type == Blob.class) {
            return Types.BLOB;
        }
        else if (type == Boolean.class) {
            return Types.BOOLEAN;
        }
        else if (type == BigDecimal.class) {
            return Types.DECIMAL;
        }
        else if (type == Byte.class) {
            return Types.TINYINT;
        }
        else if (type == byte[].class) {
            return Types.BLOB;
        }
        else if (type == Clob.class) {
            return Types.CLOB;
        }
        else if (type == Date.class) {
            return Types.DATE;
        }
        else if (type == Double.class) {
            return Types.DOUBLE;
        }
        else if (type == Float.class) {
            return Types.FLOAT;
        }
        else if (type == Integer.class) {
            return Types.INTEGER;
        }
        else if (type == Long.class) {
            return Types.BIGINT;
        }
        else if (type == Short.class) {
            return Types.SMALLINT;
        }
        else if (type == String.class) {
            return Types.VARCHAR;
        }
        else if (type == Time.class) {
            return Types.TIME;
        }
        else if (type == Timestamp.class) {
            return Types.TIMESTAMP;
        }
        else {
            return Types.OTHER;
        }
    }

    public static String getDialectSQLType(SQLDialect dialect, NamedTypeProviderQueryPart<?> field) {
        return getDialectSQLType(dialect, field.getType());
    }

    public static String getDialectSQLType(SQLDialect dialect, Class<?> type) {
        Enum<?> result = null;

        switch (dialect) {
            case HSQLDB:
                result = HSQLDBDataType.getType(type);
                break;
            case MYSQL:
                result = MySQLDataType.getType(type);
                break;
            case ORACLE:
                result = OracleDataType.getType(type);
                break;
            case POSTGRES:
                result = PostgresDataType.getType(type);
                break;

            default:
                throw new SQLDialectNotSupportedException("This method is not yet implemented for dialect " + dialect);
        }

        if (result == null) {
            throw new SQLDialectNotSupportedException(type + " cannot be mapped to any type in dialect " + dialect);
        }

        return String.valueOf(result);
    }


    private FieldTypeHelper() {}
}