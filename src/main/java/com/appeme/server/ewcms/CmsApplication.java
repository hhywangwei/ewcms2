package com.appeme.server.ewcms;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CmsApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(CmsApplication.class);

    public static void main(String[] args){
        ApplicationContext context = new SpringApplicationBuilder(CmsApplication.class)
                .web(WebApplicationType.SERVLET)
                .build()
                .run(args);
    }
}
