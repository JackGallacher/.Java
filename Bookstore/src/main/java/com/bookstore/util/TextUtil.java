package com.bookstore.util;

public class TextUtil {
	public String sanitize(String textToSanitize) {
		return textToSanitize.replaceAll("\\s+", " ");//replaces all double and above spaced with a single space.
	}
}
