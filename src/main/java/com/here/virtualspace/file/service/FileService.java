package com.here.virtualspace.file.service;

import java.io.File;
import java.io.InputStream;
import java.util.Map;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import com.here.framework.xml.adaptor.MapAdaptor;

/**
 * 文件服务
 * @author koujp
 *
 */
@Path("/file")
public interface FileService {
	/**
	 * 
	 * @param file
	 * @param metaMap
	 * @return 返回文件路径名
	 * @throws Exception
	 */
	@POST
	@Path("/upload-file")
	@Produces(MediaType.APPLICATION_JSON)
	public String upload(@MatrixParam("file") File file,@MatrixParam("metaMap") Map<String,String> metaMap) throws Exception;
	/**
	 * 
	 * @param file
	 * @param metaMap
	 * @param extName
	 * @return 返回文件路径名
	 * @throws Exception
	 */
	@POST
	@Path("/upload-file-ext")
	public String upload(@Multipart("file") File file,@MatrixParam("metaMap") @XmlJavaTypeAdapter(MapAdaptor.class) Map<String,String> metaMap,@MatrixParam("extName") String extName) throws Exception;
	
	/**
	 * 
	 * @param fileIn
	 * @param fileLength
	 * @param extName
	 * @param metaMap
	 * @return 返回文件路径名
	 * @throws Exception
	 */
	@POST
	@Path("/upload-file-stream")
	public String upload(@Multipart("fileIn") InputStream fileIn,@MatrixParam("fileLength") long fileLength,@MatrixParam("extName") String extName,@MatrixParam("metaMap") Map<String,String> metaMap) throws Exception;
	
	/**
	 * 
	 * @param fileName
	 * @return 删除成功返回true
	 * @throws Exception
	 */
	@DELETE
	@Path("/delete")
	public boolean delete(@MatrixParam("fileName") String fileName) throws Exception;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getURL/")
	public String getURL(@QueryParam("fileName") String fileName);
	
		
}
