package my.service;

import java.io.IOException;

import javax.annotation.Priority;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.Context;
import javax.ws.rs.ext.Provider;


@Provider
@PreMatching
@Priority(3)
public class MyJaxRsFilter implements ContainerRequestFilter {
	
	@Context HttpServletRequest request;

	public void filter(ContainerRequestContext ctx) throws IOException {
		
    	System.out.println("Hello JAXRS filter, request = " + request);
	}

}