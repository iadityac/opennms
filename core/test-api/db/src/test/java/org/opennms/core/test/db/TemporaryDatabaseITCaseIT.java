/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2006-2014 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2014 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

package org.opennms.core.test.db;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import org.junit.Test;

public class TemporaryDatabaseITCaseIT extends TemporaryDatabaseITCase {

    @Override
    public void testNothing() {
        // Nothing, just make sure that setUp() and tearDown() work
    }

    @Test
    public void testExecuteSQL() {
        executeSQL("SELECT now()");
    }
    
    @Test
    public void testExecuteSQLFromJdbcTemplate() {
        jdbcTemplate.queryForObject("SELECT now()", Date.class);
    }
    
    @Test
    public void testExecuteSQLFromGetJdbcTemplate() {
        getJdbcTemplate().queryForObject("SELECT now()", Date.class);
    }

    @Test
    public void testGetBlame() {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        assertEquals("blame string", getClass().getName() + "." + methodName + ": leaveDatabase false leaveDatabaseOnFailure false", getJdbcTemplate().queryForObject("SELECT blame FROM blame", String.class));
    }

}
