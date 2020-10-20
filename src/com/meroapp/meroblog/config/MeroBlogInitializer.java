package com.meroapp.meroblog.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MeroBlogInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class[] { WebAppConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[] { DbConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"/"};
	}

}
