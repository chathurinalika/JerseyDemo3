package com.demo.get;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/ctofservice")
public class CtoFService {
	 
	/**
	 * This method use to demo @GET with @PathParam.
	 * URI is - http://localhost:8080/JerseyDemo/demo/ctofservice/20
	 * 
	 * @param c - Input temperature value as celsius
	 * @return - fahrenheit value of the entered temperature
	 */
	@Path("{c}")
	@GET
	@Produces("text/plain")
	public String convertCtoFfromInput(@PathParam("c") Double c) {
		Double fahrenheit;
		Double celsius = c;
		fahrenheit = ((celsius * 9) / 5) + 32;
 
		String result = "Output: C to F Converter Output is: " + fahrenheit;
		return  result;
	}
	
	/**
	 * This method use to demo @GET with @QueryParam.
	 * URI - http://localhost:8080/JerseyDemo/demo/ctofservice/query?from=100&to=200&orderBy=age&orderBy=name
	 * 
	 * @param from - value for FROM clause of the query
	 * @param to - value for TO clause of the query
	 * @param orderBy - value for ORDERBY clause of the query
	 * @return query string
	 */
	@Path("/query")
	@GET
	public Response getUsers(
			@QueryParam("from") int from,
			@QueryParam("to") int to,
			@QueryParam("orderBy") List<String> orderBy) {
	 
			return Response
			   .status(200)
			   .entity("getUsers is called, from : " + from + ", to : " + to
				+ ", orderBy" + orderBy.toString()).build(); 
	}
}
