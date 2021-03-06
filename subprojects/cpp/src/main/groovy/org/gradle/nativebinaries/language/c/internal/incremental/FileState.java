/*
 * Copyright 2013 the original author or authors.
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
package org.gradle.nativebinaries.language.c.internal.incremental;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FileState implements Serializable {
    private List<SourceDependency> dependencies = new ArrayList<SourceDependency>();
    private byte[] hash;

    public byte[] getHash() {
        return hash;
    }

    public void setHash(byte[] hash) {
        this.hash = hash;
    }

    public List<SourceDependency> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<SourceDependency> files) {
        this.dependencies.clear();
        this.dependencies.addAll(files);
    }
}
