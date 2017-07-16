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

package com.n3twork.dynamap;

import java.util.List;
import java.util.Map;

public class BatchDeleteRequest<T extends DynamapRecordBean> {

    private List<DeleteRequest> deleteRequests;
    private Map<Class, DynamoRateLimiter> rateLimiters;


    public BatchDeleteRequest withDeleteRequests(List<DeleteRequest> deleteRequests) {
        this.deleteRequests = deleteRequests;
        return this;
    }

    public BatchDeleteRequest withRateLimiters(Map<Class, DynamoRateLimiter> rateLimiters) {
        this.rateLimiters = rateLimiters;
        return this;
    }

    public List<DeleteRequest> getDeleteRequests() {
        return deleteRequests;
    }

    public Map<Class, DynamoRateLimiter> getRateLimiters() {
        return rateLimiters;
    }
}
