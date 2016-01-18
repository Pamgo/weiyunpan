package com.yunpan.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import com.yunpan.util.StringHelper;

/**
 * 格式化时间戳
 * @author pamgo
 *
 */
public class FormatTimeTag extends SimpleTagSupport {
	private long timestamp;
	private String format;
	
	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = this.getJspContext().getOut();
		out.println(StringHelper.getDateByTimeStamp(timestamp, format));
	}
	
	
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
}
