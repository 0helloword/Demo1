package com.oc.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExpertAllotPage {
	 private static WebElement element;
	    
	    public static WebElement QueryButton(WebDriver driver){
	        element = driver.findElement(By.cssSelector("button.btn.blue-madison"));//查询按键
	        return element;
	    }
	    
	    public static WebElement ResetButton(WebDriver driver){
	        element = driver.findElement(By.cssSelector("button.btn.red-pink"));//重置按键
	        return element;
	    }
	    
	    public static WebElement AllotState(WebDriver driver){
	        element = driver.findElement(By.id("assignStatus"));//查询条件-分配状态
	        return element;
	    }
	    
	    public static WebElement App(WebDriver driver){
	        element = driver.findElement(By.name("id"));//查询条件-工单编号
	        return element;
	    }
	    
	    public static WebElement Id(WebDriver driver){
	        element = driver.findElement(By.name("ids"));//勾选框
	        return element;
	    }
	    
	    public static WebElement Alloter(WebDriver driver){
	        element = driver.findElement(By.id("executorId"));//审核人筛选框
	        return element;
	    }
	    
	    public static WebElement Allot(WebDriver driver){
	        element = driver.findElement(By.xpath("//button[@onclick='validateAssign()']"));//调单分配
	        return element;
	    }
	    
	    public static WebElement Comfirm(WebDriver driver){
	        element = driver.findElement(By.xpath("(//button[@type='button'])[10]"));//调单分配确定按键
	        return element;
	    }
	    
	    public static WebElement Up(WebDriver driver){
	        element = driver.findElement(By.className("icon-arrow-up"));//向上按键
	        return element;
	    }
}
