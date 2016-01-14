package com.wocai.jrt.utils;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.web.multipart.MultipartFile;

import com.vteba.utils.common.PropsUtils;
import com.vteba.utils.id.ObjectId;

public class MyFileUtils {
	public static final String FILE_PATH = PropsUtils.get("file.path");
	public static final String IMAGES_URL = PropsUtils.get("images.url");
	public static final String IMAGES_PREFIX = PropsUtils.get("images.prefix");
	public static final String IMAGE_TYPE = "images";
	public static final String DOC_TYPE = "docs";
	public static final String PDF_TYPE = "pdfs";
	public static final String VIDEO_TYPE = "videos";

	private MyFileUtils() {
	}

	public static String uploadFile(MultipartFile file, String fileType) throws IOException {
		// if (IMAGE_TYPE.equals(fileType)) {
		// file.transferTo(new File(IMAGES_URL + file.getOriginalFilename()));
		// return file.getOriginalFilename();
		// }

		String filePath = FILE_PATH + fileType;
		String[] _filePaths = { FILE_PATH, filePath };
		for (String s : _filePaths) {
			File _file = new File(s);
			if (!_file.exists()) {
				_file.mkdir();
			}
		}

		filePath += "/" + ObjectId.get().toString() + "/";
		new File(filePath).mkdir();

		// 转存文件
		filePath += file.getOriginalFilename();
		file.transferTo(new File(filePath));
		return filePath;
	}

	public static String uploadFile(MultipartFile file, String fileType, String suffix)
			throws IOException {
		// if (IMAGE_TYPE.equals(fileType)) {
		// file.transferTo(new File(IMAGES_URL +
		// file.getOriginalFilename()+suffix));
		// return file.getOriginalFilename()+suffix;
		// }

		String filePath = FILE_PATH + fileType;
		String[] _filePaths = { FILE_PATH, filePath };
		for (String s : _filePaths) {
			File _file = new File(s);
			if (!_file.exists()) {
				_file.mkdir();
			}
		}

		filePath += "/" + ObjectId.get().toString() + "/";
		new File(filePath).mkdir();

		// 转存文件
		filePath += file.getOriginalFilename() + suffix;
		file.transferTo(new File(filePath));
		return filePath;
	}

	public static void downloadFile(String filePath, HttpServletResponse response)
			throws IOException {
		String[] paths = filePath.replaceAll("\\\\", "/").split("/");
		String filename = paths[paths.length - 1];// 获取文件名称，在转化为子串
		File file = new File(filePath.replaceAll(filename, ""));
		if (file.isDirectory()) {
			file = file.listFiles()[0];
			filename = file.getName();
		}

		// File file = new File(filePath);
		// String filename = file.getName();

		response.setContentLength((int) file.length());
		response.setContentType("application/octet-stream; charset=utf-8");
		// response.setHeader告诉浏览器以什么方式打开
		// 假如文件名称是中文则要使用 URLEncoder.encode()编码
		// 否则直接使用response.setHeader("content-disposition",
		// "attachment;filename=" + filename);即可
		response.setHeader("content-disposition",
				"attachment;filename=" + URLEncoder.encode(filename, "UTF-8"));
		OutputStream out = response.getOutputStream();
		out.write(FileUtils.readFileToByteArray(file));
		out.flush();
	}

	public static String getFilePath(String fileName, String fileType) throws IOException {
		String filePath = FILE_PATH + fileType;
		String[] _filePaths = { FILE_PATH, filePath };
		for (String s : _filePaths) {
			File _file = new File(s);
			if (!_file.exists()) {
				_file.mkdir();
			}
		}

		filePath += "/" + ObjectId.get().toString() + "/";
		File userContactDir = new File(filePath);
		if (!userContactDir.exists()) {
			userContactDir.mkdir();
		}

		// 转存文件
		filePath += fileName;
		return filePath;
	}

	/**
	 * 这个是上传到图片服务器的方法
	 * 
	 * @param file
	 * @return
	 * @throws IOException
	 */
	public static String uploadImg(MultipartFile file, ImgType imgType) throws IOException {
		File imagesDir = new File(IMAGES_URL);
		if (!imagesDir.exists()) {
			imagesDir.mkdir();
		}

		String imgTypeString = imgType.toString().toLowerCase() + "/";
		File imgTypeDir = new File(IMAGES_URL + imgTypeString);
		if (!imgTypeDir.exists()) {
			imgTypeDir.mkdir();
		}

		String imgeName = ObjectId.get().toString() + "."
				+ file.getOriginalFilename().split("\\.")[1];
		String returnPath = imgTypeString + imgeName;
		file.transferTo(new File(IMAGES_URL + returnPath));
		return returnPath;
	}

	/**
	 * 这个是上传到图片服务器的方法,，加文件后缀
	 * 
	 * @param file
	 * @return
	 * @throws IOException
	 */
	public static String uploadImg(MultipartFile file, ImgType imgType, String suffix)
			throws IOException {
		File imagesDir = new File(IMAGES_URL);
		if (!imagesDir.exists()) {
			imagesDir.mkdir();
		}

		String imgTypeString = imgType.toString().toLowerCase() + "/";
		File imgTypeDir = new File(IMAGES_URL + imgTypeString);
		if (!imgTypeDir.exists()) {
			imgTypeDir.mkdir();
		}

		String imgeName = ObjectId.get().toString();
		String returnPath = imgTypeString + imgeName + suffix;
		file.transferTo(new File(IMAGES_URL + returnPath));
		return returnPath;
	}
	
	/**
	 * 删除文件夹
	 * 
	 * @return boolean
	 */
	public static void deleteFileDir(File file) {
		if (null == file) {
			return;
		}
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f : files) {
				deleteFileDir(f);
			}
		} else {
			file.delete();
		}
	}
	public static void main(String[] args) throws IOException {
		String filePath = "D:/jrt_file/images/55ee38dd3145573e476dadd/u=2680799347,2048700704&fm=21&gp=0.jpg";
		String[] paths = filePath.replaceAll("\\\\", "/").split("/");
		String filename = paths[paths.length - 1];// 获取文件名称，在转化为子串
		File file = new File(filePath);
	}
}
