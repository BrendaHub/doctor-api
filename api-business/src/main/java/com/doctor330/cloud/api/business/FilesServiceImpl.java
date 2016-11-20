package com.doctor330.cloud.api.business;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Service;

import com.doctor330.cloud.constants.ConfigConstants;
import com.doctor330.cloud.services.FilesService;

@Service("filesService")
public class FilesServiceImpl implements FilesService {

	@Override
	public List<String> getImagesUpload(HttpServletRequest request) throws Exception {
		
		List<String> filePathList = new ArrayList<String>();
		String sep = File.separator;
		String path = ConfigConstants.ROOT_URL+ConfigConstants.PICTURE_USER_TEMP_PICTURE+sep+"";
		/*String path ="e:\\upload\\";*/
		
		FileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		List<FileItem> items = new ArrayList<FileItem>();
		items = upload.parseRequest(request);
		System.out.println("-----------------"+ items);
		Iterator<FileItem> it = items.iterator();
		while (it.hasNext()) { 
			FileItem fItem = (FileItem) it.next();
			if (!fItem.isFormField()) {
				FileOutputStream fs = null;
				InputStream inStream = null;
				int byteread = 0;
				inStream = fItem.getInputStream();
				File targetFile = new File(path);
				if (!targetFile.exists()) {
					targetFile.mkdirs();
				}
				// 获取上传文件的值
				String imgName = fItem.getFieldName();
				inStream = fItem.getInputStream();
				SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmssms");
				Date date = new Date();
				String fileName = sf.format(date)+"_"+ fItem.getName();
				fs = new FileOutputStream(path+fileName);
				byte[] buffer = new byte[1444];
				while ((byteread = inStream.read(buffer)) != -1) {
					fs.write(buffer, 0, byteread);
				}
				if (inStream != null) {
					inStream.close();
				}
				if (fs != null) {
					fs.close();
				}
				filePathList.add(path+fileName);
			}
		}
		return filePathList;

	}
}
