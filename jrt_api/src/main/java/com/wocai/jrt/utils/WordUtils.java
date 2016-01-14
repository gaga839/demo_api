package com.wocai.jrt.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.io.IOUtils;
import org.apache.poi.POIXMLDocument;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vteba.common.exception.BasicException;

/**
 * Word 2007的工具类
 * 
 * @author linbaolu
 * @date 2015年12月29日 下午2:33:02
 */
public class WordUtils {
	private static final Logger LOGGER = LoggerFactory.getLogger(WordUtils.class);

	/**
	 * 在docx文件中插入图片
	 * 
	 * @param docxFis
	 *            docx文件路径
	 * @param images
	 *            图片文件数组，文件是全路径
	 * @return XWPFDocument，docx文件
	 */
	public static XWPFDocument update(String docx, String[] images) {
		XWPFDocument document = createDocument(docx);
		update(document, images);
		return document;
	}

	/**
	 * 在docx文件中插入图片
	 * 
	 * @param docxFis
	 *            docx文件路径
	 * @param images
	 *            图片文件数组，文件是全路径
	 * @param fos
	 *            修改后的word docx文件流
	 */
	public static void update(String docx, String[] images, FileOutputStream fos) {
		XWPFDocument document = createDocument(docx);
		update(document, images);
		try {
			document.write(fos);
		} catch (IOException e) {
			LOGGER.error("Copy document, IO Exception，msg=[{}].", e.getMessage());
		}
	}

	/**
	 * 在docx文件中插入图片
	 * 
	 * @param docxFis
	 *            docx文件流
	 * @param images
	 *            图片文件数组，文件是全路径
	 * @param fos
	 *            修改后的word docx文件流
	 */
	public static void update(FileInputStream docxFis, String[] images, FileOutputStream fos) {
		XWPFDocument document = createDocument(docxFis);
		update(document, images);
		try {
			document.write(fos);
		} catch (IOException e) {
			LOGGER.error("Copy document, IO Exception，msg=[{}].", e.getMessage());
		}
	}

	/**
	 * 在docx文件中插入图片
	 * 
	 * @param document
	 *            docx文件
	 * @param images
	 *            图片文件数组，文件是全路径
	 */
	public static void update(XWPFDocument document, String[] images) {
		XWPFParagraph paragraph = document.createParagraph(); // 创建段落
		XWPFRun run = paragraph.createRun(); // 在段落中添加片段

		for (String image : images) {
			int format = fileFormat(image);
			try {
				// run.setText(image); // 添加文字
				// run.addBreak(); // 换行

				run.addPicture(new FileInputStream(image), format, image, Units.toEMU(150),
						Units.toEMU(150));
			} catch (InvalidFormatException e) {
				LOGGER.error("Invalid File Format, msg=[{}].", e.getMessage());
			} catch (IOException e) {
				LOGGER.error("Add run image, IO Exception，msg=[{}].", e.getMessage());
			}
		}
	}

	/**
	 * 创建docx文件
	 * 
	 * @param docxFis
	 *            docx文件流
	 * @return XWPFDocument
	 */
	private static XWPFDocument createDocument(FileInputStream docxFis) {
		XWPFDocument doc = null;
		try {
			doc = new XWPFDocument(docxFis);
		} catch (IOException e) {
			LOGGER.error("IO Exception, msg=[{}].", e.getMessage());
			throw new BasicException("create XWPFDocument, IO Exception.", e);
		}
		return doc;
	}

	/**
	 * 创建docx文件
	 * 
	 * @param docxFis
	 *            docx文件路径
	 * @return XWPFDocument
	 */
	private static XWPFDocument createDocument(String docxPath) {
		XWPFDocument doc = null;
		try {
			FileInputStream fis = new FileInputStream(docxPath);
			doc = new XWPFDocument(fis);
		} catch (IOException e) {
			LOGGER.error("IO Exception, msg=[{}].", e.getMessage());
			throw new BasicException("create XWPFDocument, IO Exception.", e);
		}
		return doc;
	}

	/**
	 * 匹配文件类型
	 * 
	 * @param fileName
	 *            文件名
	 * @return 对应的图片常量
	 */
	private static int fileFormat(String fileName) {
		int format;
		if (fileName == null) {
			return -1000;
		}
		fileName = fileName.toLowerCase();
		if (fileName.endsWith(".emf")) {
			format = XWPFDocument.PICTURE_TYPE_EMF;
		} else if (fileName.endsWith(".wmf")) {
			format = XWPFDocument.PICTURE_TYPE_WMF;
		} else if (fileName.endsWith(".pict")) {
			format = XWPFDocument.PICTURE_TYPE_PICT;
		} else if (fileName.endsWith(".jpeg") || fileName.endsWith(".jpg")) {
			format = XWPFDocument.PICTURE_TYPE_JPEG;
		} else if (fileName.endsWith(".png")) {
			format = XWPFDocument.PICTURE_TYPE_PNG;
		} else if (fileName.endsWith(".dib")) {
			format = XWPFDocument.PICTURE_TYPE_DIB;
		} else if (fileName.endsWith(".gif")) {
			format = XWPFDocument.PICTURE_TYPE_GIF;
		} else if (fileName.endsWith(".tiff")) {
			format = XWPFDocument.PICTURE_TYPE_TIFF;
		} else if (fileName.endsWith(".eps")) {
			format = XWPFDocument.PICTURE_TYPE_EPS;
		} else if (fileName.endsWith(".bmp")) {
			format = XWPFDocument.PICTURE_TYPE_BMP;
		} else if (fileName.endsWith(".wpg")) {
			format = XWPFDocument.PICTURE_TYPE_WPG;
		} else {
			LOGGER.error("Invalid File Format, file=[{}].", fileName);
			throw new BasicException("Unsupported picture: " + fileName
					+ ". Expected emf|wmf|pict|jpeg|png|dib|gif|tiff|eps|bmp|wpg");
		}
		return format;
	}

