/**
 * Copyright (c) 2009-2012, Lukas Eder, lukas.eder@gmail.com
 *                             Christopher Deckers, chrriis@gmail.com
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
package org.jooq.debug.console.remote;

import java.util.concurrent.atomic.AtomicInteger;

import org.jooq.debug.StatementExecution;
import org.jooq.debug.StatementExecutor;

/**
 * @author Christopher Deckers
 */
public class ClientStatementExecutor implements StatementExecutor {

    private static AtomicInteger nextID = new AtomicInteger();

    private ClientDebugger debugger;
    private int id;

    /**
     * @param breakpointHitThreadID null if not in a breakpoint hit.
     */
    public ClientStatementExecutor(ClientDebugger debugger, Long breakpointHitThreadID) {
        id = nextID.incrementAndGet();
        this.debugger = debugger;
        new ServerDebugger.CMS_createServerStatementExecutor().asyncExec(debugger.getCommunicationInterface(), id, breakpointHitThreadID);
    }

    @Override
    public StatementExecution execute(String sql, int maxRSRowsParsing, int retainParsedRSDataRowCountThreshold) {
        return (StatementExecution)new ServerDebugger.CMS_doStatementExecutorExecution().syncExec(debugger.getCommunicationInterface(), id, sql, maxRSRowsParsing, retainParsedRSDataRowCountThreshold);
    }

    @Override
    public void stopExecution() {
        new ServerDebugger.CMS_stopStatementExecutorExecution().asyncExec(debugger.getCommunicationInterface(), id);
    }

    @Override
    public String[] getTableNames() {
        String[] tableNames = (String[])new ServerDebugger.CMS_getStatementExecutorTableNames().syncExec(debugger.getCommunicationInterface(), id);
        return tableNames == null? new String[0]: tableNames;
    }

    @Override
    public String[] getTableColumnNames() {
        String[] tableColumnNames = (String[])new ServerDebugger.CMS_getStatementExecutorTableColumnNames().syncExec(debugger.getCommunicationInterface(), id);
        return tableColumnNames == null? new String[0]: tableColumnNames;
    }

}
