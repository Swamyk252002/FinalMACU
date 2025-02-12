package com.automation.utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	//Screenshot, alerts, frames , windows , sync issue, JavaScript
	public static String captureScreenShot(WebDriver driver) {
		
		File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenshotPath=System.getProperty("user.dir")+"/Screenshots/FreeCRM_"+getCurrentDateTime() +".png";
		try {
			
			//FileHandler.copy(src, new File("./Screenshots/Login.png"));
			//FileHandler.copy(src, new File("./Screenshots/MACU"+getCurrentDateTime() +".png"));
			
			FileHandler.copy(src, new File(screenshotPath));
			System.out.println("Screenshot Captured");
			
		} catch (Exception e) {
			
			System.out.println("Unable to Capture Screenshot"+e.getMessage());
			
		}
		return screenshotPath;
		
	}
	public static  String getCurrentDateTime() {
		
		
		DateFormat customformat= new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate= new Date();
		
		
		return customformat.format(currentDate);
	}
    public void handeFrame() {
		
	}
    public void handle() {
	
    }

}
