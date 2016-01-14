package com.wocai.jrt.utils;

import java.io.File;
import java.io.FileOutputStream;

import com.lowagie.text.Image;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfStamper;

public class PdfUtils {
	/**
	 * 给pdf文件添加水印
	 * 
	 * @param InPdfFile
	 *            要加水印的原pdf文件路径
	 * @param outPdfFile
	 *            加了水印后要输出的路径
	 * @param markImagePath
	 *            水印图片路径
	 * @param pageSize
	 *            原pdf文件的总页数（该方法是我当初将数据导入excel中然后再转换成pdf所以我这里的值是用excel的行数计算出来的，
	 *            如果不是我这种可以 直接用reader.getNumberOfPages()获取pdf的总页数）
	 * @throws Exception
	 */
	public static String addPdfMark(String contactPath, String[] images, String productBriefName)
			throws Exception {
		// 用户（投资人）各自合并签名后的合同路径
		String userContactPath = MyFileUtils.getFilePath(productBriefName + "合同.pdf",
				MyFileUtils.PDF_TYPE);

		PdfReader reader = new PdfReader(contactPath, "PDF".getBytes());

		PdfStamper stamp = new PdfStamper(reader, new FileOutputStream(userContactPath));

		Image leftImg = Image.getInstance(images[0]);// 插入水印

		leftImg.setAbsolutePosition(130, 100);

		Image rightImg = Image.getInstance(images[1]);// 插入水印

		rightImg.setAbsolutePosition(380, 100);

		PdfContentByte under = stamp.getUnderContent(reader.getNumberOfPages());
		under.addImage(leftImg);
		under.addImage(rightImg);

		stamp.close();// 关闭

		// File tempfile = new File(InPdfFile);
		//
		// if (tempfile.exists()) {
		//
		// // tempfile.delete();
		// }

		return userContactPath;

	}

	public static void main(String[] args) throws Exception {
		String[] images = { "d:\\产品2 (1).jpg", "d:\\产品2 (1).jpg" };
		String contactPath = "D:\\POS测试基金1合同.pdf";
		String productBriefName = "test";
		
		String path = PdfUtils.addPdfMark(contactPath, images, productBriefName);
		System.out.println(path);
	}

}
