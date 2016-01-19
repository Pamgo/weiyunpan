package com.yunpan.dao.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.yunpan.dao.IHandleXMLFileDao;
import com.yunpan.entity.FileLimit;

/**
 * 处理xml文件类
 * 
 * @author pamgo
 * 
 */
public class HandleXMLFileDaoImpl implements IHandleXMLFileDao {

	/**
	 * 创建document对象
	 * 
	 * @param is
	 * @return
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws IOException
	 */
	public static Document getDocument(String path) throws ParserConfigurationException,
			SAXException, IOException {
		// (暴露一个问题，就是不能立即刷新xml文件信息
		// 因为获得是编译后的文件信息，所以有缓存的过程，需要刷新才能重新加载)
		//InputStream input = HandleXMLFileDaoImpl.class.getClassLoader().getResourceAsStream("filelimit.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = factory.newDocumentBuilder();
		Document document = db.parse(path);
		return document;
	}

	/**
	 * 解析为FileLimit
	 * 
	 * @return
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws IOException
	 */
	@Override
	public List<FileLimit> parseXMLtoLimit(String path)
			throws ParserConfigurationException, SAXException, IOException {
		Document document = HandleXMLFileDaoImpl.getDocument(path);
		List<FileLimit> files = new ArrayList<FileLimit>();
		Element element = document.getDocumentElement();
		NodeList nodes = element.getElementsByTagName("limit");
		// Element limitElement = (Element)nodes.item(0);
		for (int i = 0; i < nodes.getLength(); i++) { // 可以不用循环
			Element limitElement = (Element) nodes.item(i);
			FileLimit fileList = new FileLimit();
			fileList.setId(Integer.parseInt(limitElement.getAttribute("id"))); // 把id值设置到FileLimit对象中
			NodeList childNodes = limitElement.getChildNodes();
			for (int j = 0; j < childNodes.getLength(); j++) {
				Node node = childNodes.item(j);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					if ("fileSize".equals(node.getNodeName())) { // 上传文件大小
						fileList.setFileSize(node
								.getFirstChild().getNodeValue());
					} else if ("allfileSize".equals(node.getNodeName())) { // 所有文件大小
						fileList.setAllfileSize(node
								.getFirstChild().getNodeValue());
					} else if ("allowType".equals(node.getNodeName())) { // 允许上传类型
						fileList.setFileType(node.getFirstChild()
								.getNodeValue());
					} else if ("bannedType".equals(node.getNodeName())) { // 禁止上传类型
						fileList.setDeniedType(node.getFirstChild()
								.getNodeValue());
					}
				}
			}
			files.add(fileList);

		}
		return files;
	}

	/**
	 * 更新配置信息
	 * 
	 * @throws IOException
	 * @throws SAXException
	 * @throws ParserConfigurationException
	 * @throws TransformerException
	 */
	@Override
	public void updateFileLimit(long fileSize, long allfileSize,
			String allowType, String bannedType,String path)
			throws ParserConfigurationException, SAXException, IOException,
			TransformerException {

		Document document = HandleXMLFileDaoImpl.getDocument(path);
		Element element = document.getDocumentElement();
		NodeList nodes = element.getElementsByTagName("limit");
		// Element limitElement = (Element)nodes.item(0);
		for (int i = 0; i < nodes.getLength(); i++) { // 可不用循环
			Element limitElement = (Element) nodes.item(i);
			NodeList childNodes = limitElement.getChildNodes();
			for (int j = 0; j < childNodes.getLength(); j++) {
				Node node = childNodes.item(j);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					if ("fileSize".equals(node.getNodeName())) { // 上传文件大小
						node.getFirstChild().setTextContent(fileSize+"");
					} else if ("allfileSize".equals(node.getNodeName())) { // 所有文件大小
						node.getFirstChild().setTextContent(allfileSize+"");
					} else if ("allowType".equals(node.getNodeName())) { // 允许上传类型
						node.getFirstChild().setTextContent(allowType);
					} else if ("bannedType".equals(node.getNodeName())) { // 禁止上传类型
						node.getFirstChild().setTextContent(bannedType);
					}
				}
			}
		}
		// 重新解析为xml文件
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer tfer = tf.newTransformer();
		DOMSource dsource = new DOMSource(document);
		File file = new File(path);
		FileOutputStream out = new FileOutputStream(file);
		out.flush();
		StreamResult sr = new StreamResult(out);
		tfer.transform(dsource, sr);
		out.close();
	}
}
