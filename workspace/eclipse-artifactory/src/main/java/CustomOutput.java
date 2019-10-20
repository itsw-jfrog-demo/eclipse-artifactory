package com.itsw.util;
/**
 * @author itsw
 *
 */
public class CustomOutput {

	private String text;

	@Override
	public String toString() {
		return "CustomOutput ["+ this.text + "]";
	}


	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
