package UtilsLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class JavaScriptMethods extends BaseClass {

	public static void get(String url) {
		((JavascriptExecutor) driver).executeScript("window.location='" + url + "';");
	}

	public static void newTab(String url) {
		((JavascriptExecutor) driver).executeScript("window.open('" + url + "');");
	}

	public static void refresh() {
		((JavascriptExecutor) driver).executeScript("history.go(0);");
	}

	public static void back(String step) {
		((JavascriptExecutor) driver).executeScript("history.go(-" + step + ")");
	}

	public static void forward(String step) {
		((JavascriptExecutor) driver).executeScript("history.go(+" + step + ")");
	}

	public static String getTitle() {
		return ((JavascriptExecutor) driver).executeScript("return document.title;").toString();
	}

	public static String getCurrrentUrl() {
		return ((JavascriptExecutor) driver).executeScript("return document.URL;").toString();
	}

	public static void click(WebElement wb) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", wb);
	}

	public static void sendKeys(WebElement wb, String value) {
		((JavascriptExecutor) driver).executeScript("arguments[0].value='" + value + "';", wb);
	}

	public static void scrollDown(WebElement wb) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", wb);
	}

	public static void alert(String value) {
		((JavascriptExecutor) driver).executeScript("alert('" + value + "');");
	}

	public static void confirm(String value) {
		((JavascriptExecutor) driver).executeScript("confirm('" + value + "');");
	}

	public static void prompt(String value) {
		((JavascriptExecutor) driver).executeScript("prompt('" + value + "');");
	}

}
