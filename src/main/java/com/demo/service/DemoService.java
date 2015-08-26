package com.demo.service;

import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.here.framework.xml.adaptor.MapAdaptor;
@Path("/demo")
public interface DemoService {
	@GET
	@Path("/demoString")
	@Produces(MediaType.APPLICATION_JSON)
	public String getDemoString();
	
	@GET
	@Path("/demo")
	@Produces(MediaType.APPLICATION_JSON)
	public DemoBean getDemo();
	
	@PUT
	@Path("/updateDemo")
	@Produces(MediaType.APPLICATION_JSON)
	public DemoBean updateDemo(DemoBean bean);
	
	@PUT
	@Path("/test")
	@Produces(MediaType.APPLICATION_JSON)
	public String test(@MatrixParam("meta") @XmlJavaTypeAdapter(MapAdaptor.class) Map<String,String> meta);
	
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Map<String, String>> getAll();
	
}
