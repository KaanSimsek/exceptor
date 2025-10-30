package com.exceptor.exceptor.autoconfigure;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class FeignExceptionControllerAdviceAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(FeignExceptionControllerAdvice.class)
    public FeignExceptionControllerAdvice feignExceptionControllerAdvice(ObjectMapper objectMapper) {
        return new FeignExceptionControllerAdvice(objectMapper);
    }
}
