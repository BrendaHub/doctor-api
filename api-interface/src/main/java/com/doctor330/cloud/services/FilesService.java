package com.doctor330.cloud.services;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.multipart.MultipartFile;


public interface FilesService {
	
	/**
	 *  图片上传
	 */
	public List<String> getImagesUpload(HttpServletRequest request) throws Exception;

}
