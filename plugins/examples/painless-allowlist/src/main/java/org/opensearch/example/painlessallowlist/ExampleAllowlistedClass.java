/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

package org.opensearch.example.painlessallowlist;

/**
 * An example of a class to be allowlisted for use by painless scripts
 *
 * Each of the members and methods below are allowlisted for use in search scripts.
 * See <a href="file:example_allowlist.txt">example_allowlist.txt</a>.
 */
public class ExampleAllowlistedClass {

    public static final int CONSTANT = 42;

    public int publicMember;

    private int privateMember;

    public ExampleAllowlistedClass(int publicMember, int privateMember) {
        this.publicMember = publicMember;
        this.privateMember = privateMember;
    }

    public int getPrivateMemberAccessor() {
        return this.privateMember;
    }

    public void setPrivateMemberAccessor(int privateMember) {
        this.privateMember = privateMember;
    }

    public static void staticMethod() {
        // electricity
    }

    // example augmentation method
    public static int toInt(String x) {
        return Integer.parseInt(x);
    }

    // example method to attach annotations in allowlist
    public void annotate() {
        // some logic here
    }
}
