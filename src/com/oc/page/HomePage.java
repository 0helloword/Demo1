//系统主页面的菜单对象
package com.oc.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    
    private static WebElement element;
	
	
     public static WebElement AppQuery(WebDriver driver){
        element = driver.findElement(By.xpath("//li[3]/a/span"));//工单查询
        return element;
    }
    
    public static WebElement ManualAudit(WebDriver driver){
        element = driver.findElement(By.xpath("//li[4]/a/span"));//人工审核
        return element;
    }
    
    public static WebElement FirstAuditPos(WebDriver driver){
        element = driver.findElement(By.linkText("初步审核（POS）"));//初步审核pos
        return element;
    }
    
    public static WebElement AuditAllotPos(WebDriver driver){
        element = driver.findElement(By.linkText("审核分单（POS）"));//审核分单pos
        return element;
    }
    
    public static WebElement FirstAuditCash(WebDriver driver){
        element = driver.findElement(By.linkText("初步审核（CASH）"));//初步审核cash
        return element;
    }
    
    public static WebElement AuditAllotCash(WebDriver driver){
        element = driver.findElement(By.linkText("审核分单（CASH）"));//审核分单cash
        return element;
    }
    
    public static WebElement ExpertAudit(WebDriver driver){
        element = driver.findElement(By.xpath("//li[5]/a/span"));//专家审批
        return element;
    }
    
    public static WebElement ExpertAuditPos(WebDriver driver){
        element = driver.findElement(By.linkText("初步审批（POS）"));//初步审批pos
        return element;
    }
    
    public static WebElement ExpertAuditAllotPos(WebDriver driver){
        element = driver.findElement(By.linkText("审批分单（POS）"));//审批分单pos
        return element;
    }
    
    public static WebElement ExpertAuditCash(WebDriver driver){
        element = driver.findElement(By.linkText("初步审批（CASH）"));//初步审批cash
        return element;
    }
    
    public static WebElement ExpertAuditAllotCash(WebDriver driver){
        element = driver.findElement(By.linkText("审批分单（CASH）"));//审批分单cash
        return element;
    }
    
    public static WebElement CustInfo(WebDriver driver){
        element = driver.findElement(By.xpath("//li[6]/a/span"));//客户信息
        return element;
    }
    
    public static WebElement TeleRepertory(WebDriver driver){
        element = driver.findElement(By.linkText("电话仓库"));//电话仓库
        return element;
    }  
    
    public static WebElement LogOut(WebDriver driver){
        element = driver.findElement(By.className("icon-logout"));//退出登录
        return element;
    }  
}  
