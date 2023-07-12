package com.cms.portal.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class AppProperties {

    @Value("${file.storage}")
    public String fileStorage;
}
