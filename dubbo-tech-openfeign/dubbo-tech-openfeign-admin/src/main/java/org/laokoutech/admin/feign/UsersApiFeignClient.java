/*
 * Copyright (c) 2022 KCloud-Platform-Alibaba Author or Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.laokoutech.admin.feign;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.laokoutech.admin.factory.UsersApiFeignClientFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author laokou
 */
@FeignClient(contextId = "users", name = "dubbo-tech-openfeign-user", path = "/v1/users",
        fallbackFactory = UsersApiFeignClientFallbackFactory.class)
public interface UsersApiFeignClient {

    @RequestLine("GET /test?id={id}")
//    @Headers("Content-Type: application/json")
    void test(@Param("id") String id);
}
