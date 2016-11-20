package com.doctor330.cloud.api.controller.common;

import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;


/**
 * <p>
 * Title: BaseAction
 * </p>
 * <p>
 * Description:front-web
 * </p>
 * <p>
 * Package:com.binggou.spider.front.action.common
 * </p>
 * 
 * @author chenhj(brenda)
 * @date 2016年7月28日 上午11:33:58
 * @tag
 */
public class BaseController{

	protected HttpServletRequest request;
	protected HttpServletResponse response;

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

	/**
	 * 专门做 pageNo ,pageSize 的回工处理，返回处理后的pageNo 数
	 * 
	 * @return
	 */
	protected Integer processPageParam(String pageNo, String _pageSize, int defaultPageSize) {
		int beginNo = 0;
		// 处理参数格式
		if (StringUtils.isBlank(pageNo))
			pageNo = StringUtils.isBlank(pageNo) ? "1" : pageNo;// 第几页
		String pageSizestr = StringUtils.isBlank(_pageSize) ? defaultPageSize + "" : _pageSize;// request.getParameter("pageSize");//
																								// 条数
		Integer pageSize = defaultPageSize;
		beginNo = Integer.valueOf(pageNo) > 1 ? pageSize * (Integer.valueOf(pageNo) - 1) : 0;
		return beginNo;
	}

	/**
	 * Action 中获取cookie的value值
	 * 
	 * @param key
	 *            cookie的键
	 * @return cookie 的值
	 */
	protected String getCookieValue(String key) {
		Cookie[] cookies = request.getCookies();
		if (cookies == null)
			return null;
		String value = null;
		for (Cookie c : cookies) {
			if (c.getName().equals(key)) {
				value = c.getValue();
			}
		}
		return value;
	}

	
	/**
	 * 检查个人中心下，某个功能操作与项目/需求不同状态 的拦截关系
	 * @param id   主键值 
	 * @param flag  project/demand 表示项目、需求
	 * @operationkey   当前操作的key ,
	 * @return
	 */
	public Map<String, Object> selectCurBizPublishStatus(Integer id, String flag){
		
		return null;
	}

	
	/**
	 * 封装返回的JSON数据
	 * 
	 * @param desc
	 *            状态描述
	 * @param statusCode
	 *            状态码
	 * @param isSuccess
	 *            是否成功
	 * @param data
	 *            数据
	 * @return
	 */
	public String getBinggouJsonObject(String desc, Integer statusCode, Boolean isSuccess, 
			Object data) {

		BinggouJsonObject binggouJsonObject = new BinggouJsonObject();
		if (desc != null && !"".equals(desc)) {
			binggouJsonObject.setDesc(desc);
		}
		if (statusCode != null) {
			binggouJsonObject.setStatusCode(statusCode);
		}
		if (isSuccess != null) {
			binggouJsonObject.setIsSuccess(isSuccess);
		}
		/*if (userId != null) {
			binggouJsonObject.setUserId(userId);
		}*/
		if (data != null) {
			binggouJsonObject.setData(data);
		}
		return JSON.toJSONString(binggouJsonObject);
	}
	
	/**
	 * 字符串
	 * 
	 * @param parameter
	 * @return
	 */
	protected Boolean checkStringIfExit(String parameter) {
		if (parameter == null || "".equals(parameter))
			return false;
		else
			return true;
	}

	
}
