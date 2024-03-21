/*
 * Copyright (c) 2024, WSO2 LLC. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
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

package org.wso2.is.client.model;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.wso2.carbon.apimgt.impl.kmclient.KeyManagerClientException;

/**
 * Represents the WSO2 Identity Server 7 DCR client.
 */
public interface WSO2IS7DCRClient {

    @RequestLine("POST ")
    @Headers("Content-Type: application/json")
    WSO2IS7ClientInfo createApplication(WSO2IS7ClientInfo clientInfo) throws KeyManagerClientException;

    @RequestLine("GET /{clientId}")
    @Headers("Content-Type: application/json")
    WSO2IS7ClientInfo getApplication(@Param("clientId") String clientId) throws KeyManagerClientException;

    @RequestLine("PUT /{clientId}")
    @Headers("Content-Type: application/json")
    WSO2IS7ClientInfo updateApplication(@Param("clientId") String clientId, WSO2IS7ClientInfo clientInfo)
            throws KeyManagerClientException;

    @RequestLine("DELETE /{clientId}")
    @Headers("Content-Type: application/json")
    void deleteApplication(@Param("clientId") String clientId) throws KeyManagerClientException;

}