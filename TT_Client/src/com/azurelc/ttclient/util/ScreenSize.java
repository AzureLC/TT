package com.azurelc.ttclient.util;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ScreenSize {
	
	private static Dimension dimension;
	
	public static Dimension getScreenSize(){
		if(dimension == null){
			dimension = new Dimension();
			int width = Toolkit.getDefaultToolkit().getScreenSize().width;
			int height = Toolkit.getDefaultToolkit().getScreenSize().height;
			dimension.setSize(width, height);;
		}
		return dimension;
	}
}
