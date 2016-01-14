package com.wocai.jrt.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;

public class WPS2PDFUtils {
	private static final Logger LOGGER = LoggerFactory.getLogger(WPS2PDFUtils.class);

	public static void word2PDF(String inputFile, String pdfFile) {
		ActiveXComponent app = null;
		Dispatch doc = null;

		try {
			// 打开word应用程序
			app = new ActiveXComponent("KWPS.Application");

			// 设置word不可见，否则会弹出word界面
			app.setProperty("Visible", false);

			// 获得word中所有打开的文档,返回Documents对象
			Dispatch docs = app.getProperty("Documents").toDispatch();

			// 调用Documents对象中Open方法打开文档，并返回打开的文档对象Document
			doc = Dispatch.call(docs, "Open", inputFile, false, true).toDispatch();

			// 调用Document对象的SaveAs方法，将文档保存为pdf格式
			Dispatch.call(doc, "ExportAsFixedFormat", pdfFile, 17 // word保存为pdf格式
			);

		} catch (Throwable e) {
			LOGGER.error("convert word 2 pdf error, msg = [{}]", e.getMessage());
		} finally {
			if (null != doc) {

				// 关闭文档
				Dispatch.call(doc, "Close", false);
			}

			if (null != app) {

				// 关闭word应用程序
				app.invoke("Quit", 0);
			}
		}
	}

	public static void main(String[] args) {
		word2PDF("F:\\contact\\test.docx", "F:\\contact\\lin.pdf");
	}
}
