/**
 * ENTEREZA API
 */
package com.example.file_upload.utils;

public enum ConstantesErroresPdf {

	CONST_COD_OK("COD200"),
	CONST_COD_KO("COD500");



	private String value;


	ConstantesErroresPdf(String value){
		this.value = value;
	}


	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}


	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
	
	
	
	
	
	
	

}
