package UtilsLayer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import BaseLayer.BaseClass;

public class HandleWindows extends BaseClass {

	public static ArrayList<String> handleWindowMethod(Set<String> allwindow) {
		Iterator<String> it = allwindow.iterator();
		ArrayList<String> arr = new ArrayList<String>();
		while (it.hasNext()) {
			arr.add(it.next().toString());
		}
		return arr;
	}

	public static String handleTwoWindow(String parentId, Set<String> allwindow) {

		for (String abc : allwindow) {
			if (!abc.equals(parentId)) {
				return abc;
			}
		}
		return null;
	}

	public static String handleThreeWindow(String parentId, String secondWindowId, Set<String> allwindow) {

		for (String abc : allwindow) {
			if (!((abc.equals(parentId)) || (abc.equals(secondWindowId)))) {
				return abc;
			}
		}
		return null;
	}

}
