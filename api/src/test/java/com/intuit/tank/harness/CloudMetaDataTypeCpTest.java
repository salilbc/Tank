package com.intuit.tank.harness;

/*
 * #%L
 * Intuit Tank Api
 * %%
 * Copyright (C) 2011 - 2015 Intuit Inc.
 * %%
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * #L%
 */

import org.junit.jupiter.api.*;

import com.intuit.tank.harness.CloudMetaDataType;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The class <code>CloudMetaDataTypeCpTest</code> contains tests for the class <code>{@link CloudMetaDataType}</code>.
 * 
 * @generatedBy CodePro at 9/3/14 3:44 PM
 */
public class CloudMetaDataTypeCpTest {
    /**
     * Run the String getKey() method test.
     * 
     * @throws Exception
     * 
     * @generatedBy CodePro at 9/3/14 3:44 PM
     */
    @Test
    public void testGetKey_1()
            throws Exception {
        CloudMetaDataType fixture = CloudMetaDataType.ami_id;

        String result = fixture.getKey();

        assertEquals("ami-id", result);
    }
}