package com.doctor330.cloud.api.controller.files;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.doctor330.cloud.api.controller.common.BaseController;
import com.doctor330.cloud.constants.Constants;
import com.doctor330.cloud.services.FilesService;
import com.doctor330.cloud.util.StringUtils;

import io.swagger.annotations.ApiOperation;

@Controller
@WebAppConfiguration
@RequestMapping(value = "/bg/files", produces = "application/json;charset=UTF-8")
public class FilesController extends BaseController {

	@Autowired
	@Qualifier("filesService")
	FilesService filesService;

	@ApiOperation(value = "getImagesUpload", notes = "图片上传", tags = { Constants.INTERFACE_FILES_NAME })
	@ResponseBody
	@RequestMapping(value = "/getImagesUpload", method = RequestMethod.POST)
	public String getImagesUpload(HttpServletRequest request) {

		List<String> newsStringData = null;
		try {
			newsStringData = filesService.getImagesUpload(request);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return getBinggouJsonObject("文件上传成功！", 200, true, newsStringData);

	}

}
