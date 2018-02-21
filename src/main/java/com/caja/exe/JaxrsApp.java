package com.caja.exe;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.caja.resources.EmployeeResource;

@Component
@ApplicationPath("/jax")
public class JaxrsApp extends ResourceConfig
{
	@Autowired
	public JaxrsApp() {
		//packages("com.caja.resources");
		register(EmployeeResource.class);
	}


}
