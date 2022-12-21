package com.andrecastrosousa.spring.basics.springbasics.spring5steps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {

    @Value("${external.service.url}")
    private String url;

    public String getServiceUrl() {
        return url;
    }
}
