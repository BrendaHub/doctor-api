package com.doctor330.cloud.api.controller.news;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.doctor330.cloud.api.controller.common.BaseController;
import com.doctor330.cloud.constants.Constants;
//import com.doctor330.cloud.server.news.NewsService;

import io.swagger.annotations.ApiOperation;

@Controller
@WebAppConfiguration
@RequestMapping(value = "/bg/news", produces = "application/json;charset=UTF-8")
public class NewsController extends BaseController {

//	@Autowired
//	private NewsService newsService;
//
//	@ApiOperation(value = "getNews", notes = "获取资讯列表", tags = { Constants.INTERFACE_NEWS_NAME })
//	@ResponseBody
//	@RequestMapping(value = "/getNews", method = RequestMethod.POST)
//	public String getNews() {
//
//		String newsData = newsService.getNewsList();
//
//		Object newObjectData = JSON.parse(newsData);
//		return getBinggouJsonObject("获取资讯列表成功！", 200, true, newObjectData);
//	}
//
//	@ApiOperation(value = "getNewsDetail", notes = "获取资讯详情", tags = { Constants.INTERFACE_NEWS_NAME })
//	@ResponseBody
//	@RequestMapping(value = "/getNewsDetail", method = RequestMethod.POST)
//	public String getNewsDetail(@RequestParam("newsId") String newsId) {
//
//		if (!checkStringIfExit(newsId)) {
//			return getBinggouJsonObject("资讯ID不能为空", 404, false, "");
//		}
//
//		String newsStringData = newsService.getNewsDetail(newsId);
//		Object newObjectData = JSON.parse(newsStringData);
//		return getBinggouJsonObject("获取资讯详情成功！", 200, true, newObjectData);
//	}
//
//	@ApiOperation(value = "getNewsComments", notes = "根据资讯ID获取评论列表", tags = { Constants.INTERFACE_NEWS_NAME })
//	@ResponseBody
//	@RequestMapping(value = "/getNewsComments", method = RequestMethod.POST)
//	public String getNewsComments(@RequestParam(value = "newsId") String newsId) {
//		if (!checkStringIfExit(newsId)) {
//			return getBinggouJsonObject("资讯ID不能为空", 404, false, "");
//		}
//		String newsStringData = newsService.getNewsComments(newsId);
//		Object newObjectData = JSON.parse(newsStringData);
//		return getBinggouJsonObject("获取评论成功！", 200, true, newObjectData);
//	}

}