	public static String insertImage2Docx(String contactPath, String[] images,
			String productBriefName) throws IOException {

		// 用户（投资人）各自合并签名后的合同路径
		String userContactPath = MyFileUtils.getFilePath(productBriefName + "合同.docx",
				MyFileUtils.DOC_TYPE);
		FileOutputStream fos = new FileOutputStream(userContactPath);
		update(contactPath, images, fos);
		fos.flush();
		IOUtils.closeQuietly(fos);

		return userContactPath;
	}

	public static void searchAndReplace(String srcPath, String destPath, Map<String, String> map)
			throws Exception {
		XWPFDocument document = new XWPFDocument(POIXMLDocument.openPackage(srcPath));

		// 替换段落中的指定文字
		Iterator<XWPFParagraph> itPara = document.getParagraphsIterator();
		while (itPara.hasNext()) {
			XWPFParagraph paragraph = (XWPFParagraph) itPara.next();
			// String s = paragraph.getParagraphText();
			replace(paragraph, map);
		}

		// 替换表格中的指定文字
		Iterator<XWPFTable> itTable = document.getTablesIterator();
		while (itTable.hasNext()) {
			XWPFTable table = (XWPFTable) itTable.next();
			int rcount = table.getNumberOfRows();
			for (int i = 0; i < rcount; i++) {
				XWPFTableRow row = table.getRow(i);
				List<XWPFTableCell> cells = row.getTableCells();
				for (XWPFTableCell cell : cells) {
					for (Entry<String, String> e : map.entrySet()) {
						String text = cell.getText();
						if (text != null && text.indexOf(e.getKey()) > -1) {
							List<XWPFParagraph> pgs = cell.getParagraphs();
							for (int ii = 0; ii < pgs.size(); ii++) {
								XWPFParagraph p = pgs.get(ii);
								replace(p, map);
							}
						}
					}
				}
			}
		}

		FileOutputStream outStream = null;
		outStream = new FileOutputStream(destPath);
		document.write(outStream);
		outStream.close();
	}

	private static void replace(XWPFParagraph paragraph, Map<String, String> map)
			throws InvalidFormatException, FileNotFoundException, IOException {
		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			List<XWPFRun> runList = paragraph.getRuns();
			for (int i = 0; i < runList.size(); i++) {
				XWPFRun run = runList.get(i);
				String text = run.getText(run.getTextPosition());

				// System.out.println(text);
				if (text != null && text.indexOf(key) > -1) {
					if ("Amount".equals(key) && text.indexOf("AmountToCN") > -1) {
						continue;
					}
					
					if (!"InvestorSignName".equals(key)) {
						/**
						 * 参数0表示生成的文字是要从哪一个地方开始放置,设置文字从位置0开始 就可以把原来的文字全部替换掉了
						 * */

						text = text.replace(key, map.get(key));
						run.setText(text, 0);
					} else {
						String image = map.get(key);
						int format = fileFormat(image);
						// run.setText(image); // 添加文字
						// run.addBreak(); // 换行

						text = text.replace(key, "");
						run.setText(text, 0);

						run.addPicture(new FileInputStream(image), format, image, Units.toEMU(103),
								Units.toEMU(72));
					}
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		WordFormatter wf = new WordFormatter();
		wf.setContractNumber("ZJT201510200001");// 合同编号
		wf.setInvestorName("林保路");// 投资人姓名
		wf.setInvestorSignName("D:\\zjt_images\\order\\56a40aac2d9f16841a2691d.jpg");// 投资人签名
		wf.setSignTime("2015年10月20日");// 签单时间
		wf.setAmount("30000");// 投资金额
		wf.setIDCard("330327198911185243");// 证件号
		wf.setAddress("浙江省杭州市西湖区 天亿大厦1609室");// 通信地址
		wf.setPhone("15127839475");// 联系电话
		wf.setEmail("1239238374@qq.com");// 邮件
		wf.setBankName("招商银行");// 开户行
		wf.setAccountName("林保路");// 开户名
		wf.setBankAccount("662533473387273");// 银行帐（卡）号

		Field[] fields = wf.getClass().getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			String fieldValue = String.valueOf(field.get(wf));
			if (!"null".equals(fieldValue)) {
				map.put(field.getName(), fieldValue);
			} else {
				map.put(field.getName(), "");
			}
			System.out.println(field.getName() + ": " + fieldValue);
		}

		map.put("[", "");
		map.put("]", "");

		String srcPath = "F:\\合同调试\\test\\东融资本精选一号基金.docx";
		String destPath = "F:\\合同调试\\test\\_东融资本精选一号基金.docx";
		searchAndReplace(srcPath, destPath, map);

		WPS2PDFUtils.word2PDF(destPath, destPath.replace(".docx", ".pdf"));
	}
}
