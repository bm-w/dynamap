/*
    Copyright 2017 N3TWORK INC

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/

package com.n3twork.dynamap.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Index {

    private final String hashKey;
    private final String rangeKey;
    private final String indexName;

    @JsonCreator
    public Index(@JsonProperty("hashKey") String hashKey, @JsonProperty("rangeKey") String rangeKey, @JsonProperty("index") String indexName) {
        this.hashKey = hashKey;
        this.rangeKey = rangeKey;
        this.indexName = indexName;
    }

    public String getHashKey() {
        return hashKey;
    }

    public String getRangeKey() {
        return rangeKey;
    }

    public String getIndexName() {
        return indexName;
    }

    public String getIndexName(String prefix) {
        if (prefix != null) {
            return prefix + "." + indexName;
        } else {
            return indexName;
        }

    }
}
