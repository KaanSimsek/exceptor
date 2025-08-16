package com.exceptor.exceptor.autoconfigure;

import com.exceptor.exceptor.handler.HttpResponseExceptionControllerAdvice;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@AutoConfiguration
public class HttpResponseExceptionControllerAdviceAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(HttpResponseExceptionControllerAdvice.class)
    public HttpResponseExceptionControllerAdvice httpResponseExceptionControllerAdvice() {
        return new HttpResponseExceptionControllerAdvice();
    }
}