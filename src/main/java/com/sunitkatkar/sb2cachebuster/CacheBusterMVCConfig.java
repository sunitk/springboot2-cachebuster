/**
 * Copyright 2018 onwards - Sunit Katkar (sunitkatkar@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License. / package com.sunitkatkar.sb2cachebuster.controllers;
 */
package com.sunitkatkar.sb2cachebuster;

import org.springframework.boot.autoconfigure.web.ConditionalOnEnabledResourceChain;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.ResourceUrlEncodingFilter;

/**
 * The MVC config where the {@link ResourceUrlEncodingFilter} filter is defined
 * 
 * @author Sunit Katkar, sunitkatkar@gmail.com
 *         (https://sunitkatkar.blogspot.com/)
 * @since ver 1.0 (Sept 2018)
 * @version 1.0
 */
@Component
public class CacheBusterMVCConfig implements WebMvcConfigurer {

    /**
     * Define the ResourceUrlEncodingFilter as a bean. Add the
     * <code>@ConditionalOnEnabledResourceChain</code> to ensure that the resource
     * chain property <code>spring.resources.chain.enabled=true</code> is set to
     * true in the <code>application.properties</code> file.
     * 
     * @return
     */
    @Bean
    @ConditionalOnEnabledResourceChain
    public ResourceUrlEncodingFilter resourceUrlEncodingFilter() {
        return new ResourceUrlEncodingFilter();
    }
}
