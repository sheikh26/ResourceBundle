package com.galaxy.resources;

import java.util.Locale;
import java.util.ResourceBundle;

public class InternationalizationDemo {
	public static void main(String[] args) {

		// english US
		ResourceBundle bundle = ResourceBundle.getBundle("com.galaxy.resources.MessageBundle_en_US");
		System.out.println("Message in " + Locale.US + ": " + bundle.getString("greeting"));

//Hindi India

		bundle = ResourceBundle.getBundle("com.galaxy.resources.MessageBundle_in_ID");
		System.out.println("Message in हिंदी  " + bundle.getString("greeting"));

	}
}