/**
 * ENTEREZA API
 */
package com.example.file_upload.beans;

public class ResponsePdfBean {

	private String pdf;
	
	private EnterezaBean entereza;

	public String getPdf() {
		return pdf;
	}

	public void setPdf(String pdf) {
		this.pdf = pdf;
	}

	public EnterezaBean getEntereza() {
		return entereza;
	}

	public void setEntereza(EnterezaBean entereza) {
		this.entereza = entereza;
	}
}
