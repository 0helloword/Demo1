package com.oc.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManualAuditPage {
	 private static WebElement element;
	    
	    public static WebElement QueryButton(WebDriver driver){
	        element = driver.findElement(By.id("autoGetLnApp"));//获取工单按键
	        return element;
	    }
}
