package com.redhat.fuse.boosters.healthcheck;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan
public class IndexRootMapper extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/health-check-index.html");
    }

    // @Override
    // public void addViewControllers(ViewControllerRegistry registry) {
    //     registry.addViewController("/").setStatusCode(HttpStatus.PERMANENT_REDIRECT).setViewName("redirect:/webjars/swagger-ui/index.html?url=/camel/api-doc&validatorUrl=");
    // }
}