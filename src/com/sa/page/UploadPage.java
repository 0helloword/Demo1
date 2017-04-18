package com.sa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadPage {
	   private static WebElement element;
	    
	    public static WebElement appid(WebDriver driver){
	        element = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/div/div[2]/div/div/div/div/p/strong"));//获取订单编号
	        return element;
	    }
	    
	    public static WebElement uploadbutton(WebDriver driver){
	        element = driver.findElement(By.xpath("//input[9]"));//获取第一个上传按键id
	        return element;
	    }
	    
	    public static WebElement next(WebDriver driver){
	        element = driver.findElement(By.cssSelector("button.btn.blue-madison"));//下一步
	        return element;
	    }
	    
}
