/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2017-2017 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2017 The OpenNMS Group, Inc.
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

package org.opennms.netmgt.ticketer.jira.fieldmapper;

import com.atlassian.jira.rest.client.api.domain.FieldSchema;

public class StringFieldMapper implements FieldMapper {
    @Override
    public boolean matches(FieldSchema schema) {
        return ("description".equals(schema.getSystem()) && schema.getCustom() == null)
                || ("duedate".equals(schema.getSystem()) && schema.getCustom() == null)
                || ("environment".equals(schema.getSystem()) && schema.getCustom() == null)
                || ("summary".equals(schema.getSystem()) && schema.getCustom() == null)
                || "com.atlassian.jira.plugin.system.customfieldtypes:url".equals(schema.getCustom())
                || "com.atlassian.jira.plugin.system.customfieldtypes:datepicker".equals(schema.getCustom())
                || "com.atlassian.jira.plugin.system.customfieldtypes:datetime".equals(schema.getCustom())
                || "com.atlassian.jira.plugin.system.customfieldtypes:textfield".equals(schema.getCustom())
                || "com.atlassian.jira.plugin.system.customfieldtypes:textarea".equals(schema.getCustom());
    }

    @Override
    public Object mapToFieldValue(String fieldId, FieldSchema schema, String attributeValue) {
        return attributeValue;
    }
}
