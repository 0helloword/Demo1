package com.oc.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComElement {
	
	  private static WebElement element;
	
	 public static WebElement NextPage(WebDriver driver){
	        element = driver.findElement(By.linkText("下一页"));//下一页按键
	        return element;
	    }
	
	    public static WebElement PreviousPage(WebDriver driver){
	        element = driver.findElement(By.linkText("上一页"));//上一页按键
	        return element;
	    }
	
	    public static WebElement FirstPage(WebDriver driver){
	        element = driver.findElement(By.linkText("第一页"));//第一页按键
	        return element;
	    }
	    
	    public static WebElement LastPage(WebDriver driver){
	        element = driver.findElement(By.linkText("最后一页"));//最后一页按键
	        return element;
	    }
	    
	    public static WebElement Go(WebDriver driver){
	        element = driver.findElement(By.linkText("go"));//go按键
	        return element;
	    }
	    
	    public static WebElement PageInput(WebDriver driver){
	        element = driver.findElement(By.id("pageInput"));//输入页码
	        return element;
	    }
	    
	    public static WebElement table(WebDriver driver){
	        element = driver.findElement(By.xpath("//table"));//表格记录
	        return element;
	    }
	    
}
