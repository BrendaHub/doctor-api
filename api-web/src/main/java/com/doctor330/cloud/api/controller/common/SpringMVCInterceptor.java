package com.doctor330.cloud.api.controller.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;


public class SpringMVCInterceptor implements HandlerInterceptor {
//
//	@Autowired
//	IRedisService redisService;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		response.setHeader("Content-type", "application/json;charset=UTF-8"); 
		String requestMethord = request.getQueryString();
		if(checkRequestMethord(requestMethord)){
			return true;
		}
		if(request.getParameter("sign")==null){
			String clientToken =  request.getParameter("token");
			String bindId = request.getParameter("bindid");
			
			Boolean checkTokenResult = true;//checkToken(clientToken,bindId);
			if(checkTokenResult){
				return true;
			}
		}
		BinggouJsonObject binggouJsonObject = new BinggouJsonObject();
		binggouJsonObject.setData("");
		binggouJsonObject.setDesc("访问异常，请重新启动应用！");
		binggouJsonObject.setIsSuccess(false);
		binggouJsonObject.setStatusCode(200);
		response.getWriter().write(JSON.toJSONString(binggouJsonObject));
		return false;
	}


	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
	}

	private boolean checkRequestMethord(String requestMethord) {
		return false;
	}

//	private Boolean checkToken(String clientToken,String bindId){
//
//		if("888888".equals(redisService.getRedisValueByKey("binggou")))
//			return true;
//		if(bindId == null || "".equals(bindId))
//			return false;
//		String serverToken =  redisService.getRedisValueByKey(bindId);
//		if(serverToken == null || clientToken==null)
//			return false;
//		if(!clientToken.equals(serverToken)){
//			return false;
//		}
//		return true;
//	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
	}


}
