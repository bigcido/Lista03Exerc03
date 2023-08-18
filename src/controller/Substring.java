package controller;

public class Substring {

	public Substring() {
		super();
	}
	public  String contrario(String str) {
		if (str.length () == 1) {
			return str;
		} else {
			return contrario(str.substring(1)) + str.charAt(0);
		}
	}
}
