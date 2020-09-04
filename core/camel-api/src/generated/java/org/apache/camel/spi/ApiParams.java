/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.spi;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Used to annotate a nested configuration parameter type (such as a nested Configuration object) which can then be used
 * on a API based component, endpoint.
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target({ ElementType.TYPE })
public @interface ApiParams {

    /**
     * The API name (grouping) of this configuration class.
     *
     * This is only applicable for API based components where configurations are separated by API names and methods
     * (grouping).
     */
    String apiName() default "";

    /**
     * The API methods (separated by comma) that the API provides of this configuration class.
     *
     * This is only applicable for API based components where configurations are separated by API names and methods
     * (grouping).
     */
    String apiMethods() default "";

}
