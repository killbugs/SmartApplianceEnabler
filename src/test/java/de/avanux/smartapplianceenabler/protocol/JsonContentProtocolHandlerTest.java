/*
 * Copyright (C) 2019 Axel Müller <axel.mueller@avanux.de>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package de.avanux.smartapplianceenabler.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonContentProtocolHandlerTest {
    private ContentProtocolHandler contentProtocolHandler;

    public JsonContentProtocolHandlerTest() {
        this.contentProtocolHandler = new JsonContentProtocolHandler();
    }

    @Test
    public void readIntegerValue() {
        String content = "{ \"car\": \"3\" }";
        String selector = "$.car";
        this.contentProtocolHandler.parse(content);
        assertEquals(3, this.contentProtocolHandler.readIntegerValue(selector).intValue());
    }
}
