package com.oc.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuditAllotPage_pos {
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
	    
	    public static WebElement Id(WebDriver driver){
	        element = driver.findElement(By.name("ids"));//勾选框
	        return element;
	    }
	    
	    public static WebElement Alloter(WebDriver driver){
	        element = driver.findElement(By.id("select2-drop-mask"));//审核人筛选框
	        return element;
	    }
	    
	    public static WebElement Input(WebDriver driver){
	        element = driver.findElement(By.className("select2-input"));//审核人输入框
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
	    
	    public static WebElement Up(WebDriver driver){
	        element = driver.findElement(By.className("icon-arrow-up"));//向上按键
	        return element;
	    }
}
