package com.itsw.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.itsw.util.CustomOutput;

public class EclipseApplication {

	private static Logger logger = LoggerFactory.getLogger(EclipseApplication.class);

	public static void main(String[] args) {

		logger.info("start");

		// TODO 自動生成されたメソッド・スタブ
        System.out.println("Hello Artifactory Application.");

        CustomOutput output = new CustomOutput();
        output.setText("OK");
    	System.out.println( output.toString() );

		logger.info("end");

	}

}
