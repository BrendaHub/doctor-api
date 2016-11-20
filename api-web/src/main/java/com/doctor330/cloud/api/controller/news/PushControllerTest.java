package com.doctor330.cloud.api.controller.news;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.doctor330.cloud.api.controller.common.BaseController;
import com.doctor330.cloud.constants.Constants;
//import com.doctor330.cloud.server.message.IMessageService;

import io.swagger.annotations.ApiOperation;

@Controller
@WebAppConfiguration
@RequestMapping(value = "/bg/push", produces = "application/json;charset=UTF-8")
public class PushControllerTest extends BaseController {

//	@Autowired
//	IMessageService imessageService;

	@ApiOperation(value = "pushMessage", notes = "向单个用户推送透传消息", tags = { Constants.INTERFACE_PUSH_NAME })
	@ResponseBody
	@RequestMapping(value = "/pushMessage", method = RequestMethod.POST)
	public String pushMessage(@RequestParam(value = "userId", required = false) String userId,
			@RequestParam("transmissionContent") String transmissionContent,
			@RequestParam("transmissionType") String transmissionType,
			@RequestParam("offlineExpireTime") String offlineExpireTime) {
		Boolean pushMessageToSingleUser = true;//imessageService.pushMessageToSingleUser(Integer.parseInt(userId),
			//	transmissionContent, Integer.parseInt(transmissionType), Integer.parseInt(offlineExpireTime));
		if (pushMessageToSingleUser) {
			return getBinggouJsonObject("向单个用户推送透传消息成功！", 200, true, null);
		} else {
			return getBinggouJsonObject("向单个用户推送透传消息失败！", 201, false, null);
		}

	}

}
