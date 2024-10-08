/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.seatunnel.app.domain.response.executor;

import org.apache.seatunnel.app.common.EngineType;
import org.apache.seatunnel.common.constants.JobMode;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JobExecutorRes {

    private final Long jobInstanceId;

    private final String jobConfig;

    /** engine name Spark/Flink/SeaTunnel */
    private final EngineType engine;

    /** The driver run mode, only spark use now, support 'client' and 'cluster' */
    private final String deployMode;

    /** The engine run mode, for SeaTunnel Engine only support 'local' and null */
    private final String master;

    private final JobMode jobMode;
}
