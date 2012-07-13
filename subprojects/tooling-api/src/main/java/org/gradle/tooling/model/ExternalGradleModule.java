/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.tooling.model;

/**
 * Informs about external Gradle module, i.e. group, name, version.
 *
 * @since 1.1-rc-1
 */
public interface ExternalGradleModule {

    /**
     * Group of the module, for example 'org.gradle'.
     */
    String getGroup();

    /**
     * Name of the module, for example 'gradle-tooling-api'.
     */
    String getName();

    /**
     * Version of the module, for example '1.0'.
     */
    String getVersion();

}
