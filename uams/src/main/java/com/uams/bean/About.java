package com.uams.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class About {

	private String name = "University Assignment Management System";
	private String version = "1.0";
	private String mfg = "2017";
	private String author = "Narendranath Panda";
	private static About instance = new About();
	 @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MMM-YYYY", timezone = "UTC")
	private Date date;

	private About() {
		date = new Date();
	}

	public static About instance() {
		instance.setDate(new Date());
		return instance;
	}

}
