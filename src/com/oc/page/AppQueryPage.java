package com.oc.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppQueryPage {

	    
	    private static WebElement element;
	    
	    public static WebElement QueryButton(WebDriver driver){
	        element = driver.findElement(By.cssSelector("button.btn.btn-primary"));//查询按键"btn btn-primary"
	        return element;
	    }
	 	    
	    public static WebElement ResetButton(WebDriver driver){
	        element = driver.findElement(By.cssSelector("button.btn.red-pink"));//重置按键
	        return element;
	    }
	    
	    public static WebElement AppId(WebDriver driver){
	        element = driver.findElement(By.id("idParam"));//查询条件-工单编号
	        return element;
	    }
	    
	    public static WebElement AppState(WebDriver driver){
	        element = driver.findElement(By.id("appState"));//查询条件-工单状态
	        return element;
	    }
	    
	    public static WebElement AppStateValue(WebDriver driver){
	        element = driver.findElement(By.className("label label-sm label-danger"));//查询结果工单状态列值
	        return element;
	    }

	    public static WebElement AppLoanType(WebDriver driver){
	        element = driver.findElement(By.id("loanType"));//查询条件-贷款类型
	        return element;
	    }
	    
	    public static WebElement App(WebDriver driver,String app){
	        element = driver.findElement(By.linkText(app));//工单详情链接
	        return element;
	    }
	
	    public static WebElement AppDtail(WebDriver driver){
	        element = driver.findElement(By.className("page-title"));//工单详情页面工单详情标题
	        return element;
	    }
	    
	    public static WebElement HetongZiliao(WebDriver driver){
	        element = driver.findElement(By.linkText("合同资料"));//合同资料
	        return element;
	    }
	    
	    public static WebElement XieshenXinxi(WebDriver driver){
	        element = driver.findElement(By.linkText("协审信息"));//协审信息
	        return element;
	    }
	    
	    public static WebElement ShangpinXinxi(WebDriver driver){
	        element = driver.findElement(By.linkText("商品信息"));//商品信息
	        return element;
	    }
	    
	    public static WebElement UpButton(WebDriver driver){
	        element = driver.findElement(By.className("icon-arrow-up"));//向上按键
	        return element;
	    }
	    
	    public static WebElement OpenButton(WebDriver driver){
	        element = driver.findElement(By.className("collapse"));//标题伸缩按键
	        return element;
	    }
	    
	    public static WebElement BackButton1(WebDriver driver){
	        element = driver.findElement(By.name("back"));//工单详情页面返回按键
	        return element;
	    }
	    
	    public static WebElement Check(WebDriver driver){
	        element = driver.findElement(By.linkText("查看"));//查看审核记录按键
	        return element;
	    }
	    
	    public static WebElement CheckLog(WebDriver driver){
	        element = driver.findElement(By.className("page-title"));//审核记录界面审核记录标题
	        return element;
	    }
	    
	    public static WebElement BackButton2(WebDriver driver){
	        element = driver.findElement(By.cssSelector("button.btn.grey-silver"));//审核记录界面返回按键
	        return element;
	    }
		}
	

