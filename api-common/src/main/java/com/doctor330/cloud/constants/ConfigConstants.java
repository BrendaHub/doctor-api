package com.doctor330.cloud.constants;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * 公用常量类
 * 
 */
public abstract class ConfigConstants {



	// ========================上传图片、附件======================
	public static String CONTEXT_PATH_BUSINESS_CARD;

	// ========================上传图片、附件==============================================
	static {
		CONTEXT_PATH_BUSINESS_CARD="/app/web_site";
	}
	public static String CONTEXT_PATH;
	/**
	 * 域名,读取配置文件
	 */
	public static String DOMAIN_NAME = ReloadableConfig.getProperty("DOMAIN_NAME","");
	static {
		try {
			CONTEXT_PATH = new File(ConfigConstants.class.getResource("/").toURI().getPath()).getParentFile().getParentFile()
					.getCanonicalPath();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
	
	//------------------------图片路径------------------------
	/**
	 * 图片上传的根路径
	 */
	public static String UPLOAD_IMGE_FILE_PATH = ReloadableConfig.getProperty("DOMAIN_NAME","");
	/**
	 * 文件上传的根路径
	 */
	public static String UPLOAD_OTHER_FILE_PATH = ReloadableConfig.getProperty("UPLOAD_OTHER_FILE_PATH","");
	/**
	 * 项目需求图片上传的临时路径
	 */
	public static String PICTURE_USER_TEMP_PICTURE = ReloadableConfig.getProperty("PICTURE_USER_TEMP_PICTURE","");
	/**
	 * 头像
	 */
	public static String PICTURE_USER_HEADER_PICTURE = ReloadableConfig.getProperty("PICTURE_USER_HEADER_PICTURE","");
	/**
	 * 名片
	 */
	public static String PICTURE_USER_BUSINESSCARD_PICTURE = ReloadableConfig.getProperty("PICTURE_USER_BUSINESSCARD_PICTURE","");
	/**
	 * 项目图片
	 */
	public static String PICTURE_USER_PROJECT_PICTURE = ReloadableConfig.getProperty("PICTURE_USER_PROJECT_PICTURE","");
	/**
	 * 需求图片
	 */
	public static String PICTURE_USER_DEMAND_PICTURE = ReloadableConfig.getProperty("PICTURE_USER_DEMAND_PICTURE","");
	/**
	 * 图片访问域名1
	 */
	public static String PICTURE_WEB_SITE_P1 = ReloadableConfig.getProperty("PICTURE_WEB_SITE_P1","");
	/**
	 * 图片访问域名2
	 */
	public static String PICTURE_WEB_SITE_P2 = ReloadableConfig.getProperty("PICTURE_WEB_SITE_P2","");
	/**
	 * 图片访问域名3
	 */
	public static String PICTURE_WEB_SITE_P3 = ReloadableConfig.getProperty("PICTURE_WEB_SITE_P3","");
	/**
	 * 图片访问域名3
	 */
	public static String PICTURE_WEB_SITE_P4 = ReloadableConfig.getProperty("PICTURE_WEB_SITE_P4","");
	/**
	 * 系统静态文件的根路径
	 */
	public static String ROOT_URL = ReloadableConfig.getProperty("ROOT_URL","");
	/**
	 * 默认头像
	 */
	public static String HEADPIC_DEFAULT = ReloadableConfig.getProperty("HEADPIC_DEFAULT","");
	
	/**
	 * android的appkey
	 */
	public static String SECURITY_ANDROID_APPKEY = ReloadableConfig.getProperty("SECURITY_ANDROID_APPKEY","");
	/**
	 * ios的appkey
	 */
	public static String SECURITY_IOS_APPKEY = ReloadableConfig.getProperty("SECURITY_IOS_APPKEY","");
	
	/**
	 * 分隔符
	 */
	public static String DECOLLATOR = ReloadableConfig.getProperty("DECOLLATOR","");
	
	/**
	 * 默认封面
	 */
	public static String COVER_PICTURE_DEFAULT = ReloadableConfig.getProperty("COVER_PICTURE_DEFAULT","");
	/**
	 * APP错误日志android
	 */
	public static String APP_ERRORLOG_ANDROID = ReloadableConfig.getProperty("APP_ERRORLOG_ANDROID","");
	/**
	 * APP错误日志IOS
	 */
	public static String APP_ERRORLOG_IOS = ReloadableConfig.getProperty("APP_ERRORLOG_IOS","");
	/**
	 * APP错误日志android
	 */
	public static String COMPANY_LOGO = ReloadableConfig.getProperty("COMPANY_LOGO","");
	/**
	 * APP错误日志IOS
	 */
	public static String COMPANY_BUSINESS_LICENSE = ReloadableConfig.getProperty("COMPANY_BUSINESS_LICENSE","");
	/**
	 * 项目详情在微信分享链接地址
	 */
	public static final String WECHAT_SHARE_FOR_PROJECT = ReloadableConfig.getProperty("WECHAT_SHARE_FOR_PROJECT","");
	/**
	 * 需求详情在微信分享链接地址
	 */
	public static final String WECHAT_SHARE_FOR_DEMAND = ReloadableConfig.getProperty("WECHAT_SHARE_FOR_DEMAND","");
	/**
	 * 公司的相册目录
	 */
	public static final String COMPANY_ALBUM_PICTURE_PATH = ReloadableConfig.getProperty("COMPANY_ALBUM_PICTURE_PATH","");
	
	/**
	 * 公司的相册目录访问地址
	 */
	public static final String COMPANY_ALBUM_PICTURE_ACCESS_PATH = ReloadableConfig.getProperty("COMPANY_ALBUM_PICTURE_ACCESS_PATH","");
	
	/**
	 * 公司的相册主图访问地址
	 */
	public static final String COMPANY_ALBUM_MAIN_PICTURE_ACCESS_PATH_KEYWORD = ReloadableConfig.getProperty("COMPANY_ALBUM_MAIN_PICTURE_ACCESS_PATH_KEYWORD","");
	
	
	/**
	 * 投资人材料备用
	 */
	public static final String PICTURE_MATERIAL_PICTURE = "";
	
	/**
	 * 企业项目详情在微信分享链接地址
	 */
	public static final String COMPANY_SHARE_FOR_PROJECT = ReloadableConfig.getProperty("COMPANY_SHARE_FOR_PROJECT","");
	/**
	 * 企业需求详情在微信分享链接地址
	 */
	public static final String COMPANY_SHARE_FOR_DEMAND = ReloadableConfig.getProperty("COMPANY_SHARE_FOR_DEMAND","");
	
}
