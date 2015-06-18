package com.demo.get;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

@Path("/ftocservice")
public class FtoCService {

	/**
	 * This method use to demo @GET with JSON
	 * URI is - http://localhost:8080/JerseyDemo/demo/ftocservice/20
	 * 
	 * @return json object value
	 * @throws JSONException
	 */
	@GET
	@Produces("application/json")
	public Response convertFtoC() throws JSONException {
 
	  JSONObject jsonObject = new JSONObject();
	  Double fahrenheit = 98.24;
	  Double celsius;
	  celsius = (fahrenheit - 32)*5/9;
	  jsonObject.put("F Value", fahrenheit);
	  jsonObject.put("C Value", celsius);
 
	  String result = "F to C Converter Output: " + jsonObject;
	  return Response.status(200).entity(result).build();
	}
 	
	/**
	 * This method use to demo @GET with JSON including @PathParam
	 * URI is - http://localhost:8080/JerseyDemo/demo/ftocservice/20
	 * 
	 * @param f
	 * @return
	 * @throws JSONException
	 */
	@Path("{f}")
	@GET
	@Produces("application/json")
	public Response convertFtoCfromInput(@PathParam("f") float f) throws JSONException {
 
		JSONObject jsonObject = new JSONObject();
		float celsius;
		celsius =  (f - 32)*5/9;
		jsonObject.put("F Value", f);
		jsonObject.put("C Value", celsius);
 
		String result = " Output: F to C Converter Output: " + jsonObject;
		return Response.status(200).entity(result).build();
	}
}