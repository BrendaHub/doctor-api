package com.doctor330.cloud.news;

/**
 * @author  郑源
 * @date 创建时间：2016年3月7日 下午8:32:20 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return 
 */

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;

public class GetNewsMessageTest {

	public static void main(String[] args) throws Exception {
		
		System.out.println(System.currentTimeMillis());

		//	PostMethod postMethod = new PostMethod("http://192.168.1.11:8083/ApiControl?method=app.getAllCategorys");
		PostMethod postMethod = new PostMethod("http://192.168.1.11:8084/news/getNewsDetail");
	//	PostMethod postMethod = new PostMethod("http://192.168.1.213:8311/ApiControl?method=app.getAllCategorys");
	
//		postMethod.addParameter("bindid", TestConstants.BINDID_DEVELOP_ANDROID);
//		postMethod.addParameter("token", TestConstants.TOKEN_DEVELOP_ANDROID);
		postMethod.addParameter("newsId", "f5d030e8a9c8431d8dfdfd881f4b1f8e");
		
		
		HttpClient client = new HttpClient();
		client.setConnectionTimeout(1000 * 60);
		int status = 0;
		try {
			status = client.executeMethod(postMethod);
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (status == HttpStatus.SC_OK) {
			makeResponseObject(postMethod.getResponseBodyAsString());
		} else {
		}
		postMethod.releaseConnection();
	}
	// 根据HTTP请求后返回的字串生成结果封装类的实例
	private static void makeResponseObject(String sResponse) {
		System.out.println("-------------------" + sResponse);
		System.out.println("-------------------");
		String regExNums = "<TD\\s*style=\"FONT-SIZE:\\s*9pt;\\s*COLOR:\\s*#000000;\\s*WORD-WRAP:\\s*break-word\"\\s*vAlign=center\\s*bgColor=#f4f5f6\\s*height=30>\\s*共有记录\\s*(\\d+)\\s*条\\s* \\s*</TD>";
		String regExData = "<TR>\\s*<TD\\s*style=\"FONT-SIZE:\\s*9pt;\\s*WORD-WRAP:\\s*break-word\"\\s*(?:align=left)?\\s*bgColor=#\\S+\\s*>([\\s\\S]*?)</TR>";
		String regExPage = "<TD\\s*style=\"FONT-SIZE:\\s*9pt;\\s*COLOR:\\s*#000000;\\s*WORD-WRAP:\\s*break-word\"\\s*vAlign=center\\s*bgColor=#f4f5f6\\s*height=30>\\s*<A\\s*href=\"(.*)\">(?:上页|下页)</A>";
	}

}
