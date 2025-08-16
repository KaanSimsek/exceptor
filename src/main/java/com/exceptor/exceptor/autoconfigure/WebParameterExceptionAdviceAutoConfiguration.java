package com.exceptor.exceptor.autoconfigure;

import com.exceptor.exceptor.handler.WebParameterExceptionAdvice;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class WebParameterExceptionAdviceAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(WebParameterExceptionAdvice.class)
    public WebParameterExceptionAdvice webParameterExceptionAdvice() {
        return new WebParameterExceptionAdvice();
    }
}
