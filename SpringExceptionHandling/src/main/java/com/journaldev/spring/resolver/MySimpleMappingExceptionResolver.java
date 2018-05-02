package com.journaldev.spring.resolver;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

@Component
public class MySimpleMappingExceptionResolver extends
		SimpleMappingExceptionResolver {

	@Override
	public String buildLogMessage(Exception ex, HttpServletRequest request) {
        return "Spring MVC exception: " + ex.getLocalizedMessage();
    }
}
 