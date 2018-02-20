package com.caja.exe;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@ApplicationPath("/")
@Component
public class JaxrsApp extends ResourceConfig
{
	@Autowired
	public JaxrsApp() {
		packages("com.caja.resources");
	}


}
